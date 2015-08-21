package fr.inria.diverse.puzzle.metrics.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.melange.MelangeStandaloneSetup;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.IndividualizationRatio;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.ProductRelatedReusability;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.PairwiseRelationshipRatio;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SemanticOverlapping;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SizeOfCommonality;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SyntactOverlapping;

public class ComputeMetricsActionImpl {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private static ComputeMetricsActionImpl instance;
	
	// -----------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------
	
	private ComputeMetricsActionImpl(){}
	
	public static ComputeMetricsActionImpl getInstance(){
		if(instance == null)
			instance = new ComputeMetricsActionImpl();
		return instance;
	}
	
	// -----------------------------------------------
	// Methods
	// -----------------------------------------------
	
	/**
	 * Computes the metrics defined in Mendez-Acuna et. al and generates the corresponding report in HTML. 
	 * @param selectedResource
	 * @return
	 * @throws IOException
	 * @throws CoreException
	 * @throws URISyntaxException
	 */
	public String computeMetrics(IResource selectedResource) throws IOException, CoreException, URISyntaxException{
		Injector injector = new MelangeStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createFileURI(selectedResource.getLocation().toString()));
		resource.load(resourceSet.getLoadOptions());
		
		ArrayList<EPackage> ePackages = new ArrayList<EPackage>();
		ArrayList<Language> languages = new ArrayList<Language>();
		
		ModelTypingSpace familyTypingSpace = (ModelTypingSpace) resource.getContents().get(0);
		for (Element element : familyTypingSpace.getElements()) {
			if(element instanceof Language){
				Language language = (Language)element;
				languages.add(language);
				EPackage currentMetamodel = ModelUtils.loadEcoreResource(language.getSyntax().getEcoreUri());
				ePackages.add(currentMetamodel);
			}
		}
		
		String metrics = "Metrics calculated"; 
		
		IProject project = selectedResource.getProject();
		
		String generalMetricsString = "";
		generalMetricsString += SizeOfCommonality.getVariablesDeclaration(languages);
		generalMetricsString += ProductRelatedReusability.getVariablesDeclaration(languages);
		generalMetricsString += IndividualizationRatio.getVariablesDeclaration(languages);
		generalMetricsString += PairwiseRelationshipRatio.getVariablesDeclaration(languages);

		String generalMetricsWindowsString = "window.onload = function(){\n";
		generalMetricsWindowsString += SizeOfCommonality.getWindow();
		generalMetricsWindowsString += ProductRelatedReusability.getWindow();
		generalMetricsWindowsString += IndividualizationRatio.getWindow();
		generalMetricsWindowsString += PairwiseRelationshipRatio.getWindow(languages);
		generalMetricsWindowsString += "};";
		
		//Copying the java script libraries if they dont exist
		URL libFolderPath = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/libs");
		File libFolder = new File(FileLocator.resolve(libFolderPath).toURI());
        File projectFolder = new File(project.getLocation().toString());
        ProjectManagementServices.copyFolder(libFolder, projectFolder);
		
		File generalMetrics = new File(project.getLocation().toString() + "/lib/metrics.jsonp" );
		if(!generalMetrics.exists())
			generalMetrics.createNewFile();
		PrintWriter outMetrics = new PrintWriter( generalMetrics );
		outMetrics.print(generalMetricsString + "\n" + generalMetricsWindowsString);
		outMetrics.close();
		
		
		File syntacticVennData = new File(project.getLocation().toString() + "/libVenn/syntacticVennData.jsonp" );
		if(!syntacticVennData.exists())
			syntacticVennData.createNewFile();
		PrintWriter out = new PrintWriter( syntacticVennData );
        out.print(SyntactOverlapping.evaluate(languages));
        out.close();
        
        File semanticVennData = new File(project.getLocation().toString() + "/libVenn/semanticVennData.jsonp" );
		if(!semanticVennData.exists())
			semanticVennData.createNewFile();
		PrintWriter outSemanticVennData = new PrintWriter( semanticVennData );
		outSemanticVennData.print(SemanticOverlapping.evaluate(languages));
		outSemanticVennData.close();
        
        URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/analysis.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine;
        	currentLine = br.readLine();
        }
        content = content.replace("<!-- Coucou! REPLACE ME WITH THE CORRECT PATTERN -->", PairwiseRelationshipRatio.getTables(languages));
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/analysisReport.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();

		
		ProjectManagementServices.refreshProject(project);
		return metrics;
	}
}

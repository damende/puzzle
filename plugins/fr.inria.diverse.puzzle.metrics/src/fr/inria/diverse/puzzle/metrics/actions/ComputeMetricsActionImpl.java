package fr.inria.diverse.puzzle.metrics.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.IndividualizationRatio;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.ProductRelatedReusability;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.PairwiseRelationshipRatio;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.ReusabilityBenefit;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SemanticOverlapping;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SizeOfCommonality;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SyntactOverlapping;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.TotalAmountOfConcepts;

public class ComputeMetricsActionImpl {

	private static ComputeMetricsActionImpl instance;
	
	private ComputeMetricsActionImpl(){
		
	}
	
	public static ComputeMetricsActionImpl getInstance(){
		if(instance == null)
			instance = new ComputeMetricsActionImpl();
		return instance;
	}
	
	public String computeMetrics(ArrayList<IResource> selectedResources) throws IOException, CoreException, URISyntaxException{
		ArrayList<EPackage> ePackages = new ArrayList<EPackage>();
		for (IResource iResource : selectedResources) {
			IFile currentFile = (IFile) iResource;
			EPackage currentMetamodel = ModelUtils.loadEcoreFile(currentFile.getLocation().toString());
			ePackages.add(currentMetamodel);
		}
		
		String metrics = "Metrics calculated"; 
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject("fr.inria.diverse.sle.examples.family");
		
		String generalMetricsString = "";
		generalMetricsString += SizeOfCommonality.getVariablesDeclaration(ePackages);
		generalMetricsString += ProductRelatedReusability.getVariablesDeclaration(ePackages);
		generalMetricsString += IndividualizationRatio.getVariablesDeclaration(ePackages);
		generalMetricsString += PairwiseRelationshipRatio.getVariablesDeclaration(ePackages);

		String generalMetricsWindowsString = "window.onload = function(){\n";
		generalMetricsWindowsString += SizeOfCommonality.getWindow();
		generalMetricsWindowsString += ProductRelatedReusability.getWindow();
		generalMetricsWindowsString += IndividualizationRatio.getWindow();
		generalMetricsWindowsString += PairwiseRelationshipRatio.getWindow(ePackages);
		generalMetricsWindowsString += "};";
		
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
        out.print(SyntactOverlapping.evaluate(ePackages));
        out.close();
        
        File semanticVennData = new File(project.getLocation().toString() + "/libVenn/semanticVennData.jsonp" );
		if(!semanticVennData.exists())
			semanticVennData.createNewFile();
		PrintWriter outSemanticVennData = new PrintWriter( semanticVennData );
		outSemanticVennData.print(SemanticOverlapping.evaluate(ePackages));
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
        content = content.replace("<!-- Coucou! REPLACE ME WITH THE CORRECT PATTERN -->", PairwiseRelationshipRatio.getTables(ePackages));
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

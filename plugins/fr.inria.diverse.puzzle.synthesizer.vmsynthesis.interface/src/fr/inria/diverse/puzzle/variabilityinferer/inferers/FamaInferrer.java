package fr.inria.diverse.puzzle.variabilityinferer.inferers;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import vm.BinaryExpression;
import vm.BinaryOperator;
import vm.LanguageConstraint;
import vm.LanguageFeature;
import vm.LanguageFeatureRef;
import vm.LanguageProductLine;
import vm.VmFactory;
import es.us.isa.FAMA.models.FAMAfeatureModel.FAMAFeatureModel;
import fama.synthesizer.facade.FamaSynthesizer;
import fr.inria.diverse.graph.Arc;
import fr.inria.diverse.graph.Graph;
import fr.inria.diverse.graph.Vertex;
import fr.inria.diverse.k3.sle.common.commands.FeaturesModelInference;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.variabilityinferer.auxiliar.FromFAMAToLanguageFeatureModel;
import fr.inria.diverse.puzzle.variabilityinferer.auxiliar.PCMsGenerator;

/**
 * Implementation of a feature model inferrer that uses the synthesis provided by FAMA.
 * @author David Mendez-Acuna
 *
 */
public class FamaInferrer implements FeaturesModelInference{

	// --------------------------------------------------------
	// Interface methods
	// --------------------------------------------------------
	
	@Override
	public LanguageProductLine inferOpenFeaturesModel(IProject targetProject, SynthesisProperties properties,
			ArrayList<Language> languages, EcoreGraph modularizationGraph, Graph<Vertex, Arc> dependenciesGraph) throws Exception {
		String PCM = PCMsGenerator.getInstance().generatePCM(properties, languages, modularizationGraph, PCMsGenerator.FAMA_FORMAT);
		
		File fileReport = new File(targetProject.getLocation().toString()
				+ "/pcm.csv");
		if (!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter(fileReport);
		outRileReport.print(PCM);
		outRileReport.close();
		
		String inputFile = targetProject.getLocation().toString()
				+ "/pcm.csv";
		String outputFile = targetProject.getLocation().toString()
				+ "/variabilityModel.xml";
		
		FAMAFeatureModel famafm = FamaSynthesizer.getInstance().synthesizeFeatureModelFromPCM(inputFile, outputFile);
		LanguageProductLine fm = FromFAMAToLanguageFeatureModel.getInstance().fromFAMAFeatureModelToFeatureModel(famafm);
		this.createTechnologicalConstraints(fm, dependenciesGraph);
		return fm;
	}

	@Override
	public LanguageProductLine inferClosedFeaturesModel(IProject targetProject,
			SynthesisProperties properties, ArrayList<Language> languages,
			EcoreGraph modularizationGraph, LanguageProductLine openFeaturesModel) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	// --------------------------------------------------------
	// Auxiliary methods
	// --------------------------------------------------------
	
	/**
	 * Creates the constraints corresponding to the dependencies between language modules.
	 * @param fm. The feature model that will be enhanced with the technological constraints.
	 * @param modularizationGraph. The modularization graph that is used to obtain the technological constraints.
	 */
	private void createTechnologicalConstraints(LanguageProductLine fm,
			Graph<Vertex, Arc> dependenciesGraph) {
		
		for (Arc arc : dependenciesGraph.getArcs()) {
			LanguageConstraint constraint = VmFactory.eINSTANCE.createLanguageConstraint();
			BinaryExpression expression = VmFactory.eINSTANCE.createBinaryExpression();
			
			LanguageFeatureRef originRef = VmFactory.eINSTANCE.createLanguageFeatureRef();
			originRef.setRef(this.getLanguageFeatureByName(arc.getFrom().getIdentifier(), fm.getFunctionalVariability().getRootFeature()));

			LanguageFeatureRef destinationRef = VmFactory.eINSTANCE.createLanguageFeatureRef();
			destinationRef.setRef(this.getLanguageFeatureByName(arc.getTo().getIdentifier(), fm.getFunctionalVariability().getRootFeature()));

			expression.setLeft(originRef);
			expression.setRight(destinationRef);
			expression.setOperator(BinaryOperator.IMPLIES);
			constraint.setExpression(expression);
			constraint.setName(originRef.getRef().getName() + " => " + destinationRef.getRef().getName());
			fm.getFunctionalVariability().getConstraints().add(constraint);
		}
	}
	
	/**
	 * Finds a LanguageFeature by the name in the features model in the parameter.
	 * @param featureName. Name of the feature.
	 * @param featuresModelRoot. Root of the features model where the feature should be searched. 
	 * @return
	 */
	private LanguageFeature getLanguageFeatureByName(String featureName, LanguageFeature featureModelRoot) {
		if(featureModelRoot.getName().equals(featureName)){
			return featureModelRoot;
		}
		for (LanguageFeature feature : featureModelRoot.getChildren()) {
			LanguageFeature found = this.getLanguageFeatureByName(featureName, feature);
			if(found != null)
				return found;
		}
		return null;
	}
}

package fr.inria.diverse.puzzle.variabilityinferer;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import PuzzleADL.LanguageArchitecture;
import PuzzleADL.LanguageModule;
import PuzzleADL.SemanticsImplementation;
import vm.LanguageFeature;
import vm.LanguageProductLine;
import vm.OrthogonalVariabilityModel;
import vm.SemanticInterpretation;
import vm.SemanticVariationPoint;
import vm.VmFactory;
import fr.inria.diverse.graph.Arc;
import fr.inria.diverse.graph.Graph;
import fr.inria.diverse.graph.Vertex;
import fr.inria.diverse.k3.sle.common.commands.FeaturesModelInference;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGroup;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Delegator for variability models inference.
 * @author David Mendez-Acuna
 */
public class VariabilityInfererManager {

	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------

	private static VariabilityInfererManager instance;

	// --------------------------------------------------
	// Constructor and singleton
	// --------------------------------------------------

	private VariabilityInfererManager() {

	}

	public static VariabilityInfererManager getInstance() {
		if (instance == null) {
			instance = new VariabilityInfererManager();
		}
		return instance;
	}

	// --------------------------------------------------
	// Methods
	// --------------------------------------------------

	/**
	 * Synthesizes and returns the open features model. 
	 * @param synthesisProperties
	 * @param languages
	 * @param modularizationGraph
	 * @param dependenciesGraph
	 * @param project
	 * @param languageArchitectureModel 
	 * @throws Exception
	 */
	public LanguageProductLine synthesizeOpenFeaturesModel(SynthesisProperties synthesisProperties,
			ArrayList<Language> languages, EcoreGraph modularizationGraph, Graph<Vertex, Arc> dependenciesGraph,
			IProject project, LanguageArchitecture languageArchitectureModel) throws Exception {
		
		FeaturesModelInference inferrer = synthesisProperties
				.getVariabilityInferer();
		
		LanguageProductLine openFeaturesModel = inferrer.inferOpenFeaturesModel(project, 
				synthesisProperties, languages, modularizationGraph, dependenciesGraph);

		this.addModulesInformation(openFeaturesModel, modularizationGraph, languageArchitectureModel);
		this.addOrthogonalVariabitilityInformation(openFeaturesModel, modularizationGraph, languageArchitectureModel);
		
		return openFeaturesModel;
	}

	/**
	 * Completes the feature model in the parameter with the information of the language modules
	 * 	i.e., the implementation of the language features.
	 * @param featureModel
	 * @param modularizationGraph
	 * @param languageArchitectureModel 
	 */
	private void addModulesInformation(LanguageProductLine featureModel,
			EcoreGraph modularizationGraph, LanguageArchitecture languageArchitectureModel) {
		this.findLanguageModule(featureModel.getFunctionalVariability().getRootFeature(), modularizationGraph, languageArchitectureModel);
	}

	/**
	 * Finds and complete a feature with the information of its implementation i.e., the language module. 
	 * Then, it advances in the features tree by invoking this method recursively. 
	 * @param rootFeature
	 * @param modularizationGraph
	 * @param languageArchitectureModel 
	 */
	private void findLanguageModule(LanguageFeature rootFeature,
			EcoreGraph modularizationGraph, LanguageArchitecture languageArchitectureModel) {
		
		EcoreGroup ecoreGroup = modularizationGraph.getGroupByDependenciesGraphName(rootFeature.getName());
		if(ecoreGroup != null){
			LanguageModule languageModule = this.getLanguageModuleByEcoreGroup(languageArchitectureModel, ecoreGroup);
			rootFeature.setImplementationModule(languageModule);
		}
		
		// Recursion
		for(LanguageFeature child : rootFeature.getChildren()){
			this.findLanguageModule(child, modularizationGraph, languageArchitectureModel);
		}
	}

	/**
	 * Returns the language module created for the ecore group in the parameter. 
	 * @param languageArchitectureModel 
	 * @param group
	 * @return
	 */
	private LanguageModule getLanguageModuleByEcoreGroup(LanguageArchitecture languageArchitectureModel, EcoreGroup group) {
		for (LanguageModule module : languageArchitectureModel.getLanguageModules()) {
			if(module.getName().equals(group.getName()))
				return module;
		}
		return null;
	}
	
	/**
	 * Completes the feature model in the parameter with the information of the orthogonal variability 
	 * 	i.e., the semantic variability.
	 * @param featureModel
	 * @param modularizationGraph
	 * @param languageArchitectureModel 
	 */
	private void addOrthogonalVariabitilityInformation(
			LanguageProductLine openFeaturesModel,
			EcoreGraph modularizationGraph,
			LanguageArchitecture languageArchitectureModel) {
		
		OrthogonalVariabilityModel orthogonalVm = VmFactory.eINSTANCE.createOrthogonalVariabilityModel();
		for (LanguageModule languageModule : languageArchitectureModel.getLanguageModules()) {
			if(languageModule.getSemanticsImplementation().size() > 1){
				SemanticVariationPoint vp = VmFactory.eINSTANCE.createSemanticVariationPoint();
				LanguageFeature feature = this.findLanguageFeatureByModule(openFeaturesModel.getFunctionalVariability().getRootFeature(),
						languageModule);
				vp.setFeature(feature);
				for (SemanticsImplementation impl : languageModule.getSemanticsImplementation()) {
					SemanticInterpretation interp = VmFactory.eINSTANCE.createSemanticInterpretation();
					interp.setImplementation(impl);
					vp.getInterpretations().add(interp);
				}
				orthogonalVm.getSemanticVariationPoints().add(vp);
			}
		}
		openFeaturesModel.setSemanticalVariability(orthogonalVm);
	}
	
	/**
	 * Returns the language feature that represents the language module in the parameter.
	 * @param openFeaturesModel
	 * @param languageModule
	 * @return
	 */
	private LanguageFeature findLanguageFeatureByModule(
			LanguageFeature rootFeature, LanguageModule languageModule) {
		if(rootFeature.getImplementationModule() != null && rootFeature.getImplementationModule().equals(languageModule))
			return rootFeature;
		for (LanguageFeature child : rootFeature.getChildren()){
			LanguageFeature found = this.findLanguageFeatureByModule(child, languageModule);
			if(found != null)
				return found;
			
		}
		return null;
	}

	/**
	 * Synthesizes and returns the closed features model.
	 * @param synthesisProperties
	 * @param languages
	 * @param modularizationGraph
	 * @param dependenciesGraph
	 * @param project
	 * @param openFeaturesModel
	 * @return
	 * @throws Exception
	 */
	public LanguageProductLine synthesizeClosedFeaturesModel(
			SynthesisProperties synthesisProperties, ArrayList<Language> languages,
			EcoreGraph modularizationGraph, DependencyGraph dependenciesGraph,
			IProject project, LanguageProductLine openFeaturesModel) throws Exception {
		
		FeaturesModelInference inferrer = synthesisProperties
				.getVariabilityInferer();
		
		LanguageProductLine closedFeaturesModel = inferrer.inferClosedFeaturesModel(
				project, synthesisProperties, languages, modularizationGraph, openFeaturesModel);

		return closedFeaturesModel;
	}
}
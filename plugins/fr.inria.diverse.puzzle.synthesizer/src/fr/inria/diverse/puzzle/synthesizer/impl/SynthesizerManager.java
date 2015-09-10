package fr.inria.diverse.puzzle.synthesizer.impl;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import vm.PFeatureModel;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.breaker.popup.actions.SynthesisManager;
import fr.inria.diverse.puzzle.metrics.managers.ProductLinesMetricManager;
import fr.inria.diverse.puzzle.variabilityinferer.VariabilityInfererManager;

public class SynthesizerManager {

	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private static SynthesizerManager instance;
	
	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------
	
	private SynthesizerManager(){
		
	}
	
	public static SynthesizerManager getInstance(){
		if(instance == null)
			instance = new SynthesizerManager();
		return instance;
	}
	
	// ----------------------------------------------------------
	// Methods
	// ----------------------------------------------------------
	
	public void synthesizeLanguageProductLine(SynthesisProperties properties, ArrayList<Language> languages, IProject project) throws Exception{
		ProductLinesMetricManager metricsManager = new ProductLinesMetricManager(project);
		
		// Step 1.1: Break-down the family
		EcoreGraph modularizationGraph = SynthesisManager.getInstance().breakDownFamily(languages, properties, project);
		metricsManager.createProductLineCouplingReport(languages);
		metricsManager.createProductLineCouplingReportData(languages, properties.getConceptComparisonOperator(), 
				properties.getMethodComparisonOperator(), modularizationGraph);
		
		
		// Step 1.2: Compute the dependencies graph.
		DependencyGraph dependenciesGraph = new DependencyGraph(modularizationGraph);
		
		// Step 2.1: Synthesize variability model
		PFeatureModel openFeaturesModel = VariabilityInfererManager.getInstance().synthesizeOpenFeaturesModel(
				properties, languages, modularizationGraph, dependenciesGraph, project);
		ModelUtils.saveXMIFile(openFeaturesModel, project.getLocation() + "/openFM.vm");
		

		// Step 4: Refresh the product line project. 
		ProjectManagementServices.refreshProject(project);
	}
}
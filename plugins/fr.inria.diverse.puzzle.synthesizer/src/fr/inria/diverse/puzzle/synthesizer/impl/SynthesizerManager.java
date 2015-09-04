package fr.inria.diverse.puzzle.synthesizer.impl;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.commands.VariabilityInferer;
import fr.inria.diverse.k3.sle.common.comparisonOperators.DeepConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingMethodComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.SignatureMethodComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.SignatureAndSourceMethodComparison;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.breaker.popup.actions.SynthesisManager;
import fr.inria.diverse.puzzle.variabilityinferer.VariabilityInfererManager;
import fr.inria.diverse.puzzle.variabilityinferer.inferers.DiverSEInferrer;

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
	
	public void synthesizeLanguageProductLine(ArrayList<Language> languages, IProject project) throws Exception{
		SynthesisProperties properties = this.getSynthesisProperties();
		
		// Step 1. Break-down the family
		EcoreGraph modularizationGraph = SynthesisManager.getInstance().breakDownFamily(languages, properties, project);
		
		// Step 2: Synthesize variability model
		VariabilityInfererManager.getInstance().synthesizeVariabilityModel(properties, languages, modularizationGraph, project);
	}
	
	private SynthesisProperties getSynthesisProperties(){
//		ConceptComparison conceptComparisonOperator = new NamingConceptComparison();
		ConceptComparison conceptComparisonOperator = new DeepConceptComparison();
		
//		MethodComparison methodComparisonOperator = new NamingMethodComparison();
//		MethodComparison methodComparisonOperator = new SignatureMethodComparison();
		MethodComparison methodComparisonOperator = SignatureAndSourceMethodComparison.getInstance();
		
		VariabilityInferer variabilityInferer = new DiverSEInferrer();
		
		SynthesisProperties properties = new SynthesisProperties(conceptComparisonOperator, methodComparisonOperator, variabilityInferer);
		return properties;
	}
}

package fr.inria.diverse.puzzle.variabilityinferer.inferers;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import vm.PFeatureModel;
import fr.inria.diverse.k3.sle.common.commands.FeaturesModelInference;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.variabilityinferer.auxiliar.PCMsGenerator;
import fr.inria.diverse.puzzle.vmsynthesis.impl.VmSynthesis;

public class PuzzleInferrer implements FeaturesModelInference{

	@Override
	public PFeatureModel inferOpenFeaturesModel(IProject targetProject, SynthesisProperties properties, 
			ArrayList<Language> languages, EcoreGraph modularizationGraph, DependencyGraph dependenciesGraph) throws Exception{
		String PCM = PCMsGenerator.getInstance().generatePCM(properties, languages, modularizationGraph, PCMsGenerator.OPEN_COMPARE_FORMAT);
		return VmSynthesis.getInstance().synthesizeFeatureModel(PCM, dependenciesGraph);
	}

	@Override
	public PFeatureModel inferClosedFeaturesModel(IProject targetProject,
			SynthesisProperties properties, ArrayList<Language> languages,
			EcoreGraph modularizationGraph) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
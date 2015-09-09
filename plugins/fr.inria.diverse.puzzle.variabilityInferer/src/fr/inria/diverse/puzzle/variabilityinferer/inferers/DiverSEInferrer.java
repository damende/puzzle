package fr.inria.diverse.puzzle.variabilityinferer.inferers;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import fr.inria.diverse.k3.sle.common.commands.VariabilityInferer;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.ksynthesis.ksynthesis.facade.KSynthesisSynthesizer;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.variabilityinferer.auxiliar.PCMsGenerator;

public class DiverSEInferrer implements VariabilityInferer {

	@Override
	public String inferVariabilityModel(IProject targetProject, SynthesisProperties properties, ArrayList<Language> languages, EcoreGraph modularizationGraph) throws Exception {
		String PCM = PCMsGenerator.getInstance().generatePCM(properties, languages, modularizationGraph, PCMsGenerator.OPEN_COMPARE_FORMAT);
		
		File fileReport = new File(targetProject.getLocation().toString()
				+ "/pcm.csv");
		if (!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter(fileReport);
		outRileReport.print(PCM);
		outRileReport.close();
		
		KSynthesisSynthesizer.getInstance().synthesizeFeatureModelFromPCM(targetProject.getLocation().toString()
				+ "/pcm.csv", targetProject.getLocation().toString() + "/vm.xml");
		
		return "";
	}
}
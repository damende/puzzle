package fr.inria.diverse.puzzle.variabilityinferer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;

import fr.inria.diverse.k3.sle.common.commands.VariabilityInferer;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;

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

	public void synthesizeVariabilityModel(
			SynthesisProperties synthesisProperties,
			ArrayList<Language> languages, EcoreGraph modularizationGraph,
			IProject project) throws Exception {
		VariabilityInferer inferrer = synthesisProperties
				.getVariabilityInferer();
		String variabilityModel = inferrer.inferVariabilityModel(
				synthesisProperties, languages, modularizationGraph);

		File fileReport = new File(project.getLocation().toString()
				+ "/pcm.csv");
		if (!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter(fileReport);
		outRileReport.print(variabilityModel);
		outRileReport.close();
		
		ProjectManagementServices.refreshProject(project);
		// TODO serialize the model
	}
}
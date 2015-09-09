package fr.inria.diverse.k3.sle.common.commands;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Contract for the variability inferrer command. 
 * @author David Mendez-Acuna
 */
public interface VariabilityInferer {

	public String inferVariabilityModel(IProject targetProject, SynthesisProperties properties, ArrayList<Language> languages, EcoreGraph modularizationGraph) throws Exception;
}
package fr.inria.diverse.k3.sle.common.commands;

import java.util.ArrayList;

import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Interface specifying the behavior for variability models inference for language product lines.
 * @author David Mendez-Acuna
 */
public interface VariabilityInferer {

	public String inferVariabilityModel(SynthesisProperties properties, ArrayList<Language> languages, EcoreGraph modularizationGraph);
}

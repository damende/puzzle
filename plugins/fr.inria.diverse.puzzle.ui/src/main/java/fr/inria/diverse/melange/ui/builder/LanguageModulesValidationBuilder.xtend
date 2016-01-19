package fr.inria.diverse.melange.ui.builder

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.puzzle.metrics.actions.ComputeMetricsActionImpl
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
class LanguageModulesValidationBuilder extends AbstractBuilder {
	
	def void validateLanguageModulesComposability(Resource res, IProject project, IProgressMonitor monitor) {
		println('coucou!! validateLanguageModulesComposability')
//		val root = res.contents.head as ModelTypingSpace
//		var SynthesisProperties properties = this.synthesisProperties
//		ComputeMetricsActionImpl.instance.computeMetrics(properties, root, project);
	}
}
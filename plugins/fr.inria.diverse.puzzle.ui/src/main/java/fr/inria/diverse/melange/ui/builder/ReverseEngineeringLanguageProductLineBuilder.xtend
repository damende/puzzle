package fr.inria.diverse.melange.ui.builder

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.ArrayList
import fr.inria.diverse.melange.metamodel.melange.Element
import fr.inria.diverse.puzzle.synthesizer.impl.SynthesizerManager
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties

/**
 * Builder for the action: Synthesize Language Product Line (LPL).
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
class ReverseEngineeringLanguageProductLineBuilder extends AbstractBuilder
{
	/**
	 * Synthesizes a language product line from the family of DSLs described in the resource.
	 */
	def void reverseEngineeringLanguageProductLine(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		var ArrayList<Language> languages = new ArrayList<Language>()
		
		for(Element element : root.elements){
			if(element instanceof Language)
				languages.add(element as Language);
		}
		
		// Create a module that contains the modeling-in-the large artifacts as well as the metrics. 
		var IProject lplProject = ProjectManagementServices.createEclipseProject("fr.inria.diverse.puzzle.reverseEngineering");
		var SynthesisProperties properties = this.synthesisProperties
		
		SynthesizerManager.instance.synthesizeLanguageProductLine(properties, languages, lplProject)
		ProjectManagementServices.refreshProject(lplProject)
	}
}
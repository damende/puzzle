package fr.inria.diverse.melange.ui.builder

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.puzzle.adl.language.puzzle.LanguageBinding
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.k3.sle.common.utils.ModelUtils
import org.eclipse.emf.ecore.EPackage
import fr.inria.diverse.puzzle.validator.command.ValidatorImpl

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
class LanguageModulesValidationBuilder extends AbstractBuilder {
	
	def void validateLanguageModulesComposability(Resource puzzleResource, Resource melangeResource, IProject project, IProgressMonitor monitor) {
		val bindingSpace = puzzleResource.contents.head as LanguageBinding
		val modelTypingSpace = melangeResource.contents.head as ModelTypingSpace
		
		println('bindingSpace: ' + bindingSpace)
		println('modelTypingSpace: ' + modelTypingSpace)
		
		// Obtaining required and provided interfaces for each binding
		bindingSpace.binding.forEach[ binding |
			
			val requiredModelTypeName = binding.right
			val providedModelTypeName = binding.left
			
			val ModelType requiredModelType = modelTypingSpace.elements.findFirst[ element |
				element instanceof ModelType && (element as ModelType).name.equals(requiredModelTypeName)] as ModelType
			
			val ModelType providedModelType = modelTypingSpace.elements.findFirst[ element |
				element instanceof ModelType && (element as ModelType).name.equals(providedModelTypeName)] as ModelType
				
			val EPackage requiredEPackage = ModelUtils.loadEcoreResource(requiredModelType.ecoreUri)
			val EPackage providedEPackage = ModelUtils.loadEcoreResource(providedModelType.ecoreUri)
			
			println('requiredEPackage: ' + requiredEPackage)
			println('providedEPackage: ' + providedEPackage)
			
			ValidatorImpl.instance.checkCompatibility(requiredEPackage, providedEPackage,null)
		]
		
	}
}
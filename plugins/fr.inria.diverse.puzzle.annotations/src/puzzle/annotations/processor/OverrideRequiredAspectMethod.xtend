package puzzle.annotations.processor

import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.AbstractMethodProcessor
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.RegisterGlobalsContext
import org.eclipse.xtend.lib.macro.declaration.MethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.TypeReference
import org.eclipse.xtend.lib.macro.declaration.TypeDeclaration

@Active(OverrideRequiredAspectMethodProcessor)
annotation OverrideRequiredAspectMethod { }

class OverrideRequiredAspectMethodProcessor extends AbstractMethodProcessor {
	
	override doRegisterGlobals(MethodDeclaration annotatedMethod, 
		RegisterGlobalsContext context){
	}
	
	override doTransform(MutableMethodDeclaration annotatedMethod, 
		TransformationContext transformationContext){
		
		if(annotatedMethod.declaringType.findDeclaredField("_requiredSuper") == null){
			annotatedMethod.declaringType.addField("_requiredSuper")[
				type = Helper::getAnnotationAspectType(annotatedMethod.declaringType)
				static = true
			]
		}
		
		if(annotatedMethod.declaringType.findDeclaredMethod("_original_") == null){
			
			if(annotatedMethod.returnType == null){
				annotatedMethod.declaringType.addMethod('_original_' + annotatedMethod.simpleName)[
				abstract = annotatedMethod.abstract
				static = annotatedMethod.static
				returnType = annotatedMethod.returnType
				
				body = ['''
						// Required method *.*
					''']
				
				annotatedMethod.parameters.forEach[_annotatedMethodParam |
					addParameter(_annotatedMethodParam.simpleName, _annotatedMethodParam.type)]
				]
			}
			
			else if(annotatedMethod.returnType.name.equalsIgnoreCase("void")){
				annotatedMethod.declaringType.addMethod('_original_' + annotatedMethod.simpleName)[
				abstract = annotatedMethod.abstract
				static = annotatedMethod.static
				returnType = annotatedMethod.returnType
				
				body = ['''
						// Required method *.*
					''']
				
				annotatedMethod.parameters.forEach[_annotatedMethodParam |
					addParameter(_annotatedMethodParam.simpleName, _annotatedMethodParam.type)]
				]
			}
			
			else if(annotatedMethod.returnType.name.equals("boolean")){
				annotatedMethod.declaringType.addMethod('_original_' + annotatedMethod.simpleName)[
				abstract = annotatedMethod.abstract
				static = annotatedMethod.static
				returnType = annotatedMethod.returnType
				
				body = ['''
						// Required method *.*
						return false;
					''']
				
				annotatedMethod.parameters.forEach[_annotatedMethodParam |
					addParameter(_annotatedMethodParam.simpleName, _annotatedMethodParam.type)]
				]
			}
			
			else if(annotatedMethod.returnType.name.equals("int") || annotatedMethod.returnType.name.equals("double")
				|| annotatedMethod.returnType.name.equals("real") || annotatedMethod.returnType.name.equals("char")
			){
				annotatedMethod.declaringType.addMethod('_original_' + annotatedMethod.simpleName)[
				abstract = annotatedMethod.abstract
				static = annotatedMethod.static
				returnType = annotatedMethod.returnType
				
				body = ['''
						// Required method *.*
						return 0;
					''']
				
				annotatedMethod.parameters.forEach[_annotatedMethodParam |
					addParameter(_annotatedMethodParam.simpleName, _annotatedMethodParam.type)]
				]
			}
			
			else{
				annotatedMethod.declaringType.addMethod('_original_' + annotatedMethod.simpleName)[
				abstract = annotatedMethod.abstract
				static = annotatedMethod.static
				returnType = annotatedMethod.returnType
				
				body = ['''
						// Required method *.*
						return null;
					''']
				
				annotatedMethod.parameters.forEach[_annotatedMethodParam |
					addParameter(_annotatedMethodParam.simpleName, _annotatedMethodParam.type)]
				]
			}
		}
	}
}

/**
 * A tool class with useful services 
 */ 
abstract class Helper {
	
	/** The name of the parameter 'className' of the annotation aspect. */
	public static val String annotationName = "className"
	
	/** Returns the annotation type of the class in the parameter */
	static def TypeReference getAnnotationAspectType(TypeDeclaration cl) {
		if(cl===null || cl.annotations===null) return null;
		try{
			val annot = cl.annotations.findFirst[getClassValue(annotationName) !== null]
			if(annot===null) return null
			return annot.getClassValue(annotationName)
		}catch(NullPointerException ex){ return null }
	}
	
}
package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable

@Aspect(className=Logo.VarReference)
public class VarReferenceAspect extends ExpressionAspect {

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		var Hashtable<String, Object> variablesTable = context.get('variables') as Hashtable<String, Object>
		return variablesTable.get(_self.ref.name)
	}
} 
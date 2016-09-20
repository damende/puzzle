package semanticsLogoBinaryExpressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
 
import java.util.Hashtable
import BinaryExpressions.BooleanExpr
import BinaryExpressions.BooleanOperator

@Aspect(className=BooleanExpr)
public class BooleanExprAspect extends BinaryExprAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		if(_self.operator == BooleanOperator.EQUAL){
			return (_self.leftExpr.eval(context) as Integer).intValue == (_self.rightExpr.eval(context) as Integer).intValue
		}
		else if(_self.operator == BooleanOperator.DIFF){
			return (_self.leftExpr.eval(context) as Integer).intValue != (_self.rightExpr.eval(context) as Integer).intValue
		}
		else 
			return null
	}
}
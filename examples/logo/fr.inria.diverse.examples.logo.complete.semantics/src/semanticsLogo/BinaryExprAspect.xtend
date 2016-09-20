package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import Logo.BinaryExpr

@Aspect(className=BinaryExpr)
public class BinaryExprAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		if(_self.operator == Logo.BinaryOperator.PLUS){
			return (_self.leftExpr.eval(context) as Integer).intValue + (_self.rightExpr.eval(context) as Integer).intValue
		}
		else if(_self.operator == Logo.BinaryOperator.MINUS){
			return (_self.leftExpr.eval(context) as Integer).intValue - (_self.rightExpr.eval(context) as Integer).intValue
		}
		else if(_self.operator == Logo.BinaryOperator.MULT){
			return (_self.leftExpr.eval(context) as Integer).intValue * (_self.rightExpr.eval(context) as Integer).intValue
		}
		else if(_self.operator == Logo.BinaryOperator.DIV){
			return (_self.leftExpr.eval(context) as Integer).intValue / (_self.rightExpr.eval(context) as Integer).intValue
		}
		else if(_self.operator == Logo.BinaryOperator.EQUAL){
			return _self.leftExpr.eval(context).equals(_self.rightExpr.eval(context))
		}
		else if(_self.operator == Logo.BinaryOperator.DIFF){
			return !_self.leftExpr.eval(context).equals(_self.rightExpr.eval(context))
		}
//		else if(_self.operator == Logo.BinaryOperator.GREATER_THAN){
//			return _self.leftExpr.eval(context).(_self.rightExpr.eval(context))
//		}
		else 
			return null
	}
}
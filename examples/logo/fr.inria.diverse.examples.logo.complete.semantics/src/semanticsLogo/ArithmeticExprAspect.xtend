package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import Logo.ArithmeticExpr
import Logo.ArithmeticOperator

@Aspect(className=ArithmeticExpr)
public class ArithmeticExprAspect extends BinaryExprAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		if(_self.operator == ArithmeticOperator.PLUS){
			return (_self.leftExpr.eval(context) as Integer).intValue + (_self.rightExpr.eval(context) as Integer).intValue
		}
		else if(_self.operator == ArithmeticOperator.MINUS){
			return (_self.leftExpr.eval(context) as Integer).intValue - (_self.rightExpr.eval(context) as Integer).intValue
		}
		else if(_self.operator == ArithmeticOperator.MULT){
			return (_self.leftExpr.eval(context) as Integer).intValue * (_self.rightExpr.eval(context) as Integer).intValue
		}
		else if(_self.operator == ArithmeticOperator.DIV){
			return (_self.leftExpr.eval(context) as Integer).intValue / (_self.rightExpr.eval(context) as Integer).intValue
		}
		else 
			return null
	}
}
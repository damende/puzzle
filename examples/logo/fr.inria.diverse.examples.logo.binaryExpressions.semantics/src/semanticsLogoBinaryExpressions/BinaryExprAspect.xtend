package semanticsLogoBinaryExpressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import BinaryExpressions.BinaryExpr
import BinaryExpressions.ArithmeticExpr
import BinaryExpressions.BooleanExpr

import static extension semanticsLogoBinaryExpressions.ArithmeticExprAspect.*
import static extension semanticsLogoBinaryExpressions.BooleanExprAspect.*


@Aspect(className=BinaryExpr)
public class BinaryExprAspect {

	def Object eval (Hashtable<String, Object> context) {
		if(_self instanceof ArithmeticExpr){
			var ArithmeticExpr _expr = _self as ArithmeticExpr
			return _expr.eval(context)
		}
		else if(_self instanceof BooleanExpr){
			var BooleanExpr _expr = _self as BooleanExpr
			return _expr.eval(context)
		}
		else 
			return null
	}
}
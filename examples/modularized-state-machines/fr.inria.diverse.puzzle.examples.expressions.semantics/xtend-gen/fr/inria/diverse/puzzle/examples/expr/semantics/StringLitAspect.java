package fr.inria.diverse.puzzle.examples.expr.semantics;

import ExpressionPck.StringLit;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspect;
import fr.inria.diverse.puzzle.examples.expr.semantics.StringLitAspectStringLitAspectProperties;
import java.util.Hashtable;

@Aspect(className = StringLit.class)
@SuppressWarnings("all")
public class StringLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final StringLit _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expr.semantics.StringLitAspectStringLitAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expr.semantics.StringLitAspectStringLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionPck.StringLit){
    result = fr.inria.diverse.puzzle.examples.expr.semantics.StringLitAspect._privk3_eval(_self_, (ExpressionPck.StringLit)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final StringLit _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspectLiteralAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringLitAspectStringLitAspectProperties _self_, final StringLit _self, final Hashtable<String, Object> context) {
    return _self.getValue();
  }
}
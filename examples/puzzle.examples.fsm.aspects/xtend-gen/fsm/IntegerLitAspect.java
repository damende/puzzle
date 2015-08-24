package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.IntegerLit;
import fsm.IntegerLitAspectIntegerLitAspectProperties;
import fsm.LiteralAspect;
import java.util.Hashtable;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    fsm.IntegerLitAspectIntegerLitAspectProperties _self_ = fsm.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fsm.IntegerLit){
    result = fsm.IntegerLitAspect._privk3_eval(_self_, (fsm.IntegerLit)_self,context);
    } else  if (_self instanceof fsm.Literal){
    result = fsm.LiteralAspect.eval((fsm.Literal)_self,context);
    } else  if (_self instanceof fsm.Expression){
    result = fsm.ExpressionAspect.eval((fsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    fsm.LiteralAspectLiteralAspectProperties _self_ = fsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  fsm.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(_self.getValue());
  }
}
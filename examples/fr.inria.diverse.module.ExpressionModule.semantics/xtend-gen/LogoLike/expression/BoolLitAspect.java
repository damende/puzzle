package LogoLike.expression;

import ExpressionModule.BoolLit;
import LogoLike.expression.BoolLitAspectBoolLitAspectProperties;
import LogoLike.expression.LiteralAspect;
import commons.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Context context) {
    LogoLike.expression.BoolLitAspectBoolLitAspectProperties _self_ = LogoLike.expression.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Context context) {
    LogoLike.expression.LiteralAspectLiteralAspectProperties _self_ = LogoLike.expression.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  LogoLike.expression.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Context context) {
    return Boolean.valueOf(_self.isValue());
  }
}

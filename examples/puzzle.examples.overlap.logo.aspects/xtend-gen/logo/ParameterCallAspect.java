package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Parameter;
import kmLogo.ParameterCall;
import logo.Context;
import logo.ExpressionAspect;
import logo.ParameterAspect;
import logo.ParameterCallAspectParameterCallAspectProperties;

@Aspect(className = ParameterCall.class)
@SuppressWarnings("all")
public class ParameterCallAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final ParameterCall _self, final Context context) {
    logo.ParameterCallAspectParameterCallAspectProperties _self_ = logo.ParameterCallAspectParameterCallAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final ParameterCall _self, final Context context) {
    logo.ExpressionAspectExpressionAspectProperties _self_ = logo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  logo.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final ParameterCallAspectParameterCallAspectProperties _self_, final ParameterCall _self, final Context context) {
    Parameter _parameter = _self.getParameter();
    return Integer.valueOf(ParameterAspect.eval(_parameter, context));
  }
}
package Logo.logoprogram;

import Logo.Expression;
import Logo.Right;
import Logo.logoprogram.Context;
import Logo.logoprogram.PrimitiveAspect;
import Logo.logoprogram.RightAspectRightAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Right.class)
@SuppressWarnings("all")
public class RightAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Right _self, final Context context) {
    Logo.logoprogram.RightAspectRightAspectProperties _self_ = Logo.logoprogram.RightAspectRightAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Right _self, final Context context) {
    Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties _self_ = Logo.logoprogram.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  Logo.logoprogram.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final RightAspectRightAspectProperties _self_, final Right _self, final Context context) {
    Expression _angle = _self.getAngle();
    Object _eval = _angle.eval(context);
    int param = (((Integer) _eval)).intValue();
    InputOutput.<String>println(("RIGHT " + Integer.valueOf(param)));
    context.turtle.rotate(param);
    return 0;
  }
}

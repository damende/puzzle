package logos.semantics;

import Logo.Expression;
import Logo.Right;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.Context;
import logos.semantics.PrimitiveAspect;
import logos.semantics.RightAspectRightAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Right.class)
@SuppressWarnings("all")
public class RightAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Right _self, final Context context) {
    logos.semantics.RightAspectRightAspectProperties _self_ = logos.semantics.RightAspectRightAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Right _self, final Context context) {
    logos.semantics.PrimitiveAspectPrimitiveAspectProperties _self_ = logos.semantics.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logos.semantics.PrimitiveAspect._privk3_eval(_self_, _self,context);
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
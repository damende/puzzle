package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Expression;
import kmLogo.Right;
import logo.Context;
import logo.ExpressionAspect;
import logo.PrimitiveAspect;
import logo.RightAspectRightAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Right.class)
@SuppressWarnings("all")
public class RightAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Right _self, final Context context) {
    logo.RightAspectRightAspectProperties _self_ = logo.RightAspectRightAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Right){
    result = logo.RightAspect._privk3_eval(_self_, (kmLogo.Right)_self,context);
    } else  if (_self instanceof kmLogo.Primitive){
    result = logo.PrimitiveAspect.eval((kmLogo.Primitive)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final Right _self, final Context context) {
    logo.PrimitiveAspectPrimitiveAspectProperties _self_ = logo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final RightAspectRightAspectProperties _self_, final Right _self, final Context context) {
    Expression _angle = _self.getAngle();
    int param = ExpressionAspect.eval(_angle, context);
    InputOutput.<String>println(("RIGHT " + Integer.valueOf(param)));
    context.turtle.rotate(param);
    return 0;
  }
}

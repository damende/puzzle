package logos.semantics;

import Logo.ParameterCall;
import java.util.Map;
import logos.semantics.ParameterCallAspectParameterCallAspectProperties;

@SuppressWarnings("all")
public class ParameterCallAspectParameterCallAspectContext {
  public final static ParameterCallAspectParameterCallAspectContext INSTANCE = new ParameterCallAspectParameterCallAspectContext();
  
  public static ParameterCallAspectParameterCallAspectProperties getSelf(final ParameterCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.ParameterCallAspectParameterCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ParameterCall, ParameterCallAspectParameterCallAspectProperties> map = new java.util.WeakHashMap<Logo.ParameterCall, logos.semantics.ParameterCallAspectParameterCallAspectProperties>();
  
  public Map<ParameterCall, ParameterCallAspectParameterCallAspectProperties> getMap() {
    return map;
  }
}
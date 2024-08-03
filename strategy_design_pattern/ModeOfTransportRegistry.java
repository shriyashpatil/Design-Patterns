import java.util.HashMap;
import java.util.Map;

public class ModeOfTransportRegistry {
    
    static Map<ModeOfTransport,PathCalculator> registry = new HashMap<>();


    public static void register(ModeOfTransport mode,PathCalculator pathCalculator){
        registry.put(mode,pathCalculator);
    }

    public static PathCalculator getRegistry(ModeOfTransport mode){
        return registry.get(mode);
    }

}

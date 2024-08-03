public class GoogleMaps {
    
    PathCalculator pc;

    public void findPath(String src,String dest,ModeOfTransport modeOfTransport){
        pc = getModeOfTransport(modeOfTransport);
        pc.findPath(src, dest);
    }

    public PathCalculator getModeOfTransport(ModeOfTransport modeOfTransport){
        return PathCalculatorFactory.getModeOfTransport(modeOfTransport);
    }




}

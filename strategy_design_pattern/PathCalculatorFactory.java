public class PathCalculatorFactory {
 
    
    
    public static PathCalculator getModeOfTransport(ModeOfTransport mode){
        PathCalculator pc;
        if(mode.equals(ModeOfTransport.CAR)){
            pc = ModeOfTransportRegistry.getRegistry(ModeOfTransport.CAR);
            if(pc==null){
                pc = new CarPathCalculator();
                ModeOfTransportRegistry.register(ModeOfTransport.CAR,pc);     
            }
            return pc;
        }
        else if(mode.equals(ModeOfTransport.BIKE)){
            pc = ModeOfTransportRegistry.getRegistry(ModeOfTransport.BIKE);
            if(pc==null){
                pc= new BikePathCalculator(); 
                ModeOfTransportRegistry.register(ModeOfTransport.BIKE, pc);
            }
            return pc;
        }
        else if(mode.equals(ModeOfTransport.TRAIN)){
            pc = ModeOfTransportRegistry.getRegistry(ModeOfTransport.TRAIN);
            if(pc==null){
                pc = new TrainPathCalculator();
                ModeOfTransportRegistry.register(ModeOfTransport.TRAIN, pc);
            }
            return pc;
        }
        return null;
    }

}

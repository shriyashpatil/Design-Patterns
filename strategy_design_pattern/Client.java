public class Client {

    
    public static void main(String[] args) {
        
        GoogleMaps googleMaps = new GoogleMaps();

        googleMaps.findPath("12,34", "54.43",ModeOfTransport.CAR);

        googleMaps.findPath("54,87", "12,98", ModeOfTransport.BIKE);

        googleMaps.findPath("12,77", "12,98", ModeOfTransport.TRAIN);
    }
}

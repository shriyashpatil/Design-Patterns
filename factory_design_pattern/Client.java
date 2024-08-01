public class Client {
    
    public static void main(String[] args) {

        Xpressbees xb = new Xpressbees();

        PayContract amazonPayContract = xb.getFactory(EcommClient.Amazon).getPayContract();
        amazonPayContract.display();

        PayContract meeshoPayContract = xb.getFactory(EcommClient.Meesho).getPayContract();
        meeshoPayContract.display();

        PayContract myntraPayContract = xb.getFactory(EcommClient.Myntra).getPayContract();
        myntraPayContract.display();


    }
}

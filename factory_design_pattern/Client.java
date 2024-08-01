public class Client {
    
    public static void main(String[] args) {

        Xpressbees xb = new Xpressbees();

        PayContract amazonPayContract = xb.getFactory("Amazon").getPayContract();
        amazonPayContract.display();

        PayContract meeshoPayContract = xb.getFactory("Meesho").getPayContract();
        meeshoPayContract.display();

        PayContract myntraPayContract = xb.getFactory("Myntra").getPayContract();
        myntraPayContract.display();


    }
}

public class Client {
    
    public static void main(String[] args) {
        
        Icecream ic = new SbScoop(new VanillaScoop(new OrangeCone()));

        System.out.println("COST OF ICECREAM : "+ic.getCost());

        System.out.println("ICECREAM DESCRIPTION : "+ic.getDescription());

    }
}

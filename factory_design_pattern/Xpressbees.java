public class Xpressbees{

    public void delivery(){
        System.out.println("delivering the package");
    }

    public XpressbeesFactory getFactory(String client){

        if(client.equals("Amazon")){
            return new AmazonFactory();
        }
        else if(client.equals("Meesho")){
            return new MeeshoFactory();
        }
        else{
            return new MyntraFactory();
        }

    }

}
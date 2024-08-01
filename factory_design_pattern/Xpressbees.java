public class Xpressbees{

    public void delivery(){
        System.out.println("delivering the package");
    }

    public XpressbeesFactory getFactory(EcommClient client){

        if(client.equals(EcommClient.Amazon)){
            return new AmazonFactory();
        }
        else if(client.equals(EcommClient.Meesho)){
            return new MeeshoFactory();
        }
        else{
            return new MyntraFactory();
        }

    }

}
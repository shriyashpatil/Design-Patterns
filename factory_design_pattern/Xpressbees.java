public class Xpressbees{

    public void delivery(){
        System.out.println("delivering the package");
    }

    public XpressbeesFactory getFactory(EcommClient client){
        return XbFactoryHelper.getFactory(client);
    }

}
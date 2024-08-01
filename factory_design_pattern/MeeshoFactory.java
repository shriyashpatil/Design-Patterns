public class MeeshoFactory implements XpressbeesFactory{

    @Override
    public PayContract getPayContract() {
       return new MeeshoPayContract();
    }
    
}

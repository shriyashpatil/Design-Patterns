public class MyntraFactory implements XpressbeesFactory{

    @Override
    public PayContract getPayContract() {
        return new MyntraPayContract();
    }


    
}

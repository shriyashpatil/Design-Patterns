public class AmazonFactory implements XpressbeesFactory{

    @Override
    public PayContract getPayContract() {
         return new AmazonPayContract();
    }
    
}

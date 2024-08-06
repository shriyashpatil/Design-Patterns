public class LogisticServiceSub implements OnOrderPlacedSubscriber{

    @Override
    public void onOrderPlaced() {
        System.out.println("Logistic Service");
    }
    
}

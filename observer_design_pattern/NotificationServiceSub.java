public class NotificationServiceSub implements OnOrderPlacedSubscriber{

    @Override
    public void onOrderPlaced() {
        System.out.println("Notification Service");
    }
    
}

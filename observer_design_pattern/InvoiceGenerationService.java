public class InvoiceGenerationService implements OnOrderPlacedSubscriber{

    @Override
    public void onOrderPlaced() {
        System.out.println("Invoice Generation");
    }
    
}

public class Client {
    

    public static void main(String[] args) {
        
        Amazon amazon = new Amazon();

        /// subscribe to publisher

        amazon.register(new LogisticServiceSub());
        amazon.register(new InvoiceGenerationService());
        amazon.register(new NotificationServiceSub());

        /// when event is called
        amazon.onOrderPlaced();

    }

}

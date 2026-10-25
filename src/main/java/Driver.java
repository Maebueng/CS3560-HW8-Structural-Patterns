public class Driver {
    public static void main (String[] args) {
        // Instantiates new notification object with new EmailChannel()
        Payment onlinePayment = new OnlinePayment(new EmailChannel());
        onlinePayment.makePayment();
    }
}


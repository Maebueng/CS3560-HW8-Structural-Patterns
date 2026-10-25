public class OnlinePayment extends Payment {

    // default constructor
    public OnlinePayment(Notification notification) {
        this.notification = notification;
    }

    public void makePayment() {
        notification.sendMessage("Customer paid online");
    }
}
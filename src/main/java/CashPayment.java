public class CashPayment extends Payment {
    public CashPayment(Notification notification) {
        this.notification = notification;
    }

    public void makePayment() {
        // empty for red phase
    }
}

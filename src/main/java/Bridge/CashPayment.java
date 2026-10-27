package Bridge;

public class CashPayment extends Payment {
    public CashPayment(Notification notification) {
        this.notification = notification;
    }

    public void makePayment() {
        notification.sendMessage("Customer paid with cash");
    }
}

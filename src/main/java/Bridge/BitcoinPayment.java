package Bridge;

public class BitcoinPayment extends Payment{
    public BitcoinPayment(Notification notification) {
        this.notification = notification;
    }

    public void makePayment() {
        notification.sendMessage("Customer paid with bitcoin");
    }
}

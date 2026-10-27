// equivalent to left side of diagram (the shapes)
package Bridge;

public abstract class Payment {
    protected Notification notification;

    abstract public void makePayment();
}

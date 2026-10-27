package Bridge;

public class SmsChannel implements Notification{
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}

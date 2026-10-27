package Bridge;

public class PushChannel implements Notification{
    public void sendMessage(String message) {
        System.out.println("Push: " + message);
    }
}

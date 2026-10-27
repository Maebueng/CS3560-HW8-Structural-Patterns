package Bridge;

public class EmailChannel implements Notification {
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
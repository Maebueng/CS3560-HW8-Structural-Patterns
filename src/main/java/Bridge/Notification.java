// equivalent to right side of diagram, the colors
// composition: Payment method HAS a notification channel to push
package Bridge;

public interface Notification {
    void sendMessage(String message);
}
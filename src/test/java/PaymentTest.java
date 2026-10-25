import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    @Test
    public void testOnlinePaymentMethodWithEmail() {
        Payment payment = new OnlinePayment(new EmailChannel());

        assertDoesNotThrow(() -> {
            payment.makePayment();
        });
    }
} // testing

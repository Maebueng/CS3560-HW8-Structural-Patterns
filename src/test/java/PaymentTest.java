import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    // Online payment tests
    @Test
    public void testOnlinePaymentMethodWithEmail() {
        Payment payment = new OnlinePayment(new EmailChannel());

        assertDoesNotThrow(() -> {
            payment.makePayment();
        });
    }

    @Test
    public void testOnlinePaymentMethodWithSMS() {
        Payment payment = new OnlinePayment(new SmsChannel());

        assertDoesNotThrow(() -> {
            payment.makePayment();
        });
    }

    @Test
    public void testOnlinePaymentMethodwithPush() {
        Payment payment = new OnlinePayment(new PushChannel());

        assertDoesNotThrow(() -> {
            payment.makePayment();
        });
    }

    // Cash payment testing
    @Test
    public void testCashPaymentWithEmail() {
        Payment payment = new CashPayment(new EmailChannel());

        assertDoesNotThrow(() -> {
            payment.makePayment();
        });
    }

    @Test
    public void testCashPaymentWithSMS() {
        Payment payment = new CashPayment(new SmsChannel());

        assertDoesNotThrow(() -> {
            payment.makePayment();
        });
    }

    @Test
    public void testCashPaymentWithPush() {
        Payment payment = new CashPayment(new PushChannel());

        assertDoesNotThrow(() -> {
            payment.makePayment();
        });
    }

    // Bitcoin payment testing
    @Test
    public void bitcoinPaymentWithEmail() {
        fail("Bitcoin Payment not yet implemented");

        Payment payment = new BitcoinPayment(new EmailChannel());

        assertDoesNotThrow(() -> {
            payment.makePayment();
        });
    }

    @Test
    public void bitcoinPaymentWithSMS() {
        fail("Bitcoin Payment not yet implemented");

        Payment payment = new BitcoinPayment(new SmsChannel());

        assertDoesNotThrow(() -> {
            payment.makePayment();
        });
    }

    @Test
    public void bitcoinPaymentWithPush() {
        fail("Bitcoin Payment not yet implemented");

        Payment payment = new BitcoinPayment(new PushChannel());

        assertDoesNotThrow(() -> {
            payment.makePayment();
        });
    }


} // end PaymentTest

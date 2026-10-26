public class Driver {
    public static void main (String[] args) {
        // Instantiates new notification object with new EmailChannel()
        Payment onlinePaymentEmail = new OnlinePayment(new EmailChannel());
        onlinePaymentEmail.makePayment();

        Payment onlinePaymentSMS = new OnlinePayment(new SmsChannel());
        onlinePaymentSMS.makePayment();

        Payment onlinePaymentPush = new OnlinePayment(new PushChannel());
        onlinePaymentPush.makePayment();

        System.out.println();

        Payment cashPaymentEmail = new CashPayment(new EmailChannel());
        cashPaymentEmail.makePayment();

        Payment cashPaymentSMS = new CashPayment(new SmsChannel());
        cashPaymentSMS.makePayment();

        Payment cashPaymentPush = new CashPayment(new PushChannel());
        cashPaymentPush.makePayment();
    }
}


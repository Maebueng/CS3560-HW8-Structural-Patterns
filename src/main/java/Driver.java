public class Driver {
    public static void main (String[] args) {
        // Instantiates new notification object with new EmailChannel()
        Payment onlinePaymentEmail = new OnlinePayment(new EmailChannel());
        onlinePaymentEmail.makePayment();

        Payment onlinePaymentSMS = new OnlinePayment(new SmsChannel());
        onlinePaymentSMS.makePayment();

        System.out.println();

        Payment cashPaymentEmail = new CashPayment(new EmailChannel());
        cashPaymentEmail.makePayment();

        Payment cashPaymentSMS = new CashPayment(new SmsChannel());
        cashPaymentSMS.makePayment();

        System.out.println();

        Payment bitcoinPaymentEmail = new BitcoinPayment(new EmailChannel());
        bitcoinPaymentEmail.makePayment();

        Payment bitcoinPaymentSMS = new BitcoinPayment(new SmsChannel());
        bitcoinPaymentSMS.makePayment();
    } // end main
} // end Driver


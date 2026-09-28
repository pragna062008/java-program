class payment {

    void makePayment(double amount) {

        if (amount < 0) {
            System.out.println("Invalid payment amount");
        }
        else if (amount == 0) {
            System.out.println("Zero payment amount");
        }
        else {
            System.out.println("MAKE PAYMENT AMOUNT=" + amount);
        }
    }

    void makePayment(double amount, String transactionID) {

        if (amount <= 0) {
            System.out.println("Invalid payment amount");
        }
        else if (transactionID == null || transactionID.isEmpty()) {
            System.out.println("Empty transaction ID");
        }
        else if (!transactionID.matches("TXN[0-9]+")) {
            System.out.println("Invalid transaction ID format");
        }
        else {
            System.out.println("AMOUNT=" + amount);
            System.out.println("TRANSACTION ID=" + transactionID);
        }
    }
}

class CreditCardPayment extends payment {

    @Override
    void makePayment(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid payment amount");
        }
        else {
            System.out.println("CREDIT CARD PAYMENT");
            System.out.println("Amount=" + amount);
        }
    }
}

class UPIPayment extends payment {

    @Override
    void makePayment(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid payment amount");
        }
        else {
            System.out.println("UPI PAYMENT METHOD");
            System.out.println("Amount=" + amount);
        }
    }
}

class NetBankingPayment extends payment {

    @Override
    void makePayment(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid payment amount");
        }
        else {
            System.out.println("NET BANKING PAYMENT");
            System.out.println("Amount=" + amount);
        }
    }
}

class Main {
    public static void main(String[] args) {

        payment payment;

        payment = new CreditCardPayment();
        payment.makePayment(5000.00);

        payment = new UPIPayment();
        payment.makePayment(1200.50);

        payment = new NetBankingPayment();
        payment.makePayment(8500.00);

        payment = new payment();
        payment.makePayment(2500.00, "TXN1001");

        payment = new CreditCardPayment();
        payment.makePayment(1000.00);

        payment = new UPIPayment();
        payment.makePayment(1000.00);

        payment = new NetBankingPayment();
        payment.makePayment(1000.00);

        payment = new CreditCardPayment();
        payment.makePayment(-1000.00);

        payment = new UPIPayment();
        payment.makePayment(0.00);

        payment = new payment();
        payment.makePayment(3000.00, "");

        payment = null;

        try {
            payment.makePayment(1000.00);
        }
        catch (NullPointerException e) {
            System.out.println("Null payment object");
        }

        payment = new payment();
        payment.makePayment(4500.00, "123");
    }
}

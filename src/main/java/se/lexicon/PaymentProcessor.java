package se.lexicon;

/**
 * --- EXAMPLE: PAYMENT PROCESSING ---
 * We use overloading so our code is readable.
 * Whether it's a card or a bank transfer, we just say "processPayment".
 */
public class PaymentProcessor {

    // 1. CREDIT CARD PAYMENT
    // We need the card number and CVV.
    public static void processPayment(String cardNumber, String cvv, double amount) {
        System.out.println("Processing Credit Card ending in: " + cardNumber.substring(cardNumber.length() - 4));
    }

    // 2. BANK TRANSFER PAYMENT (Overloaded)
    // We need the bank account, SWIFT code, and a custom description.
    // Changing the number or type of parameters lets us reuse the same method name.
    public static void processPayment(String bankAccount, String swift, double amount, String description) {
        System.out.println("Processing Bank Transfer to: " + bankAccount + " with description: " + description);
    }
}

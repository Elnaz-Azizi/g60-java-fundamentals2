package se.lexicon;

public class BankApp {
    static void main() {
        BankAccount elnaz = new BankAccount();
        elnaz.accountHolder = "Elnaz Azizi";
        elnaz.balance = 1000;
        elnaz.deposit(500);

        BankAccount mehrdad = new BankAccount();
        mehrdad.accountHolder = "Mehrdad Javan";
        mehrdad.balance = 1000;
        mehrdad.deposit(2000);

        System.out.println("Elnaz's balance: " + elnaz.balance);
        System.out.println("Mehrdad's balance: " + mehrdad.balance);

        // Static DATA
       BankAccount.setInterestRate(3.2);
       // System.out.println("The bank's Interest rate is: " + BankAccount.interestRate + "%");
    }
}

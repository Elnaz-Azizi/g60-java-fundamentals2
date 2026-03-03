package se.lexicon;

public class BankAccount {

    //1. Instance Variables
    String accountHolder;
    double balance;

    //2. Static Variables

    static double interestRate = 4.5;

    //3. Instance Methods
    void deposit(double amount) {
        this.balance += amount;
        System.out.println(accountHolder + " deposited " + amount);
    }

    //4. Static Methods
    static void setInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("The bank's Interest rate set to: " + interestRate + "%");
    }
}

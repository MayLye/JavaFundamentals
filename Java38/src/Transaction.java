// Exercise 5:

import java.util.Date;

public class Transaction {

    // D for Deposit, W for Withdrawal.
    private char type;
    private double amount, balance;
    private Date date;
    private String description;

    public Transaction(char type, double amount, double balance, Date date, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.date = new Date();
        this.description = description;

    }

    // added during exe5
    public Transaction(char d, double amount, double balance, String s) {
    }
}

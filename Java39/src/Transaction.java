// Exercise 5:

import java.util.Date;

public class Transaction {

    // D for Deposit, W for Withdrawal.
    private char type;
    private double amount, balance;
    private Date date;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

        this.date = new Date();
    }

    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }

    public char getType() {
        return type;
    }
}

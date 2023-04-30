// Exercise 2: Part 1

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // added during Exercise 5
    private Client client;
    private ArrayList<Transaction> transactions;
    // added during Exercise 5

    /*public Account(int id, double balance, double annualInterestRate) { // Used before Exe5
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }*/

    public Account(int id, double balance, double annualInterestRate, Client client) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        // added during Exercise 5
        this.client = client;
        this.transactions = new ArrayList<>();
        // added during Exercise 5
        dateCreated = new Date();
    }

    public boolean withdraw (double amount) {
        // added during Exercise 5
        this.transactions.add(new Transaction('W', amount, this.balance,"Withdrawn " + amount));
        // added during Exercise 5
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void deposit (double amount) {
        balance += amount;
        this.transactions.add(new Transaction('D', amount, this.balance, "Deposited " + amount));
    }

    public int getId() {
        return id;
    }

    // go to Code -> Generate Code -> select all in getter and setter.
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() { // refer to client class
        return this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}

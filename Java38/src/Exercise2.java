// Exercise 2: Part 2

public class Exercise2 {
    public static void main(String[] args) {
        /* test account:
        id: 1122
        balance: 20000,
        annual interest: 4.5%
         */
        Account testAccount = new Account(1122, 20000,4.5);

        if(testAccount.withdraw(2500)) // withdraw 2500 from 20000, left 17500.
            System.out.println("Withdraw successful");
        else
            System.out.println("Withdraw unsuccessful");

        testAccount.deposit(3000); // add 3000 into 17500 becomes 20500.
        System.out.println(testAccount.getId() + " " +
                testAccount.getBalance() + " " +
                testAccount.getAnnualInterestRate() + " " +
                testAccount.getDateCreated().toGMTString()); // press CTRL+(left click), to go to its code.
    }

}

// Exercise 6:
/* Program:
1. Create an ArrayList of Account.
2. Display the number of deposits and withdrawals of each account.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        Client client = new Client(100, "May", "12121212");
        accounts.add(new Account(1,1000,1.5, client));
        accounts.add(new Account(2,2000,2.5, client));

        accounts.get(0).withdraw(2000);
        accounts.get(0).withdraw(1000);
        accounts.get(0).deposit(2000);
        accounts.get(0).withdraw(1000);

        accounts.get(1).deposit(100);
        accounts.get(1).deposit(300);

        /*for (Account account: accounts) {
            System.out.println("Account " + account.getId() + ":");
            System.out.println("W:" + account.countTransactions('W'));
            System.out.println("D:" + account.countTransactions('D'));
        }*/
        System.out.println(accounts.get(0));
    }
}

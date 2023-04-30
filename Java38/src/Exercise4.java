// Exercise 4:
/* Program:
    - Create an array of 2 clients.
    - Add 2 accounts for the first client and 3 for the second one.
    - Print the information of each client using toString().
 */

public class Exercise4 {

    public static void main(String[] args) {
        Client[] clients = new Client[2]; // two clients with default null values.

        clients[0] = new Client(100,"Ali","12312312");
        clients[0].addAccount(new Account(1,1000,1.5));
        clients[0].addAccount(new Account(2,2000,2.5));

        clients[1] = new Client(200,"Sujeet","76529111");
        clients[1].addAccount(new Account(3,3000,3.5));
        clients[1].addAccount(new Account(4,4000,4.5));
        clients[1].addAccount(new Account(5,5000,5.5));

        System.out.println(clients[0]);
        System.out.println(clients[1]);
    }
}

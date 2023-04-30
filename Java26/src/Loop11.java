/* Exercise:
Write a program that reads a positive integer N from the user and displays the following:
1
22
333
4444
NNNN.......N
 */

import java.util.Scanner;

public class Loop11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Read input from user.
        int n = s.nextInt(); // Store user input in variable n.

        for (int i = 1; i <= n; i++) { // iterate as long as i is less than or equal to n.
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
            }
            System.out.println();
        }

    }
}

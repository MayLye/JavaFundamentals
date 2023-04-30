/* Exercise:
Write a program that reads a positive integer N and displays like:
Example: N=4 for four lines:
    *
   **
  ***
 ****
 */

import java.util.Scanner;

public class Loop12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.println(" ");
            }
            // print the number of stars, which is equals to the number of lines.
            System.out.println("Exercise 1: ");
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println("Exercise 2: ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

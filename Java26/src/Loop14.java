/* Exercise:
Write a program that reads a positive integer N and displays the following:
Example for N=5;
*****
*   *
*   *
*   *
*****
 */

import java.util.Scanner;

public class Loop14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.println("*");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.println("*");
                    } else {
                        System.out.println(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

/* Exercise:
Write a program that reads a positive integer N and displays the following:
Print the stars in a triangle.
 */

import java.util.Scanner;

public class Loop13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.println(" ");
            }
            // print the stars pattern in a triangle.
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n) {
                    System.out.println("*");
                } else {
                    if (j == 1 || j == 2 * i - 1) {
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

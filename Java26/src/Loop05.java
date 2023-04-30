/* Exercise:
Write a program which reads a sequence of positive integers. The program stops when the
user fills a negative value, and shows the maximum and the minimum of these numbers.
 */

/* Algorithm:
    1-Read the first value from the user, and find out the maximum and minimum.
    2-Keep updating max and min as long as the user is giving positive values.
    3-display the results when the user enters a negative value.
 */

import java.util.Scanner;

public class Loop05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Let's input any numbers: ");
        int n = s.nextInt(); // Taking integer input from user.
        int max = n;
        int min = n;

        if (n >= 0) {
            while (true) {
                n = s.nextInt();
                if (n < 0)
                    break; // to exit the loop and print out the statement.

                if (n > max)
                    max = n;
                if (n < min)
                    min = n;

                // if n is greater than maximum, then the maximum will be equals to n.
                // if n is smaller than minimum, then the minimum will be equals to n.
                /*
                max = n > max ? n : max;
                min = n < min ? n : min;
                 */
            }
            System.out.println("Loop exit due to n<0. " + "min= " + min + ", max= " + max);
        } else { // to test this, input any negative numbers.
            System.out.println(n + " is invalid.");
        }

    }
}

/* Exercise:
Write a program which reads a sequence of integers from the user and stops by displaying "Done"
when the sum of these values exceeds 100.
 */

/* Algorithm:
    1-Declare a variable sum to store the sum.
    2-Read values from the user and add them to sum as long as sum <= 100.
    3-When sum>100, display "Done".
 */

import java.util.Scanner;

public class Loop02 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // Read input from user.
        int sum = 0; // variable sum to keep track of the values that the user enters. Starts at 0.

        // Method 1:
        /*while (true) { // if the condition is <100, it is true. Continue enter another number.
            System.out.print("enter a number: ");
            sum += s.nextInt(); // read an integer from the user and add it to the variable sum.
            if (sum > 100)
                break;
        }
        System.out.println("Done: " + sum);*/

        // Method 2:
        while (sum <= 100) { // as long as the sum is < or = to 100.
            System.out.print("enter a number: ");
            sum += s.nextInt(); // read an integer from the user and add it to the variable sum.
        }
        System.out.println("Done: " + sum);

        // Do-While loop method:
        /*do { // run at least once before checking condition.
            System.out.print("enter a number: ");
            sum += s.nextInt(); // read an integer from the user and add it to the variable sum.
            sum++;
        } while (sum <= 100); // as long as the sum is < or = to 100.
        System.out.println("Done: " + sum);*/
    }

}

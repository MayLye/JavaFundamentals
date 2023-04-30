/* Exercise:
Write a program which displays the sum of digits of an integer read from the user.
 */

/* Algorithm:
    1-Read the number from the user.
    2-Keep extracting the digits using the modulo and division operators and adding them to sum.
    3-Display sum.
 */

import java.util.Scanner;

public class Loop06 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        int n = s.nextInt();
        int sum = 0;
        while (n > 0) { // extract the digits and add them to sum variable.
            sum += n % 10; // If our number is ABC, then add C to the variable sum.
            n /= 10; // divide the variable by 10. If n is ABC, it will be equal to AB.
        }
        System.out.println("sum " + sum); // summing of digits means summation of A+B+C.
    }
}

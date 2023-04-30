/* Exercise:
Write a program which displays the sum of the strict divisors of an integer given by the user.
The strict divisors of a number N are <= N/2.
If N%i=0, then i is a divisor of N.
 */

/* Algorithm:
    1-Iterate over all the possible divisors.
    2-If i is a divisor of N, add i to the sum.
    3-Display.
 */

import java.util.Scanner;

public class Loop03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("summation - enter a number: ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) // check whether i is the divisor of n. The remainder should be 0 if yes.
                sum += i; // continue summation.
        }
        System.out.println("Result of sum is: " + sum); // Sum up all the divisors.
        /* Explaination:
            If n = 15, then the divisors are 1, 3 and 5.
            The result of sum is: 1+3+5=9.
         */

        // Strict divisor: means all the numbers that are dividable by n.
        System.out.println("Strict divisor: ");
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                System.out.println(i + " ");
        }
        System.out.println("Add the sum result with initial variable n: ");
        System.out.println(sum + n);

    }
}

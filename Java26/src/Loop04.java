/* Exercise:
Write a program which reads a positive number N from the user.
Indicates if N is prime or not.
Prime numbers only divisible by 1 or N. Eg: 3,5,7.
 */

import java.util.Scanner;

public class Loop04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Method 1:
        System.out.println("method1 -> enter a number: ");
        int n = s.nextInt();
        int sum = 1; // 1 is a divisor for every number.
        // this for loop is for calculating the sum of strict divisors.
        for (int i = 2; i <= n / 2; i++) { // iterating possible strict divisors. Prime number starts with 2.
            if (n % i == 0) // check whether i is the divisor of n. The remainder should be 0 if yes.
                sum += i; // If we find at least 1 divisor, this statement will be executed by adding i to sum.
        }
        /*
        If sum is equals to 1, it is a prime number.
        Else it is not a prime number.
         */
        System.out.println(sum == 1 ? "prime": "not prime");

        // Method 2:
        /* Algorithm:
            1-Iterate over all the possible divisors except 1 and N.
            2-If i is a divisor of N, then N is not prime.
            3-N is prime if no divisors were found.
         */
        System.out.println("method2 -> enter a number: ");
        int n2 = s.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n2 / 2; i++) { // Algorithm step-1
            if (n2 % i == 0) { // Algorithm step-2
                isPrime = false;
                break; // if n is not a prime number, break out of the loop.
            }
            System.out.println(isPrime ? "prime" : "not prime");
            // if the block above was executed, n is not a prime number.
        }
    }
}

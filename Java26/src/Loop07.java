/* Exercise:
Write a program that reads an integer n and displays the nth Fibonacci number.
 */

/* Fibonacci:
The Fibonacci sequence is a sequence of numbers where the first two numbers in the sequence are 1 and 1.
Then, each additional Fibonacci number is the sum of the two previous numbers in the sequence:
1,1,2,3,5,8,13,21....
 */

import java.util.Scanner;

public class Loop07 {
    /* Sample 1:
        1,1,........ -> only first 2 numbers are displayed.
        We want to get the 4th and 6th Fibonacci number:
        Suppose n = 4:
        1 + 1 = 2
        1 + 2 = 3
        Answer: 1,1,2,3......need 2 steps
        Suppose n = 6:
        1 + 1 = 2
        1 + 2 = 3
        2 + 3 = 5
        3 + 5 = 8
        Answer: 1,1,2,3,5,8.....need 4 steps
     */
    // Conclusion: To get the nth Fibonacci number we need (n - 2) steps.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a positive integer n: ");
        int n = s.nextInt(); // store the positive integer in variable n.
        int result = 0; // result value here doesn't matter at this point, simply put 0.
        int v1 = 1; // 1st element
        int v2 = 1; // 2nd element
        for (int i = 1; i <= n - 2; i++) { // iterating (n-2) iterations as per Fibonacci formula above.
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        System.out.println("Fibonacci number " + n + " is " + result);
        // System.out.println("Fibonacci number " + n + "th is " + (result == 0 ? 1 : result));
    }
}

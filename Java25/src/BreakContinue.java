// Title: Break and Continue -> are special keywords that can be used within loops.
// break: exits the loop regardless of the condition.

/*
continue: skips the rest of the loop's body. Continue executing the loop as if we finished executing the body.
    for loop: execute change
    while and do-while loop: check condition
 */

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {
        // Example 1:
        for (int i=1;i<=10;i++) { // execute 10 times.
            if(i%2==0) { // check if i is an even number.
                continue;
                // if i is an even number, stop executing the loop and go back to execute the change.
            }
            System.out.println(i + " "); // if i is an odd number, it is going to continue executing the code here.
        }

        // Example 2:
        Scanner s = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("enter a number between 1 and 10: ");
            n = s.nextInt();
            if (n<1 || n>10) { // NOT btw 1 qnd 10, continue executing.
                continue;
            }
            System.out.println(n + " is between 1 and 10"); // if n is btw 1 and 10,
            break; // break out of the loop
        }
        // System.out.println(n + " is between 1 and 10"); // Can be declared outside the loop as n is declared outside.
    }
}

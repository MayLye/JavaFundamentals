// Title: Do While Loop in Java

/* The statements will keep executing as long as the boolean-expression evaluates to true.
   Condition is checked after the code block is executed. Execute and then check.

    do {
        statements
    } while(boolean-expression);
 */

public class DoWhileLoop {

    public static void main(String[] args) {
        // Example 1:
        int i = 1; // i starts from 1.
        do {
            System.out.println("hello " + i);
            i++; // incrementing i.
            /*
            hello1 -> Iteration 1 (executes regardless of the condition.)
            i = 2 -> Iteration 2
            i = 3 -> Iteration 3
            i = 4 -> Done
             */
        } while(i <= 3); // i ends at 3.

        // Example 2:
        int j = 100; // j <= 5 is false
        do {
            System.out.println("hello " + j); // will execute 1 iteration, that is hello 100.
            j++;
        } while (j <= 5); // it will stop after 1st execution as the condition is false.
    }

}

// Title: While Loop in Java

/* The statements will keep executing as long as the boolean-expression evaluates to true.
   Condition is checked before the code block is executed. Check and then execute.

    while(boolean-expression) {
        statement(s)
    }
 */

public class WhileLoop {
    public static void main(String[] args) {
        // Example 1:
        int i = 1;
        while (i <= 5) { // as long as i is less than or equal to 5, print Hello.
            System.out.println("Hello" + i);
            i++; // incrementing i, by changing the value of i during each iteration.
            /*
            i = 1, true -> Iteration 1
            i = 2, true -> Iteration 2
            i = 3, true -> Iteration 3
            i = 4, true -> Iteration 4
            i = 5, true -> Iteration 5
            i = 6, false -> Skip the body of the loop.
             */
        }

        // Example 2:
        int j = 100;
        while (j <= 5 ) { // this condition is false.
            System.out.println("Hello" + i);
            j++;
            // Never be executed, zero iterations.
        }

        /* Infinite Loop: condition forever true.
        int i = 1;
        while (i <= 5)
            System.out.println("Hello" + i);

        while (true)
            System.out.println("Hello");
         */
    }
}

// Loops: are used to execute a block of code more than once. Each execution is called an iteration.
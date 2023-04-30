// Title: For Loop
// the statement will continue executing as long as the condition evaluates to true.
/*
for (variable; condition; change) {
    statements
 */

public class ForLoop {

    public static void main(String[] args) {
        // Variable: int i=1
        // Variable can be declared and set inside the for loop, but we cannot use outside the loop in this case.
        for (int i=1;i<=5;i++) {
            System.out.println("Hello" + i);
            /*
            i = 1, true -> Iteration 1
            i = 2, true -> Iteration 2
            i = 3, true -> Iteration 3
            i = 4, true -> Iteration 4
            i = 5, true -> Iteration 5
            i = 6, false -> Skip the body of the loop.
             */
        }

        // Variable can be declared OUTSIDE and set inside the for loop. In this case, i can be accessed outside the loop.
        int j; // Variable j declared OUTSIDE the for loop.
        for (j=1;j<=5;j++) { // But j is initialize inside the for loop.
            System.out.println("jHello " + j);
        }
        // Execute below statement after the 'for' code block finish executing.
        System.out.println("jHello " + j);

        // Variable INITIALIZED outside.
        int k = 1; // Initialize outside.
        for (;k<=5;k++) {
            System.out.println("kHello " + k);
        }

        // pre- or post-increment op are the same in all above cases.
        int m = 1;
        for (;m<=5;++m) {
            System.out.println("mHello " + m);
        }

        // Use For-loop as While-loop:
        int n = 1;
        /*
        while (n<=5) {
            System.out.println("nHello" + n);
            n++;
        }
         */
        for (;n<=5;) {
            System.out.println("nHello" + n);
            n++;
        }

        // Infinite For Loop
        /*
        for (;;)
            System.out.println("Hello");
        for (;true;)
            System.out.println("Hello");
        */
    }
}

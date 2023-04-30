// Title: Scope and Local Variables in Java.
/* Naming Variables:
We can declare local variables with the same name in independent blocks.
But we cannot do this in the same block or in nested blocks.
 */

public class NamingVar {

    public static void main(String[] args) {

        // Example 1:
        int x = 1;
        int y = 1;
        /* How come we can have 2 variables with the same name?
            - Because we can have local variables with the same name in different blocks.
         */
        /*
        Scope of variable i is independent of each block.
        Which means cope of variable i in for loop (x block) is different from for loop (y block).
        In other words, both i are declared independently.
         */
        for (int i = 1; i < 10; i++) {
            // Scope of variable i over here covers this for loop only.
            x += i;
        }
        for (int i = 1; i < 10; i++) {
            // Scope of variable i over here covers this for loop only.
            y += i;
        }

        // Example 2:
        /* Error!
        int i=1;
        int i=0;
         */
        /*
        Above declarations give us error, as it i=0 is nested inside i=1.
        We cannot name the same variable in the same block or in nested blocks.
        To solve this problem, we should use different name for one of the variable.
         */

        // Example 3:
        int i = 1;
        int sum = 0;
        /* Error!
        for (int i=1;i<10;i++) {
            sum += i;
        }
         */
        /*
        i already defined in main method, it cannot be redefined in the nested block of for loop.
         */
    }

    // Example 4:
    public static void method1(String[] args) {
        // variable i can be redeclared because the scope of the main method and method1 method is independent.
        // scope of i here is inside block code of method1.
        int i = 1;
    }

}

// Title: Nested Loop -> A loop nested inside another loop.
/*
Nested Loop consists of an outer loop, but one or more inner loops.
Each time the outer loop is executed, the inner loops are executed again.
Simply saying, the inner loops execute completely whenever the outer loop executes for one iteration.
The name of the variable in the outer loop must be different from the inner loop.
 */

public class NestedLoop {

    public static void main(String[] args) {
        // Example 1:
        for (int i=0;i<3;i++) { // outer loop
            for (int j=0;j<2;j++) { // inner loop
                System.out.println(i + " " + j);
            }
            System.out.println();
        }

        // Example 2:
        for (int i=1;i<=5;i++) { // outer loop
            for (int j=0;j<=i;j++) { // inner loop
                System.out.println("*");
            }
            System.out.println();
        }

        // Example 3:
        for (int i=1;i<=10;i++) { // outer loop
            for (int j=1;j<=10;j++) { // inner loop
                System.out.println((i*j) + " ");
            }
            System.out.println();
        }
    }
}

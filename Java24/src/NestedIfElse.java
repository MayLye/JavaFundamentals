// Title: Nested IF-ELSE statement -> Using if else statements inside if else statements.

/* Implement this logic:
    if n>10 -> sout ">10"
    else if n=10 -> sout "=10"
    else sout "<10"
 */

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {
        int n = 10;
        if (n > 10)
            System.out.println(">10");
        else if (n == 10)
            System.out.println("=10");
        else
            System.out.println("<10");
    }
}

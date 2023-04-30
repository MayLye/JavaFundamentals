// Title: IF statement -> used to execute a piece of code based on a condition.

/* These statements are executed if the boolean-expression evaluates to true. If false, it will be skipped.
if (boolean-expression)
    statement
if (boolean-expression) {
    statements
}
 */

public class If {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x > y)
            System.out.println("the max is " + x);

        if (y > x)
            System.out.println("the max is " + y);

        if (y == x)
            System.out.println("the numbers are equal.");

    }
}
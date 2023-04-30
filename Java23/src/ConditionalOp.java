// Title: Conditional Operator is an operator that evaluates an expression based on a condition.

/* (boolean-expression ? expression1 : expression2)
    Evaluates to:
    expression1 if boolean-expression is true
    expression2 if boolean-expression is false
 */

public class ConditionalOp {

    public static void main(String[] args) {

        // Eg1: Max of two numbers
        int a = 10;
        int b = 15;
        // int max = ((a > b) ? b : a);
        int max = a > b ? a : b;
        // if a > b is true, max is a; if it is false, max is b.
        System.out.println(max);

        // Eg2: Print name if exists
        String name = "Big Kids";
        System.out.println(name.isEmpty() ? "The name is not valid" : name);

        // Eg3: Print name if doesn't exists
        System.out.println(!name.isEmpty() ? "The name is not valid" : name);
    }
}

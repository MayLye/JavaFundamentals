// Title: Assignment Operator
// is an operator to assign a value/expression to a variable.

public class Main {
    public static void main(String[] args) {
        // Assign multiple variables in the same statement.
        int y;
        int x = y = 4 + 1;
        System.out.println(x);

        // Assignment statement evaluates an expresssion and assigns the result to a variable.
        int i1 = 1;
        double d = 5.0;
        int i2 = 10;
        i2 = i2 + 10;
        System.out.println(i1 + i2);
        System.out.println(i1 + i2 + (int)d); // convert double to int

        // Assignment Expression
        System.out.println(d = 6.0);
        System.out.println(i1 = 3);
        System.out.println(i2 = i1 = 5);

        // Augmented Assignment Operator
        i1 = i1 + 1; // add 1 to i1
        i1 += 3; // add 3 to i1
        i1 *= 5 + 1; // i1 = i1*(5+1)
        System.out.println(i1);
    }
}

/* lvalue = rvalue;
    - lvalue should be a variable.
    - rvalue should is an expression that evaluates to a value, and then store the result in lvalue.
    - lavlue can be used in rvalue.
 */
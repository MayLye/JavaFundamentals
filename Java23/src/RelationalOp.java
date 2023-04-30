// Title: Relational Operators
// are operators used to make comparisons. They produces a boolean when used.

public class RelationalOp {
    /*
    Equality Operator: ==
    Inequality Operator: !=
    Greater than operator: >
    Greater than or equal operator: >=
    Less than operator: <
    Less than or equal operator: <=
     */

    public static void main(String[] args) {
        // Parentheses are optionals, just to make code clearer.

        // Equality Operator: ==
        boolean b1 = (1 == 1);
        boolean b2 = (2 == 3);
        boolean b3 = (2 + 3) == (6 - 1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        // Inequality Operator: !=
        // tests if two expressions are not equal.
        boolean b4 = (1 != 1);
        boolean b5 = (2 != 3);
        boolean b6 = (2 + 3) != (6 - 2);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

        // Greater than operator: >
        // tests if an expression is greater than another.
        boolean b7 = (1 > 1);
        boolean b8 = (2 > 3);
        boolean b9 = (2 + 3) > (6 - 2);
        System.out.println(b7);
        System.out.println(b8);
        System.out.println(b9);

        // Greater than or equal operator: >=
        // tests if an expression is greater than or equal to another.
        boolean b10 = (1 >= 1);
        boolean b11 = (2 >= 3);
        boolean b12 = (2 + 3) >= (6 - 2);
        System.out.println(b10);
        System.out.println(b11);
        System.out.println(b12);

        // Less than operator: <
        // tests if an expression is less than another.
        boolean b13 = (1 < 1);
        boolean b14 = (2 < 3);
        boolean b15 = (2 + 3) < (6 - 2);
        System.out.println(b13);
        System.out.println(b14);
        System.out.println(b15);

        // Less than or equal operator: <=
        // tests if an expression is less than or equal to another.
        boolean b16 = (1 <= 1);
        boolean b17 = (2 <= 3);
        boolean b18 = (2 + 3) <= (6 - 2);
        System.out.println(b16);
        System.out.println(b17);
        System.out.println(b18);
    }
}
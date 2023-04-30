// Increment & Decrement Operators

public class IncrDecrOp {

    public static void main(String[] args) {
        /* Increment Operator (++) increases the value of a variable by 1.
            Pre-increment: ++i
            Post-increment: i++
        */
        int i = 1;
        int j = ++i; // increases the value of i by 1 and uses the NEW value.
        System.out.println("i is " + i + ", j is " + j);

        i = 1;
        j = i++; // increases the value of i by 1 and uses the ORIGINAL value.
        System.out.println("i is " + i + ", j is " + j);

        i = 1;
        j = i++ + 4;
        System.out.println("i is " + i + ", j is " + j);
        i = 1;
        j = ++i + 4;
        System.out.println("i is " + i + ", j is " + j);

        /* Decrement Operator (--) decreases the value of a variable by 1.
            Pre-decrement: --i
            Post-decrement: i--
        */
        i = 4;
        System.out.println(--i); // i will be decremented.

        i = 4;
        System.out.println(i--); // i will not be decremented.

    }

}

/* In conclusion,
    Pre-increment means that the variable is incremented BEFORE it's evaluted in the expression.
    Post-increment means that the variable is incremented AFTER it's evaluted in the expression.

 */

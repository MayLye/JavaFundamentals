// Title: Logical Operators -> are operators used to construct complex conditions

// These operators are used btw Boolean values, and the result is also a Boolean value.
    /* Logical AND operator: &&
       cond1 && cond2 && condn
       TRUE only if all conditions are true.
     */

    /* Logical OR operator: ||
       cond1 || cond2 || cond3
       TRUE if at least one condition is true.
     */

    /* Logical NOT operator: !
       negates a Boolean value
       !true = false
       !false = true
     */

public class LogicalOp {

    public static void main(String[] args) {
        boolean b1 = true && true;
        boolean b2 = b1 && false && true;
        boolean b3 = b2 || true;
        boolean b4 = !b2;
        boolean b5 = !(b4 && b2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        /* Example 1: (if isRaining || isCold -> wear a jacket)
        Above statement states that either isRaining or isCold, you must wear a jacket.
         */

        // Example 2: (if n>= 1 && n <= 10 -> n is btw 1 and 10)
    }
}

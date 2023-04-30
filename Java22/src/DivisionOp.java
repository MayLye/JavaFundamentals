// Title: Dividing Operators in Java

public class DivisionOp {
    public static void main(String[] args) {
        // Diving Integers: Dividing an int by an int gives an int.
        System.out.println(1/2);
        double d = 1/2; // double = int -> implicit casting
        int i = 1/2; // int = int

        // Dividing Doubles: Dividing a double by a double gives a double.
        System.out.println(1.0/2.0); // 0.5
        double d1 = 1.0/2.0; // double = double
        // int i1 = 1.0/2.0; Error, due to assigning double to integer.

        // Dividing Floats: Dividing a float by a float gives a float.
        System.out.println(1.0f/2.0f);
        double d2 = 1.0f/2.0f; // No problem assigning float to double. Implicit casting.
        // int i = 1.0f/2.0f; // Error, due to assigning float to integer.

        // Dividing Integers and Doubles: The integer will be casted to a double automatically.
        System.out.println(1/2.0);
        System.out.println(1.0/2);

        // Dividing Floats and Doubles: The float will be casted to a double automatically.
        System.out.println(1.0f/2.0);
        System.out.println(1.0/2.0f);

        // Dividing Floats and Integers: The integer will be casted to a float automatically.
        System.out.println(1.0f/2);
        System.out.println(1/2.0f);

        // Example 1:
        int i1 = 1/2; // int = int
        // int i2 = 1.0/2; // Error, int = double
        int i3 = (int) (1.0/2); // int = int
        int i4 = (int) (1.0f/2); // int = int
        int i5 = (int) 1.0f/2; // int = int
        // int i6 = 1.0f/(int)2; // Error, due to assigning integer to float.
        double i7 = 1.0/2; // double = double
        double i8 = 1/2; // assigning double to integer
        double i9 = (double) 1/2; // double = double
        float i10 = 1.0f/2.0f; // float = float
        float i11 = 1/2; // assigning float to integer.

        // Example 2:
        int e1 = 3;
        int e2 = 2;
        double dd1 = 2;
        System.out.println(e1/e2);
        System.out.println(e1/dd1);
        System.out.println((double) e1/e2);
        System.out.println(e1/(double) e2);
        System.out.println((double) e1/(double) e2);
        System.out.println((double) (e1/e2)); // calculate (e1/e2) first, then convert to double.
        
    }
}

/*
Refer Casting class for explicit and implicit casting.
 */
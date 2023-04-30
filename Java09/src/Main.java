// Title: Bytes and Values; Double and Float

public class Main {

    // To find out the range of each datatypes, as follows:
    public static void main(String[] args) {
        // Integer
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // Short
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        // Float and Double
        float f1 = 4.5F; // 'F' is to tell Java it is a float.
        float f2 = 7; // Float can also store Integer, but Integer cannot store Float
        double d1 = 10.6;
        double d2 = 10.64F; // Double can also store Float, but Float cannot store Double.
        double d3 = 12; // Double can also store Integer, but Integer cannot store Double.
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(f2 - 2.7);
    }

}
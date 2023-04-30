// Title: Casting
// Converting a data type to another type.

public class Casting {

    public static void main(String[] args) {
        /* Implicit Casting: converting from narrower range to wider range data type.
        Done automatically. No data is lost. There is no problem for a larger range data type to store narrower ones.
        Eg: Converting an int to a double/float/long.
        Eg: Converting a float to a double.
     */
        double d1 = 4;      // int -> double
        double d2 = 5.7f;   // float -> double
        long l1 = 100;      // int -> long

    /* Explicit Casting: converting from wider range to narrower range data type.
        Does not happen automatically. Might lose some data.
        Eg: Converting a double/float/long to an int.
        Eg: Converting a double to a float.
     */
    /* Errors!!!! Due to data loss:
        int i1 = 4.5; -> Syntax error, trying to store a double inside int.
        int i2 = 8L;
        float f1 = 4.5;
        double d1 = 4.5 + 3; -> Every arithmetic operator should be applied btw values of the same type.
     */
        // To do explicit casting properly, use (new data type) expression:
        int i1 = (int) 4.5;
        int i2 = (int) 8L;
        float f1 = (float) 4.5;
        double d3 = 4.5 + (double)3;

        double d = 4.2;
        int i = (int) d; // convert d to integer.The variable being casted will not changed.
        System.out.println(i);
    }
}
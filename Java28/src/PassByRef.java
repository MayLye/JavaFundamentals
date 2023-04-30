// Title: Passing Arguments by Reference
/*
Pass-by-reference passes the parameters as a reference. It does not create a new copy, but refer to its original value only.
Hence, changes in the new value will affect the original value as well.
 */

import java.awt.*;

public class PassByRef {

    public static void main(String[] args) {
        /*
        Create a variable p1 and assign it to type Point.
        Instantiating it using the 'new' keyword.
        In Java, there is a class called Point. Therefore we can create objects that are points.
         */
        Point p1 = new Point();
        /*
        These point objects has a field called x and another field called y.
         */
        p1.x = 1; // Assigning x to 1.
        p1.y = 2; // Assigning y to 2.
        // Now p1 have value of (1, 2).
        System.out.println("x= " + p1.x + ", y= " + p1.y);
        change(p1); // Passing p1 to the method change which has a parameter p.
        System.out.println("x= " + p1.x + ", y= " + p1.y); // Values here changed to values of p.
    }

    private static void change (Point p) {
        // Assign p tp p1. Since p1 is the reference type, it contains the address of (1,2).
        // But we change the value of p to (2, 1), so do p1.
        p.x = 2; // Assigning x to 2.
        p.y = 1; // Assigning y to 1.
        // The values of p is (2, 1)
    }

}

/* Note:
Must use mutable object. String is immutable, therefore cannot be used in pass by reference.
 */
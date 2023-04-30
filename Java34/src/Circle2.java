// Title: Data Field Encapsulation

import java.awt.*;

public class Circle2 {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius >= 0) ? radius : 0;
        /*
        If the radius is greater or equal to zero, assigned it to this.radius.
        Otherwise, the radius is negative, and i assigned it to 0.
         */
    }

    private static int numberOfCircles;
    // Since it is private now, we cannot access using dot operator.
    /*
    We don't want user to be able to modify this variable,
    we only want to modify it when we create a new object, and that's inside constructor.
    That's i only create getter but not setter, to prevent user from modifying.
     */

    public static int getNumberOfCircles() { // Static method.
        return numberOfCircles;
    }
}



import java.awt.*;

// Invoking Constructors:
public class Circle {

    private Point center;
    private double radius;
    private static int k; // static variable

    public Circle() {
        /*this.center = new Point(1,1);
        this.radius = 1;*/
        this(new Point(1,1),1); // combine point and radius.
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public static void setK(int k) { // error
        Circle.k = k;
    }

    public static int getK() { // error
        return Circle.k;
    }

    // Static variables are also Class variables.
    // cannot use 'this' method inside static keyword.
}

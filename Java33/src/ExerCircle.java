// Practice: Creating a Class in Java

import java.awt.*;

public class ExerCircle {

    // Declare attributes:
    Point center;
    double radius;

    // Constructors are methods without return types, and should have same name as the class.

    ExerCircle() { // 1st Constructor: Takes no parameter.

    }

    /* Long method:
    ExerCircle(Point initialCenter, double initialRadius) { // 2nd Constructor: Takes 2 parameters.
        // Assigning attributes (center, radius) to be equals to parameters:
        center = initialCenter;
        radius = initialRadius;
    }*/

    ExerCircle(Point center, double radius) { // 2nd Constructor: Takes 2 parameters.
        // Assigning attributes (center, radius) to be equals to parameters:
        // Variables are equal to itself using 'this' keyword.
        this.center = center;
        this.radius = radius;
    }

    // All the methods are as follows:
    double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    void setCenter(Point center) {
        this.center = center;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
}

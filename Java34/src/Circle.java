
import java.awt.*;

public class Circle {
    Point center;
    double radius;
    static int numberOfCircles; // Static variable

    // Constructor:
    Circle() {
        numberOfCircles++; // default starts from 0.
    }

    Circle(Point center, double radius) {
        numberOfCircles++;
        this.center = center;
        this.radius = radius;
    }

    static int getNumberOfCircles() { // Static method.
        return numberOfCircles;
    }

}



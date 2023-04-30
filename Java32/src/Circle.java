// Title: Creating a Class

import java.awt.*;

/*
We use Circle class as our Main class since there is no main() method here.
This class is used to create Objects, not to run codes.
 */
class Circle {
    /* Defining Attributes:
    These two instance variables are the attributes, which declared directly inside the class.
    They can be accessed anywhere inside this class as well as all its methods.
     */
    // Each object we create in this class will have its own center and its own radius.
    Point center; // default: null
    double radius; // default: 0.0

    // Defining the Methods:
    double getPerimeter() { // returns perimeter of the Circle.
        return 2 * Math.PI * radius; // Radius is an attribute inside Circle class.
    }
    double getArea() {
        return Math.PI * radius * radius;
    }

    void setRadius(double newRadius) { // parameter: newRadius
        radius = newRadius;
    }
    void setCenter(Point newCenter) { // parameter: newCenter
        center = newCenter;
    }

    // Constructors:
    /*Circle (Point initialCenter, double initialRadius) {
        center = initialCenter;
        radius = initialRadius;
    }*/
}


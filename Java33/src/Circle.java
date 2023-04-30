// Title: Constructor

import java.awt.*;

class Circle {
    Point center;
    double radius;

    // Constructors:
    Circle (Point initialCenter, double initialRadius) {
        center = initialCenter;
        radius = initialRadius;
    }

    // Overloading Constructor Circle:
    Circle () {
        center = new Point(0,0);
        radius = 1;
    }

}


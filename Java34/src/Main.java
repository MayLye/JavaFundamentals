// Title: Static Variables and Static Methods

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Circle number " + Circle.numberOfCircles + " default.");

        // The center of c1 is (1,2) and radius is 3.
        Circle c1 = new Circle(new Point(1, 2), 3);
        System.out.println("Circle number " + Circle.numberOfCircles);
        System.out.println("c1 radius = " + c1.radius);
        c1.numberOfCircles = 10;

        // The center of c2 is (2,3) and radius is 2.
        Circle c2 = new Circle(new Point(2, 3), 2);
        System.out.println("Circle number " + Circle.numberOfCircles);
        System.out.println("c2 radius = " + c2.radius);

        // Try access the static method:
        System.out.println("Accessing using static method: ");
        System.out.println("Circle c2 = " + c2.getNumberOfCircles());

        // Changing values:
        System.out.println("Changed values: ");
        c1.radius = 4;
        c2.radius = 8;
        System.out.println("c1 radius = " + c1.radius);
        System.out.println("c2 radius = " + c2.radius);
    }
}

// how to share data between instances of the same class?
// Each data has its own attributes that are independent from other objects.
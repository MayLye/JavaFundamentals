// Title: Instantiating a Circle Object

import java.awt.*;

public class Circle2 {
    public static void main(String[] args) {
        /*
        We are using the type Circle which refers to the Circle class, and declare its variable as c1.
        Circle() is the default constructor which doesn't take any parameter.
         */
        System.out.println("Default value: ");
        Circle c1 = new Circle(); // c1 will have the same attributes as Circle.
        // Using dot operator to access its attributes here. Without assigning, valuess are default.
        System.out.println(c1.center);
        System.out.println(c1.radius);
        System.out.println();
        // Assigning values to attributes:
        System.out.println("Assigning values: ");
        c1.center = new Point(0,0);
        c1.radius = 3;
        System.out.println(c1.center);
        System.out.println(c1.radius);
        System.out.println();
        // Changing values of attributes:
        System.out.println("Changing values: ");
        c1.setCenter(new Point(1,2));
        c1.setRadius(5);
        System.out.println(c1.center);
        System.out.println(c1.radius);
        System.out.println();
        // get area and perimeter:
        System.out.println("Getting Area and Perimeter: ");
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());

    }

}




import java.awt.*;

public class CircleInst {
    public static void main(String[] args) {

        /*
        Calling the constructor Circle and takes two arguments.
        Use constructor to initialize the attributes of our object, or simply initialize our objects.
         */
        System.out.println("Normal Constructor: ");
        Circle c1 = new Circle(new Point(3,1),2);
        System.out.println(c1.center);
        System.out.println(c1.radius);
        System.out.println();
        System.out.println("Overloaded Constructor: ");
        Circle c0 = new Circle();
        System.out.println(c0.center);
        System.out.println(c0.radius);
        System.out.println();

        // Overloaded point constructor:
        System.out.println("Overloaded Point Constrcutor: ");
        Point p1 = new Point();
        System.out.println(p1);
        Point p2 = new Point(1,2);
        System.out.println(p2);

    }

}



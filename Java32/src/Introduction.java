// Title: Introduction to Classes and Objects
/*
Class: is a template or blueprint that defines the data fields and actions of an Object.
    - eg: We can create a point object from the class point. This object has some fields and some methods.
Object: is an instance of a Class. Objects of the same type are created or instantiated from the same class.
Constructor: is a special method used to initialize Objects.
 */

import java.awt.*;

public class Introduction {
    public static void main(String[] args) {
        // Identity of an object: is what makes an object unique.
        Point p1 = new Point(0, 1);
        /*
        Constructor takes two arguments, the value of the accessor and the ordinate.
        It initializes x to be 0, and y to be 1.
         */
        Point p2 = new Point(0, 1);
        // The points (0,1) are created inside the memory and store inside p1, p2 objects.
        System.out.println(p1 == p2);
        /*
        false, because address inside p1 is different from p2.
        Therefore, (identity=address) in objects.
         */
        /*
        Both p1 and p2 variables are from the same class, with the same type which is Point.
        This means that they have the same data fields and the same methods.
        Therefore, they have the same behaviour or same actions.
         */
    }

    /*public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }*/
}
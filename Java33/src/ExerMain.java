// Practice: Creating a Class in Java

import java.awt.*;

public class ExerMain {
    public static void main(String[] args) {
        // Tips: press CTRL+P to show parameters pop-up.
        ExerCircle c1 = new ExerCircle(new Point(1,2),3);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}

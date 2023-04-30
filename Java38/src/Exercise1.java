// Title: Classes and Objects Exercises

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3]; // All 3 arrays are null.
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to enter height and width? (y/n)"); // enter character y or n.
        for (int i = 0; i < rectangles.length; i++) {
            char choice = input.next().charAt(0);
            if (choice == 'y') {
                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble()); // enter width and height.
            } else {
                rectangles[i] = new Rectangle(); // default is 1.0 and 1.0
            }
            System.out.println("Rectangle " + (i + 1) +
                    ": width:" + rectangles[i].getWidth() +
                    ", height: " + rectangles[i].getHeight());
        } // repeat y/n and width, height for 2nd and 3rd rectangle.
    }
}
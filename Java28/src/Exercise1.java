// Exercise 1 (Methods):
/*
Write a method that gets the name of the user and a method that gets the age of the user.
 */

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Enter your name and age: ");
        System.out.println(getName() + " " + getAge());
    }

    // this getName() method should get the name of the user and return his name, which is String type.
    public static String getName() { // this getName() method takes no paramter.
        // We want to read the name of the user and returns it.
        return new Scanner(System.in).nextLine(); // Use this shorter scanner for one time usage.

        /* Don't need this long method because we ar going to use the scanner only once.
        Scanner input = new Scanner(System.in);
        return input.nextLine();
         */
    }

    // this getAge() method will read the age of the user and returns a double type.
    public static double getAge() {
        return new Scanner(System.in).nextDouble();
    }
}

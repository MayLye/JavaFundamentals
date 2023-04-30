// Title: Scanner Class in Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = "Kids";
        System.out.println("Big" + userName);

        // Instantiating a Scanner Object: Creating a variable of type Scanner.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        System.out.println("My name is " + input.next());

        // Input Methods: used to read specific types of data from the keyboard.
        input.next(); // Read a String.
        input.nextInt(); // Read an Integer.
        input.nextDouble(); // Read a Double
        input.nextByte();
        input.nextShort();
        input.nextLong();
        input.nextFloat();
        input.nextBoolean();
        /*
        When one of these methods is called, the program will pause execution and wait for the user to enter a value,
        the entered value will be returned by these methods.
         */

    }
}

// Scanner class is used to get user input using (java.util.Scanner) and parse them into primitive data types.
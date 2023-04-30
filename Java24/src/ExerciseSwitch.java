// Write a program that reads an integer from the user and determines if the integer is even or odd.

/* Algortihm:
    1. Display a proper message for the user.
    2. Read the integer from the user.
    3. Test if the integer is even or odd and display a proper message.
 */

import java.util.Scanner;

public class ExerciseSwitch {

    public static void main(String[] args) {
        // Display a proper message for the user.
        System.out.println("Enter a number: ");

        // Read input from the user.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // Test if the integer is even or odd and display a proper message.
        switch (n%2) {
            case 0:
                System.out.println("even");
                break;
            default:
                System.out.println("odd");
        }
    }
}

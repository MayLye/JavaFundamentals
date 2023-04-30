// Create a calculator (+, -, *, /):
/* Algorithm:
    enter num1 operator num2:
    the result is: 1.5
    enter num1 operator num2:
    the result is: 3.0
 */

import java.util.Scanner;

public class ExerciseIfElse1 {

    public static void main(String[] args) {
        // Display a proper message for the user.
        System.out.println("Enter num1 op num2 (5*7): ");

        // Read input from the user.
        Scanner input = new Scanner(System.in);
        double d1 = input.nextDouble();
        char op = input.next().charAt(0);
        double d2 = input.nextDouble();

        // Test if the integer is even or odd and display a proper message.
        if (op == '+')
            System.out.println((int)(d1 + d2));
        else if (op == '-')
            System.out.println((int)(d1 - d2));
        else if (op == '/')
            System.out.println(d1 / d2);
        else if (op == '*')
            System.out.println((int)(d1 * d2));
        else
            System.out.println("Invalid operator.");
    }
}

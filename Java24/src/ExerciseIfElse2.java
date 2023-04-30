// A four-digit number ABCD is called Lucky if A+B=C+D.
/* Algorithm:
    Write a program that asks the user to enter a four-digit number and tell if the number is a Lucky number or not.
 */

/* Modulo & Dividion:
    1234 % 10 = 4
    1234 %100 = 34
    (1234/10) % 10 = 123%10 = 3
    (1234/100) % 10 = 12%10 = 2
    (1234/1000) % 10 = 1%10 =1
 */

import java.util.Scanner;

public class ExerciseIfElse2 {

    public static void main(String[] args) {

        // Read input from the user.
        Scanner input = new Scanner(System.in);
        System.out.println("enter a four-digit number: ");
        int n = input.nextInt();

        if(!(n>999 && n<10000)) {
            System.out.println(n + " is not a four-digit number.");
        } else {
            // ABCD
            int fourthD = n%10; // D
            int thirdD = (n/10)%10; // ABC%10=C
            int secondD = (n/100)%10; // AB%10=B
            int firstD = (n/1000)%10; // A%10=A

            if(firstD + secondD == thirdD + fourthD)
                System.out.println("lucky");
            else
                System.out.println("not lucky");
        }
    }
}

// Write a program that reads an integer btw 1 and 10 from the user.
/* Algorithm:
    enter a number btw 1 and 10: -5
    -5 is not btw 1 and 10: 15
    15 is not btw 1 and 10. Try again: 7
    7 is btw 1 and 10. Thanks!
 */

import java.util.Scanner;

public class ExeWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n<1 || n>10) { // n is not btw 1 and 10.
            System.out.print(n + " is not btw 1 and 10. Thanks!");
            n = input.nextInt();
        }
        System.out.println(n + " is btw 1 and 10. Thanks!");

    }
}

/* Algorithm:
    enter a number btw 1 and 10: -11
    -5 is not btw 1 and 10: 20
    15 is not btw 1 and 10. Try again: 3
    3 is btw 1 and 10. Thanks!
 */

import java.util.Scanner;

public class ExeDoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("enter a number between 1 and 10: ");
            n = input.nextInt();
        } while (n<1 || n>10);
        System.out.println(n + " is between 1 and 10.");

    }
}

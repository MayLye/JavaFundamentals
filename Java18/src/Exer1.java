// Exercise 1: Read the user's favourite number and display it in a message.

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favourite integer: ");
        System.out.println(input.nextInt() + " is my favourite integer too!");
    }

}

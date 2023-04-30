// Exercise 2: Read the user's name and age and display it in a proper message.

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("What is your name?");
        System.out.println("My name is " + input.nextLine());
        System.out.println("How old are you?");
        System.out.println("I am " + input.nextInt() + " years old.");*/
        System.out.println("Enter your name and age: ");
        System.out.println("My name is " + input.nextLine() + ", I am " + input.nextInt() + " years old.");
    }

}

// Title: Arrays (Exercise 1)
/*
Write a program that fills an array with n integers entered by the user.
Suppose that the user can enter at least 1 number and at most 20 numbers.
Resolve it with array of points.
 */

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExe1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: (Max is 20) ");
        int n = input.nextInt(); // input n integers.
        while (n > 20 || n <= 0) { // as long as n is not btw 1 and 20.
            System.out.println("Invalid number, try again: ");
            n = input.nextInt();
        }

        // To get arrays of integers:
        int[] numbers = new int[n]; // if i is btw 1 and 20,
        fillArrayOfIntegers(numbers); // fill in the stated number of elements:
        printArrayOfIntegers(numbers); // Print out all the filled elements.

        // To get arrays of points:
        Point[] points = new Point[n];
        fillArrayOfPoints(points);
        printArrayOfPoints(points);
    }

    private static void fillArrayOfPoints(Point[] points) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < points.length; i++) {
            System.out.println("enter x and y for point: " + (i + 1) + ": ");
            // Access the elements at index i, and assign it to input.nextInt()
            points[i] = new Point(input.nextInt(), input.nextInt());
        }
    }

    private static void printArrayOfPoints(Point[] points) {
        System.out.println("The elements are: ");
        for (int i = 0; i < points.length; i++) {
            System.out.println("(" + points[i].x + ", " + points[i].y + ")");
        }
    }


    private static void fillArrayOfIntegers(int[] numbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            // Access the elements at index i, and assign it to input.nextInt()
            numbers[i] = input.nextInt();
        }
    }

    private static void printArrayOfIntegers(int[] numbers) {
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }
}
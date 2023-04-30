// Title: Arrays (Exercise 2)
/*
Write a program that display the sum, product, and average of the elements of an integer array.
    Array: 1, 2, -3, 5, 7
    sum = 12, product = -210, average = 2.4.
 */

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExe2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 5, 7}; // array

        int sum = 0;
        int product = 1; // need to start with 1, because 0 x any numbers will always be 0.
        double average;

        for (int i = 0; i < numbers.length; i++) {
            // i<numbers.length -> as long as i is less than the length of the array.
            sum += numbers[i]; // 1+2-3+5+7=12
            product *= numbers[i]; // 2*(-3)*5*7=-210
        }

        // casting double to sum
        average = (double) sum / numbers.length; // avarge=sum/5=12/5=2.4
        // Concatenate and print:
        System.out.println("sum= " + sum + ", product=" + product + ", average: " + average);
    }
}
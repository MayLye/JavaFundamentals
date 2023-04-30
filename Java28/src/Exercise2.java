// Exercise 2 (Methods):
/*
Write a method that prints the prime numbers between two numbers.
Divide the program into multiple reusable methods.
Example of: Prime numbers btw 1 and 50: 1 2 3 5 7 11.........
    While loop over all the numbers btw 1 to 50, we want to check if there is prime number.
    If have, we are going to print it.
    We need 2 methods: one to find the prime numbers, and one to prints it.
 */

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        printPrimeBetween(1, 50);
    }

    // Both isPrime and printPrimeBetween methods are reusable.

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; // this statement will never be excuted if n is a prime number.
            }
        }
        return true;
    }

    private static void printPrimeBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                // passing i as the argument. If i is prime method, this method will return true.
                // if i is not a prime number, return false. But we won't print it, instead we back to increment i until we find a prime number.
                System.out.println(i + " ");
            }
        }
    }


}

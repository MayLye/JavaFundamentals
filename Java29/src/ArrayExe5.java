// Title: Arrays (Exercise 5)
/*
Write a program that places the odd elements of an array before the even elements.
    Given array: int[] numbers = {1,2,4,5,7,9,-2,3};
    Modified array: [1,5,7,9,3,-2,4,2], all the odds elements come before even elements.
 */
/*
Both original and temporary array must have same number of elements.
Original array: numbers = [1,2,4,5,7,9,-2,3]; use variable i.
Temporary array: temp = [0,0,0,0,0,0,0,0]; variable from j to k.
                            temp[j] = numbers[i];
                            temp[k] = numbers[i];
Simplify above formulae:    temp[j++] = numbers[i];
                            temp[k--] = numbers[i];
Upon completion, copy the temporary array to the original array.
 */

import java.util.Arrays;

public class ArrayExe5 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 7, 9, -2, 3}; // Original array
        int[] temp = new int[numbers.length]; // Temporary array
        // numbers.length -> length of the 'number' array.
        int j = 0;
        int k = numbers.length - 1;

        // Iterate over our original array using for loop.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) { // to find out odd numbers, let remainder not equal to 0.
                temp[j++] = numbers[i];
            } else {
                temp[k--] = numbers[i];
            }
        }
        copyArray(temp, numbers); // copy numbers array into temp array.
        System.out.println(Arrays.toString(numbers));
    }

    private static void copyArray(int[] temp, int[] numbers) {
        // You can also use numbers.length, since both temp and original have same length.
        for (int i = 0; i < temp.length; i++) {
            numbers[i] = temp[i];
        }
        // After this, our original array will be modified to the result that we want.
    }

}
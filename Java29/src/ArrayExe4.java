// Title: Arrays (Exercise 4)
/*
Write a program that display the maximum and minimum elements of an array.
    Array: 3,2,1,5,4
    min=1, max=5.
 */
/*
This time the numbers are inside the array, and are not given by the user as previous exercise.
 */

public class ArrayExe4 {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, -3, 5}; // we have an array of integers.
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) { // Let's iterate over the elements.
            /*
            If the current element is greater than the maximum, then we will have a new maximum;
            If this is true, the max element will be equal to the current element;
            If this is not true, it will remain equal to itself.
             */
           // Long formula -> max = (numbers[i] > max) ? numbers[i] : max;
            max = Math.max(numbers[i], max);
            /*
            If the current element is less than the minimum, then we will have a new minimum;
            If this is true, the min element will be equal to the current element;
            If this is not true, it will remain equal to itself.
            This time the numbers are inside an array.
             */
            // Lng formula -> min = (numbers[i] < min) ? numbers[i] : min;
            min = Math.min(numbers[i], min);
        }
        System.out.println("max= " + max + ", min= " + min);
    }

}
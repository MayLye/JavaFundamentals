// Title: Arrays (Exercise 3)
/*
Write a program that display the number of occurrences of an element in the array.
    Array: 1,1,1,2,3,4
    3 occurs 1 time
    1 occurs 3 times
    7 occurs 0 time
 */

public class ArrayExe3 {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 3, 4}; // we have an array of integers.
        int searchElement = 3; // we will search for 3 in the array.
        int searchMore = 1;

        // Print the number of occurrences of the searchElement.
        System.out.println(getNumberOcc(numbers, searchElement)); // The searchElement is 3, which occurs only once.
        System.out.println(getNumberOcc(numbers, searchMore)); // The searchMore is 1, which occurs 3 times.
    }

    // returns an integer because the number of occurences will be an integer.
    public static int getNumberOcc(int[] numbers, int searchElement) {
        int occ = 0; // create a variable which will hold the number of occurrences and starts at 0.
        /*
        Iterate over all the elements in the array. Each time we will compare the elements at the index i to our searchElement.
        If they are equal, means we found an occurence in the array. So we are going to increment the occurrence variable.
         */
        // Let's iterate over the array starting from 0 up to the final element.
        for (int i = 0; i < numbers.length; i++) {
            if (searchElement == numbers[i]) { // test if the searchElement is equal to the element at index i.
                                                // Condition always false during iteration so we do not modify the occ variable.
                occ++;
            }
        }
        return occ;
    }
}
// Title: Two-Dimensional Array (Exercise 2)
/*
Write a program that prints the maximum of each row in a 2D array.
 */

public class Array2Dexe2 {

    public static void main(String[] args) {
        int[][] integers = {
                {1, 10, 3, 8},  // Max of Row1: 10
                {9, 12, 6, 7},  // Max of Row2: 12
                {5, 2, 11, 4}   // Max of Row3: 11
        };

        // Method 1:
        System.out.println("Method 1: ");
        for (int i = 0; i < 3; i++) {
            int max = integers[i][0]; // we want to get the maximum of the elements in the current row.
            for (int j = 1; j < 4; j++) {
                // Starting from 1 assuming the 1st element is the maximum.
                // Long formula: max = (integers[i][j] > max) ? integers[i][j] : max;
                max = Math.max(integers[i][j], max);
            }
            System.out.println("Row " + (i + 1) + ": " + max);
        }

        System.out.println();

        // Method 2:
        System.out.println("Method 2: ");
        for (int k = 0; k < 3; k++) {
            System.out.println("Row " + (k + 1) + ": " + getMax(integers[k]));
        }
    }

    private static int getMax(int[] integers) {
        int max2 = integers[0];
        /* Long formula:
        for (int k = 0; k < integers.length; k++) {
            max2 = (max2 < integers[k]) ? integers[k] : max2;
        }
         */
        for (int integer : integers) { // use enhanced for-loop.
            max2 = Math.max(max2, integer);
        }
        return max2;
    }

}
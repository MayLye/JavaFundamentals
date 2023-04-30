// Title: Two-Dimensional Array (Exercise 1)
/*
Write a program that prints the sum of each row in a 2D array.
Resolve the exercise and print the sum of each column.
 */

public class Array2Dexe1 {

    public static void main(String[] args) {
        int[][] integers = {
                {1, 2, 3, 4},   // Sum of Row1: 10
                {5, 6, 7, 8},   // Sum of Row2: 26
                {9, 10, 11, 12} // Sum of Row3: 42
                // Sum of Column1: 15
                // Sum of Column2: 18
                // Sum of Column3: 21
                // Sum of Column4: 24
        };

        // To perform the summation of rows:
        int sum = 0;
        for (int i = 0; i < 3; i++) { // number of rows = 3; iterate over rows.
            sum = 0; // 1st iteration, variable sum will be 0.
            // During the 1st iteration, we will add all the elements in the 1st row to sum.
            // During the 2nd iteration, we will add all the elements in the 2nd row to sum.
            // During the 3rd iteration, we will add all the elements in the 3rd row to sum.
            for (int j = 0; j < 4; j++) { // number of columns = 4; iterate over columns.
                sum += integers[i][j]; // row x column
                // Now the variable sum contains the sum of all the elements inside the array.
            }
            System.out.println("The sum of row " + (i + 1) + ": " + sum);
        }

        // To perform the summation of columns:
        int sumC = 0;
        for (int i = 0; i < 4; i++) { // number of columns = 4; iterate over columns.
            sumC = 0; // 1st iteration, variable sumC will be 0.
            // During the 1st iteration, we will add all the elements in the 1st column to sum.
            // During the 2nd iteration, we will add all the elements in the 2nd column to sum.
            // During the 3rd iteration, we will add all the elements in the 3rd column to sum.
            // During the 4th iteration, we will add all the elements in the 4th column to sum.
            for (int j = 0; j < 3; j++) { // number of rows = 3; iterate over rows.
                sumC += integers[j][i]; // column x row
                // Now the variable sum contains the sum of all the elements inside the array.
            }
            System.out.println("The sum of column " + (i + 1) + ": " + sumC);
        }
    }
}
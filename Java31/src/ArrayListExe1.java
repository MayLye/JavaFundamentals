// Title: ArrayLists (Exercise 1)
/*
Create a list of unique elements taken from the user. Sort and print these elements.
    Enter 10 integers: 1 8 9 2 6 6 3 3 5 5
    Your unique sorted elements: [1,2,3,5,6,8,9]
    Enter 10 integers: 1 1 1 1 1 1 1 1 1 2
    Your unique sorted elements: [1,2]
    Enter 10 integers: Big Big Kids Kids Apps
    Your unique sorted elements: [Big, Kids, Apps]
 */
/*
1. Read N elements from the user.
2. If the element does not exist in the ArrayList, add it.
3. Sort the ArrayList using Collections.sort().
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExe1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("Enter 5 integers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int temp = input.nextInt();

            if (!integers.contains(temp)) {
                integers.add(temp);
            }
            Collections.sort(integers);
            System.out.println(integers);
        }
    }
}
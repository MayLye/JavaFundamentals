/* Exercise:
Write a program which prints the even numbers between 1 and 100 in an increasing order.
2 4 6 8 10 12 14 16 18 ....100
Resolve in a decreasing order.
100 98 96 94 92 90......2
 */

/* Algorithm:
    1-Iterate over the numbers btw 1 and 100.
    2-If i is even, print i.
 */

public class Loop01 {

    public static void main(String[] args) {

        System.out.println("Increasing order: ");
        for (int i = 1; i <= 100; i++) { // Increasing order
            if (i % 2 == 0) { // even numbers. Any numbers divided by 2 gives a remainder of 0.
                System.out.println(i + " ");
            }
        }
        System.out.println();
        System.out.println("Decreasing order: ");
        for (int i = 100; i >= 1; i--) { // Decreasing order
            if (i % 2 == 0) { // even numbers. Any numbers divided by 2 gives a remainder of 0.
                System.out.println(i + " ");
            }
        }
        System.out.println();
        System.out.println("Another method for increasing order: ");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Using while loop for increasing order: ");
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) { // even numbers. Any numbers divided by 2 gives a remainder of 0.
                System.out.println(i + " ");
            }
            i++;
        }

    }
}
// Title: Passing Arguments by Value
/*
You pass a copy of the value in memory. The function operates on the copy.
Therefore the copy changes but the original value in the memory is not affected.
 */

public class PassByValue {

    public static void main(String[] args) {
        // Calling the method sum. Passing 1 to be the value of x, and 2 to be the value of y.
        sum (1,2); // (1, 2) are the arguments.
        System.out.println("Passing Arguments by Value: ");
        int x = 1; // Declaring x = 1 as a local variable inside the main method.
        // Calling a method increment and passing x as a parameter.
        // We are passing x as arguments to the increment method below.
        increment(x);
        System.out.println(x); // this x not affected by the x in increment method, it is still x=1.
    }

    public static int sum (int x, int y) {
        // Parameters: int x, int y.
        return x + y;
    }

    public static void increment(int x) { // x = 1
        x++; // x = x + 1 = 2
        System.out.println(x); // x here has a new value of 2.
    }

}

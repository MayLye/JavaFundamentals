// Title: Scope and Local Variables in Java.
/* Scope:
The scope of a variable is the part of the program where the variable can be referenced/used.
    - A variable defined inside a method is called a local variable.
    - The scope of a local variable starts from its declaration and continues to the end of the block that contains the variable.
    - A local variable must be declared and assigned a value before it can be used.
    - Parameters are also local variables, their scopes is the whole method.
 */

public class Scope {

    // the block of the main method starts from { and ends at }.
    public static void main(String[] args) {
        /*
        The parameter over here is also a variable, called args.
        It is a local variable to the main method and therefore can only be used inside the main method.
        The scope of variable args is the whole of main method, starting from { and ending at }.
         */
        int local1; // scopes of local1 starts from its declaration here, up to the end of main method.

        if (true) {
            int local2; // scope of local2 covers the whole if block, but not the whole main method. Cannot use outside if statement.
        }

        /*for (int local3=0; ;) {
            int local3 can only be used inside for loop.
        }*/

        System.out.println("Hello world!");
    }
}
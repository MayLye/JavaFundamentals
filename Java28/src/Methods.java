// Title: Methods in Java
// Void method: is a method that does not return a value. The return type is void.
// Value-returning method: A method that returns a value. The return type is the type of data that will be returned.
// Return keyword: A keyword that can be used to return a value from a method. When return statement is executed, we will exit the method.

public class Methods {

    // Usual main method:
    public static void main(String[] args) {

        System.out.println("Void Returning Method: ");
        System.out.println("Message1");
        sayHi(); // this main method will stop executing at this point, and will go and execute the sayHi() method.
        System.out.println("Message2");
        System.out.println();
        System.out.println("Calling sum method: ");
        System.out.println("message1");
        System.out.println(sum2(1, 2)); // assign 1 to x, and 2 to y. x+y=1+2=3
        System.out.println(sum2(1, 2) + sum(3, 5)); // assign 3 to x, and 5 to y. 3+5=8. 3+8=11.
        System.out.println("message2");
        System.out.println();
        System.out.println("Return keyword: ");
        sayHi2();
    }

    // void method:
    public static void sayHi() { /* this line is the header of the method,
                                    which contains modifiers,type,name and parameters.*/
        /*
        everything inside { } block is the body of the method where we write
        all the codes to be executed when it is being called.
         */
        /*
        public ->   A public method can be accessed from outside the class.
        static ->   With static method, we can call the method from inside the main method.
        void ->     This method type is void, means it does not returns a value.
        sayHi ->    Name of this method.
        () ->       Empty parentheses, means it does not take any parameters.
         */
        System.out.println("Hi");
    }

    // value-returning method:
    public static int sum(int x, int y) {
        /*
        int -> type
        sum -> name of this method.
        x and y -> parameters.Local variables.
         */
        int sum = x + y; // variable sum also a local variable. Initializing it to be x + y. Store x+y inside sum.
        return sum; // the value inside variable sum will be returned by this method.
    }

    // Calling sum:
    public static int sum2(int x, int y) {
        return x + y; // return the value to sum(x, y).
    }

    // Return Keyword:
    public static void sayHi2() {
        System.out.println("Hi2");
        return; // return to exit the method.
    }
}
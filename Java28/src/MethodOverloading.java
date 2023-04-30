// Title: Method Overloading
/*
Writing the same method with different parameters. It can also have different return types.
In other words, we can create multiple methods of the same name in the same class,
and all methods work in different ways.
 */
/*
Overloaded methods must have different parameters.
 */

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("Sum method overloading: ");
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,2));
        System.out.println();
        System.out.println("sayHi method overloading: ");
        sayHi(); // Definition that takes no parameter.
        System.out.println(sayHi("Big Kids Apps")); // Definition that takes parameter.
    }


    // Overloading of method sum, by defining 2 definitions. Each definitions takes different number of parameters.
    public static int sum (int x, int y) {
        // This method takes 2 parameters and returns an integer which is x+y.
        return x + y;
    }
    public static int sum (int x, int y, int z) {
        // Defining the same parameter called sum, but it takes 3 parameters.
        return x + y + z;
    }

    // Overloading of method sayHi, with different return types.
    private static void sayHi() {
        System.out.println("Hi");
    }
    private static String sayHi(String name) {
        return "Hi " + name;
    }

}

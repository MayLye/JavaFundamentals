

public class BigKids {
    // This class doesn't have main method, therefore we must create it.
    // short form "psvm" for 'public static void main'
    // one class only can have one "main" method, which is the starting point of our program.
    public static void main(String[] args) {
        System.out.println("Before sayHi");
        // to call a function, we put the function name and its parameters. But this function got no parameters.
        sayHi();
    }

    // create a method for this class
    // sayHi() method is empty and without parameters.
    public static void sayHi() {
        // short form "sout" for 'System.out.println();'
        System.out.println("Hi from BigKids");
    }
}
// short form to run current class, press CTRL+SHIFT+F10

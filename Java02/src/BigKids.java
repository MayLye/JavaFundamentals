// Public, Private and Static

public class BigKids {

    public static void main(String[] args) {
        sayHi(); // No error because private method can be used within same class.
        /*
        BigKids.sayHi3()
        Error because without static keyword, cannot access the method using the class name.
         */
    }

    private static void sayHi() {

    }

    public static void sayHi2() {

    }

    public void sayHi3() {

    }
    // static allows us the call the method using the class name.
}

// Access Modifier: Specify how to access classes, methods, and fields.

/*
Public Access Modifier: The access level is everywhere.
- Inside/Outside a class.
- Inside/Outside the package.
*/

// Private Access Modifier: The access level is only inside the class.

/* Static Non-Access Modifier: Access fields/methods using the class name. Example: System.out.
Using the out field to access the System class. This means that out is the static field of System
 */
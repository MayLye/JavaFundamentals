// Title: Primitive Types Vs Reference Types

public class Main {
    public static void main(String[] args) {
        int i1 = 5; // Create a new variable called i1 and assign 5 to it.
        // i1 is a primitive type, therefore the variable contains the value.
        int i2 = i1; // Both are primitive type.
        // i1 and i2 are different, and they contain distinct values.
        // Literally means, we have a box called i and inside it we have the value 5. Each box has its own address.

        String s1 = "hello";
        // String is a Class and also a reference type.
        // s1 is a reference type, so it is an object and it is a String.
        String s2 = s1; // Both are reference type.
        /* Literally means, we have a box that contains the String "hello", with address 001.
        But we have another box which is called S with address 002, and this is our variable.
        The variable S contain the address of the value, which is 001. */
    }
}
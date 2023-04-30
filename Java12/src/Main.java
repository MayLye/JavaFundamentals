// Title: String Data Type in Java
/*
String is a class: which contains some static methods.
String Objects: Variables of type String also have some methods.
Calling some methods: System.out.println
 */
// Note: A new String is created and the original String is not modified.

public class Main {

    public static void main(String[] args) {
      //  String.valueOf(); // String is a class and valueOf is the static method.

      //  String name;
      //  name.contains(); // name is the variable and contains is the method.

        String text = "This is some text";
        text.toUpperCase(); // this method will return a new string which is "THIS IS SOME TEXT"
        System.out.println(text.toUpperCase());
    }

}
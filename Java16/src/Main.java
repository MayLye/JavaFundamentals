// Title: Instantiating a String Object: since String is a Class, we can create a variable of type String.

/*
ClassName objectName = new ClassName(Parameters);
ClassName(Parameters) is a special method called Constructor.
Eg: Point pointing = new Point(1, 3);
 */

public class Main {

    public static void main(String[] args) {
        String name1 = "Big Kids";
        String name2 = "Big Kids";
        String name3 = new String("Big Kids");
        // both name1 and name2 reference to the same value, but name3 reference to a new value.
    // using the 'new' keyword will allow a new value will be created and our object will reference the new value.

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }

}
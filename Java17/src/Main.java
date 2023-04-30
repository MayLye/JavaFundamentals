// Title: Strings are Immutable in Java

public class Main {
    public static void main(String[] args) {
        String str = "Old Value";
        // the content of "Old Value" cannot be changed as Strings are immutable in Java.
        str = "New Value";
        /* The "Old Value" cannot be replaced. But the reference to the "Old Value" will be removed,
        and create a new reference to the "New Value". Our object will now reference the "New Value".
        The "Old Value" now is consider 'Garbage' and will be removed from memory by the Java Garbage Collector.
         */
        System.out.println(str);

        String str1 = "Value1";
        String str2 = str1;
        // both str1 and str2 reference to the same value.
        str2 = "Value2";
        // a new value is created for str2, therefore the original value will not be affected.
    }
}

/* Immutable Objects are objects whose 'contents' cannot be changed. They are created from immutable classes.
Since Strings are immutable, we don't need to use the 'new' keyword, because even if you have many objects referencing the same value,
your value will never be modified.
Similar to Constant which is a variable whose 'value' cannot be changed.
 */
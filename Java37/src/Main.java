// Title: 'this' keyword
/* The 'this' keyword refers to the object itself.
    - Reference instance data fields.
    - Reference instance methods.
    - Invoke a Constructor.
 */

// This main method here use for Inner Classes topic.
public class Main {
    public static void main(String[] args) {
      //  Outer outer = new Outer();
        // Using the outer object to access the inner object and instantiate it with 'new'.
        Outer.Inner inner = new Outer.Inner();
        inner.innerX = 5;
        inner.showX();
    }
}
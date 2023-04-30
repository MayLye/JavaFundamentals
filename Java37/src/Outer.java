// Title: Inner Classes
/* An Inner Class is a class inside another class.
    - It have member class and static member class.
    - It can access private members of the containing class. It has a private access modifier.
 */

public class Outer {
    private static int outerX;

    // We cannot access non-static members inside a static method.
    static class Inner { // static member class.
        int innerX;

        void showX() {
            System.out.println(outerX + " " + innerX);
        }
    }

    public void demo() {
        Inner inner = new Inner();
        inner.innerX = 3;
        inner.showX();
    }

}

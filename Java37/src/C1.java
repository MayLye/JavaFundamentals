
// Referencing Data Fields:
public class C1 {
    private int x;

    public C1(int x) { // Constructor for C1.
        this.setX(x);
    }

    public void setX(int x) {
        this.x = x; // assigning parameter x to be equals to itself.
        // 'this' reference the object that is calling the method setX.
    }
}

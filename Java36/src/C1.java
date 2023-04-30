

/* Before adding C2 class:
class C1 {
    private int x; // Immutable as all data fields are private. We also don't have setter.

    public C1(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }
}*/

// After adding C2 class:
class C1 {
    private int x;
    private C2 c2; // Added private attribute of C2 and called c2.

    public C1(int x, C2 c2) { // Modified constructor C1 accordingly to have 2 arguments.
        this.x = x;
        this.c2 = c2;
    }

    public C2 getC2() { // Added a getter for attribute C2
        return this.c2; // Since C2 is mutable, object returned here will be mutable too.
    }

    public int getX() {
        return this.x;
    }
}

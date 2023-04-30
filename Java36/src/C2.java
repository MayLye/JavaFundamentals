

class C2 {
    // Mutable class
    private int x;

    public C2(int x) {
        this.x = x;
    }

    public void setX(int i) { // use this setter to change the attribute X eventhough private.
        this.x = x;
    }
}

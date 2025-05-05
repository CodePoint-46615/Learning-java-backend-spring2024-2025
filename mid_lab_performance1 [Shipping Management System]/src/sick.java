public enum sick {
    officer(10), 
    Staff(7);

    private int numVal;

    sick(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
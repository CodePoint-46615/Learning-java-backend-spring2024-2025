public enum vacation {
    officer(15), 
    Staff(10);

    private int numVal;

    vacation(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
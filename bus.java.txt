package BRSpackage;

public class bus {

    private int busno;
    private boolean ac;
    private int capacity;

    bus(int no, boolean ac, int cap) {
        this.busno = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBusno() {
        return busno;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    // FIXED SETTERS
    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("busno: " + busno +
                " ac: " + ac +
                " capacity: " + capacity);
    }
}
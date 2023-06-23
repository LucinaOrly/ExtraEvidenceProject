// IntervalRecord class
public class Interval {
	private int number;
    private Data data; // an interface
    public Interval() {
        // Default constructor
        number = 0; // Set an initial value for the number
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = Math.abs(number);
    } 
}

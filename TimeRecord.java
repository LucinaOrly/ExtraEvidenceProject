import java.util.ArrayList<IntervalRecords>
public class TimeRecord {
    final int NUM_INTERVALS = 6;
    final int OBSERVATION_TIME = 10;
    final int RECORD_TIME = 10;

    private ArrayList<IntervalRecord> list;

    public TimeRecord() {
    // default constructor;
        this(NUM_INTERVALS);
    }
    public TimeRecord(int size) {
        if (size < 0) throw new NegativeArraySizeException("Cannot have negative Intervals");
        list = new ArrayList<IntervalRecord>(size);
    }

    public void AddRecord(IntervalRecord record) {
        list.add(record);
    }
}

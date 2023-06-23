private enum OffTaskValue {
    P, N, M, O
}

public class OffTask implements Data {
    private OffTaskValue = value;

    public OffTask {
    // default constructor
    }
    public OffTaskValue getData {
        return value;
    } 
    public bool setData(OffTaskValue value) {
        this.value = value;
    }
	@Override
	public String toString() {
		String str = "";
		switch(value.Value()) {
		case P: str = "On Task"; break;
		case N: str = "Off Task (Noise)"; break;
		case M: str = "Off Task (Motor)"; break;
		case O: str = "Off Task (Other)"; break;
		}
		return str;
	}
}

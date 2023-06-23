private enum TeacherReinforcementValue {
    AS, AA, DS, DA, ASM, AAM, DSM, DAM
}

public class TeacherReinforcement implements Data {
    private TeacherReinforcementValue value;
    
    public TeacherReinforcement {
    // default constructor
    }
    public TeacherReinforcementValue getData {
        return value;
    } 
    public bool setData(TeacherReinforcementValue value) {
        this.value = value;
    }
	@Override
	public String toString() {
		String str = "";
		switch(value.Value()) {
		case AS: str = "Approval Social"; break;
		case AA: str = "Approval Academic"; break;
		case DS: str = "Disapproval Social"; break;
		case DA: str = "Disapproval Academic"; break;

		case ASM: str = "Approval Social Mistake"; break;
		case AAM: str = "Approval Academic Mistake"; break;
		case DSM: str = "Disapproval Social Mistake"; break;
		case DAM: str = "Disapproval Academic Mistake"; break;
		}
		return str;
	}
}

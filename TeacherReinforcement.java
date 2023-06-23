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
}

public class StudentMeta extends Meta {
    private String Student;

    public StudentMeta() {
        super(); // Invokes the default constructor of the superclass
    }

    // Setter and getter for Student
    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }
}

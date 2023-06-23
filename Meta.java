// Meta

import java.util.Date;
import java.sql.Time;

public class Meta {
    private String Observer;
    private String Teacher;
    private String ReliabilityObserver;
    private String GradeOrSubject;
    private Date date;
    private Time start;
    private Time end;
    private double ObservationInterval;
    private double RecordInterval;

    public Meta() {
        // Default constructor
    }

    // Setter and getter for Observer
    public String getObserver() {
        return Observer;
    }

    public void setObserver(String observer) {
        Observer = observer;
    }

    // Setter and getter for Teacher
    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    // Setter and getter for ReliabilityObserver
    public String getReliabilityObserver() {
        return ReliabilityObserver;
    }

    public void setReliabilityObserver(String reliabilityObserver) {
        ReliabilityObserver = reliabilityObserver;
    }

    // Setter and getter for GradeOrSubject
    public String getGradeOrSubject() {
        return GradeOrSubject;
    }

    public void setGradeOrSubject(String gradeOrSubject) {
        GradeOrSubject = gradeOrSubject;
    }

    // Setter and getter for date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Setter and getter for start
    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    // Setter and getter for end
    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    // Setter and getter for ObservationInterval
    public double getObservationInterval() {
        return ObservationInterval;
    }

    public void setObservationInterval(double observationInterval) {
        ObservationInterval = observationInterval;
    }

    // Setter and getter for RecordInterval
    public double getRecordInterval() {
        return RecordInterval;
    }
    
    public void setRecordInterval(double recordInterval) {
        RecordInterval = recordInterval;
    }
}

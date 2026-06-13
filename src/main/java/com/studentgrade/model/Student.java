import com.studentgrade.model.*;
abstract class Student {
    private String studentName;
    private String subjectName;
    private double marks;
    private String grade;

    public Student ( String studentName , String subjectName , double marks , String grade ) {
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.marks = marks;
        this.grade = grade;
    }

    public String getStudentName () {
        return studentName;
    }

    public String getSubjectName () {
        return subjectName;
    }

    public double getMarks () {
        return marks;
    }
}
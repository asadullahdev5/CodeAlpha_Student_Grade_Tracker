package com.studentgrade.model;

public class Student {
    private String studentName;
    private String subjectName;
    private double marks;

    public Student ( String studentName , String subjectName , double marks , String grade ) {
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.marks = marks;
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

    public String setStudentName () {
        return studentName;
    }

    public String setSubjectName () {
        return subjectName;
    }

    public double setMarks () {
        return marks;
    }

}
package com.studentgrade.service;

public class GradeService{
    private String studentgrade;

    public String calculateGrade(double marks){

        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A-";
        else if (marks >= 70)
            return "B+";
        else if (marks >= 60)
            return "B-";
        else
            return "F";
    }
}

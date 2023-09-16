package org.example.models;

import org.example.enums.ADMISIONSTATUS;
import org.example.enums.GENDER;
import org.example.enums.ROLE;

import java.util.List;

public class Student extends Person {
    private int regNumber;
    private int age;
    private String studentClass;
    private List<Subject> subjectsOffered;
    private double averageScore;
    private ADMISIONSTATUS statusOfAdmission = ADMISIONSTATUS.ADMITTED;

//    No argument constructor


    public Student() {
        super();
    }

    public Student(int regNumber, int age, String studentClass, List<Subject> subjectsOffered, double averageScore, ADMISIONSTATUS statusOfAdmission) {
        this.regNumber = regNumber;
        this.age = age;
        this.studentClass = studentClass;
        this.subjectsOffered = subjectsOffered;
        this.averageScore = averageScore;
        this.statusOfAdmission = statusOfAdmission;
    }

    public Student(String name, String email, GENDER gender, ROLE role, int regNumber, int age, String studentClass, List<Subject> subjectsOffered, double averageScore, ADMISIONSTATUS statusOfAdmission) {
        super(name, email, gender, role);
        this.regNumber = regNumber;
        this.age = age;
        this.studentClass = studentClass;
        this.subjectsOffered = subjectsOffered;
        this.averageScore = averageScore;
        this.statusOfAdmission = statusOfAdmission;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public List<Subject> getSubjectsOffered() {
        return subjectsOffered;
    }

    public void setSubjectsOffered(List<Subject> subjectsOffered) {
        this.subjectsOffered = subjectsOffered;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        if(this.getRole()==ROLE.LECTURER){
            this.averageScore = averageScore;
//            throw Unauthorized("You don't have permission to do this");
        }

    }

    public ADMISIONSTATUS getStatusOfAdmission() {
        return statusOfAdmission;
    }

    public void setStatusOfAdmission(ADMISIONSTATUS statusOfAdmission) {
        this.statusOfAdmission = statusOfAdmission;
    }


    @Override
    public String toString() {
        return "Student{" +
                "regNumber=" + regNumber +
                ", age=" + age +
                ", studentClass='" + studentClass + '\'' +
                ", subjectsOffered=" + subjectsOffered +
                ", averageScore=" + averageScore +
                ", statusOfAdmission=" + statusOfAdmission +
                "} " + super.toString();
    }
}

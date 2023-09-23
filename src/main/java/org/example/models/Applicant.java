package org.example.models;

import org.example.enums.ADMISIONSTATUS;
import org.example.enums.GENDER;
import org.example.enums.ROLE;

import java.util.List;

public class Applicant extends Person {
    private int age;
    private String studentClass;
    private List<Subject> entranceExamSubjects;
    private double averageScore;
    private ADMISIONSTATUS statusOfAdmission = ADMISIONSTATUS.NOT_ADMITTED;

//    No argument constructor


    public Applicant() {
        super();
    }

    public Applicant(int age, String studentClass, List<Subject> entranceExamSubjects, double averageScore, ADMISIONSTATUS statusOfAdmission) {
        this.age = age;
        this.studentClass = studentClass;
        this.entranceExamSubjects = entranceExamSubjects;
        this.averageScore = averageScore;
        this.statusOfAdmission = statusOfAdmission;
    }

    public Applicant(String name, String email, GENDER gender, ROLE role, int age, String studentClass, List<Subject> entranceExamSubjects, double averageScore, ADMISIONSTATUS statusOfAdmission) {
        super(name, email, gender, role);
        this.age = age;
        this.studentClass = studentClass;
        this.entranceExamSubjects = entranceExamSubjects;
        this.averageScore = averageScore;
        this.statusOfAdmission = statusOfAdmission;
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

    public List<Subject> getEntranceExamSubjects() {
        return entranceExamSubjects;
    }

    public void setEntranceExamSubjects(List<Subject> entranceExamSubjects) {
        this.entranceExamSubjects = entranceExamSubjects;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public ADMISIONSTATUS getStatusOfAdmission() {
        return statusOfAdmission;
    }

    public void setStatusOfAdmission(ADMISIONSTATUS statusOfAdmission) {
        this.statusOfAdmission = statusOfAdmission;
    }

//    public void addApplicantToSchoolApplicantList() {
//        List<Applicant> applicantList = School.getListOfApplicant();
//        applicantList.add(this);
//    }

    @Override
    public String toString() {
        return "Applicant{" +
                "age=" + age +
                ", studentClass='" + studentClass + '\'' +
                ", entranceExamSubjects=" + entranceExamSubjects +
                ", averageScore=" + averageScore +
                ", statusOfAdmission=" + statusOfAdmission +
                "} " + super.toString();
    }
}

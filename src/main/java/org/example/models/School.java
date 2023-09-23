package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class School {
    static private  List<Student> listOfStudents;
    static private  List<Staff> listOfStaff;
    static private  List<Applicant> listOfApplicant;


    public School() {
    }

    public School(List<Student> listOfStudents, List<Staff> listOfStaff, List<Applicant> listOfApplicant) {
        this.listOfStudents = listOfStudents;
        this.listOfStaff = listOfStaff;
        this.listOfApplicant = listOfApplicant;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public List<Staff> getListOfStaff() {
        return listOfStaff;
    }

    public void setListOfStaff(List<Staff> listOfStaff) {
        this.listOfStaff = listOfStaff;
    }

    public List<Applicant> getListOfApplicant() {
        return listOfApplicant;
    }

    public void setListOfApplicant(List<Applicant> listOfApplicant) {
        this.listOfApplicant = listOfApplicant;
    }
}

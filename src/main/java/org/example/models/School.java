package org.example.models;

import java.util.*;

public class School {
    static private  List<Student> listOfStudents = new ArrayList<>();
    static private  List<Staff> listOfStaff = new ArrayList<>();
    static private  List<Applicant> listOfApplicant = new ArrayList<>();
    static final private Set<String> validPaymentToken = new HashSet<>(Arrays.asList("LEVEL100A0", "LEVEL100A1", "LEVEL100A3","LEVEL100A4", "LEVEL100A5"));
    static private Set<String> usedValidPaymentToken = new HashSet<>();


    public School() {
    }

    public School(List<Student> listOfStudents, List<Staff> listOfStaff, List<Applicant> listOfApplicant, Set<String> validPaymentToken) {
        this.listOfStudents = listOfStudents;
        this.listOfStaff = listOfStaff;
        this.listOfApplicant = listOfApplicant;
//        this.validPaymentToken = validPaymentToken;
    }


//    public List<Student> getListOfStudents() {
//        return listOfStudents;
//    }
//
//    public void setListOfStudents(List<Student> listOfStudents) {
//        this.listOfStudents = listOfStudents;
//    }


    public static List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public static List<Staff> getListOfStaff() {
        return listOfStaff;
    }

    public static void setListOfStaff(List<Staff> listOfStaff) {
        School.listOfStaff = listOfStaff;
    }

    public static List<Applicant> getListOfApplicant() {
        return listOfApplicant;
    }

    public static void setListOfApplicant(List<Applicant> listOfApplicant) {
        School.listOfApplicant = listOfApplicant;
    }

    public static Set<String> getValidPaymentToken() {
        return validPaymentToken;
    }

    public static Set<String> getUsedValidPaymentToken() {
        return usedValidPaymentToken;
    }

    public static void setUsedValidPaymentToken(Set<String> usedValidPaymentToken) {
        School.usedValidPaymentToken = usedValidPaymentToken;
    }

    //    public static void setValidPaymentToken(Set<String> validPaymentToken) {
//        School.validPaymentToken = validPaymentToken;
//    }
}

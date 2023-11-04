package org.example.models;

import org.example.enums.ADMISIONSTATUS;
import org.example.enums.GENDER;
import org.example.enums.REGISTRATION_STATUS;
import org.example.enums.ROLE;
import org.example.exceptions.AccountBlockedException;
import org.example.exceptions.InvalidTokenException;
import org.example.exceptions.TokenUsedException;
import org.example.exceptions.UnAuthorizeException;
import org.example.service.StudentInterface;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Student extends Person implements StudentInterface {
    private int regNumber;
    private int age;
    private int wrongTokenEntryCount =0;
    private String studentClass;
    private List<Subject> subjectsOffered;
    private double averageScore;
    private REGISTRATION_STATUS departmentalRegistrationStatus = REGISTRATION_STATUS.NOT_APPROVED;
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

    public int getWrongTokenEntryCount() {
        return wrongTokenEntryCount;
    }

    public void setWrongTokenEntryCount(int wrongTokenEntryCount) {
        this.wrongTokenEntryCount = wrongTokenEntryCount;
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

    public REGISTRATION_STATUS getDepartmentalRegistrationStatus() {
        return departmentalRegistrationStatus;
    }

    public void setDepartmentalRegistrationStatus(REGISTRATION_STATUS departmentalRegistrationStatus) {
        this.departmentalRegistrationStatus = departmentalRegistrationStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNumber=" + regNumber +
                ", age=" + age +
                ", studentClass='" + studentClass + '\'' +
                ", subjectsOffered=" + subjectsOffered +
                ", averageScore=" + averageScore +
                ", departmentalRegistrationStatus=" + departmentalRegistrationStatus +
                ", statusOfAdmission=" + statusOfAdmission +
                "} " + super.toString();
    }

    @Override
    public String paymentValidation(String paymentToken) {
        String msg = "";
        if(this.getRole()!=ROLE.STUDENT) {
            throw new UnAuthorizeException("You don't have permission to register");
        }
        Set<String> usedTokens = School.getUsedValidPaymentToken();
        Set<String> validTokens = School.getValidPaymentToken();

        if(this.getWrongTokenEntryCount()==3) {
            throw new AccountBlockedException("Your Account has been blocked");
        }
        for (String s: usedTokens) {
            if (paymentToken.equals(s)) {
                this.setWrongTokenEntryCount(this.getWrongTokenEntryCount() + 1);
                throw new TokenUsedException("This Token Has been Used");
            }
        }
        for (String st: validTokens) {
            System.out.println(st);
            if(!Objects.equals(paymentToken, st)){
                System.out.println(validTokens);
                throw new InvalidTokenException("This token is invalid");
            }
            this.setDepartmentalRegistrationStatus(REGISTRATION_STATUS.APPROVED);
            usedTokens.add(paymentToken);
            msg = "Your payment has been successfully validated";
            break;
        }
        return msg;
    }

//    public static void main(String[] args) {
//        List<Applicant> appplicants = School.getListOfApplicant();
//        List<Student> studentss = School.getListOfStudents();
//
//
//        Applicant ap = new Applicant();
//        ap.setName("Davis");
//
//        appplicants.add(ap);
//
//        Student s2 = new Student();
//        s2.setName(ap.getName());
//
//        appplicants.remove(ap);
//        studentss.add(s2);
//
//
//        System.out.println(s2);
//
//        System.out.println(appplicants);
//        System.out.println(studentss);
//
//
//    }
}

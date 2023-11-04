package org.example.models;

import org.example.enums.DESIGNATION;
import org.example.enums.GENDER;
import org.example.enums.REMARK;
import org.example.enums.ROLE;
import org.example.exceptions.OutOfRangeScore;
import org.example.exceptions.UnAuthorizeException;
import org.example.service.AdminInterface;
import org.example.service.LecturerInterface;

import java.util.ArrayList;
import java.util.List;

import static org.example.common.ConstantFields.UNAUTHORIZE;


public class Staff extends Person implements AdminInterface, LecturerInterface {
    private int staffNo;
    private DESIGNATION designation;
    private Double walletAmount;


    public Staff() {
        super();
    }

    public Staff(int staffNo, DESIGNATION designation, Double walletAmount) {
        this.staffNo = staffNo;
        this.designation = designation;
        this.walletAmount = walletAmount;
    }

    public Staff(String name, String email, GENDER gender, ROLE role, int staffNo, DESIGNATION designation, Double walletAmount) {
        super(name, email, gender, role);
        this.staffNo = staffNo;
        this.designation = designation;
        this.walletAmount = walletAmount;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public DESIGNATION getDesignation() {
        return designation;
    }

    public void setDesignation(DESIGNATION designation) {
        this.designation = designation;
    }

    public Double getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(Double walletAmount) {
        this.walletAmount = walletAmount;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "staffNo=" + staffNo +
                ", designation=" + designation +
                ", walletAmount=" + walletAmount +
                "} " + super.toString();
    }


    @Override
    public List<Student> admitApplicant(Applicant applicant, School school) {
        System.out.println(applicant.getAverageScore());
        List<Student> schoolStudentsList = new ArrayList<>();

        if(!applicant.getScoresEntered()) {
            throw new OutOfRangeScore("Please contact Teacher to input score");
        }

        double averageScore = applicant.getAverageScore();
        Result result = new Result();
        Student newAdmitedStudent = new Student();
        result.setApplicantName(applicant.getName());
        result.setTittle("ADMISSION EXAMS");
        result.setExamScore(applicant.getAverageScore());

        if(this.getRole()!=ROLE.ADMISSION_OFFICER) {
            throw new UnAuthorizeException(UNAUTHORIZE);
        }
        if((averageScore<0) || (averageScore>100)) {
            throw new OutOfRangeScore("This score is out of range");
        }

            if((averageScore>=50) && (averageScore<60)) {
                result.setRemark(REMARK.GOOD);
                result.setComment("A good result!, Congrats, Congrats");
                addApplicantToStudentList(applicant, school, schoolStudentsList, newAdmitedStudent);

            } else if ((averageScore >=60) && (averageScore<80)) {
                result.setRemark(REMARK.VERY_GOOD);
                result.setComment("Very good result!, Congrats");
                addApplicantToStudentList(applicant, school, schoolStudentsList, newAdmitedStudent);
            } else if(averageScore >=80){
                result.setRemark(REMARK.EXCELLENT);
                result.setComment("An excellent performance, you are admitted!, Congrats");
                addApplicantToStudentList(applicant, school, schoolStudentsList, newAdmitedStudent);
            } else {
                result.setRemark(REMARK.FAIL);
            }
        return schoolStudentsList;
    }

    private static void addApplicantToStudentList(Applicant applicant, School school, List<Student> schoolStudentsList, Student newAdmitedStudent) {
        newAdmitedStudent.setName(applicant.getName());
        newAdmitedStudent.setAge(applicant.getAge());
        newAdmitedStudent.setRole(ROLE.STUDENT);
        schoolStudentsList.add(newAdmitedStudent);
//        school.setListOfStudents(schoolStudentsList);
    }

    @Override
    public String enterApplicantsScore(Applicant applicant, School school, double m,double e) {
        if(this.getRole()!=ROLE.LECTURER) {
            throw new UnAuthorizeException(UNAUTHORIZE);
        }
        if(applicant.getScoresEntered()) {
            throw new UnAuthorizeException("Student score already entered");
        }
        Subject math = new Subject();
                math.setScore(m);
                math.setSubjectUnit(2);
                math.setSubjectTitle("MATH001");

        Subject english = new Subject();
                english.setScore(e);
                english.setSubjectUnit(3);
                english.setSubjectTitle("ENG001");
        applicant.setScoresEntered(true);
        List<Subject> subjectsOfApplicant = new ArrayList<Subject>(List.of(math,english));

        applicant.setEntranceExamSubjects(subjectsOfApplicant);
        applicant.setAverageScore((e+m)/2);
        return "Result entered successfully";
    }
}


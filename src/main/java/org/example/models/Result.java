package org.example.models;

import org.example.enums.REMARK;

public class Result {
    private String tittle;
    private String comment;
    private String applicantName;
    private double examScore;
    private REMARK remark;


    public Result() {
    }

    public Result(String tittle, String comment, String applicantName, double examScore, REMARK remark) {
        this.tittle = tittle;
        this.comment = comment;
        this.applicantName = applicantName;
        this.examScore = examScore;
        this.remark = remark;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

    public REMARK getRemark() {
        return remark;
    }

    public void setRemark(REMARK remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Result{" +
                "tittle='" + tittle + '\'' +
                ", comment='" + comment + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", examScore=" + examScore +
                ", remark=" + remark +
                '}';
    }
}

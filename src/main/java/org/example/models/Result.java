package org.example.models;

public class Result {
    private String tittle;
    private String comment;
    private String applicantName;
    private double examScore;
    private String remark;


    public Result() {
    }

    public Result(String applicantName, String tittle, String comment, double examScore, String remark) {
        this.tittle = tittle;
        this.applicantName = applicantName;
        this.comment = comment;
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
        comment = comment;
    }

    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

    public String getRemark() {
        return remark;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public void getApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    @Override
    public String toString() {
        return "Result{" +
                "tittle='" + tittle + '\'' +
                ", Comment='" + comment + '\'' +
                ", ApplicantName='" + applicantName + '\'' +
                ", examScore=" + examScore +
                ", remark='" + remark + '\'' +
                '}';
    }
}

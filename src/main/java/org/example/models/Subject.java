package org.example.models;

public class Subject {
    private String subjectTitle;
    private int subjectUnit;
    private double score;

    public Subject() {
    }

    public Subject(String subjectTitle, int subjectUnit, double score) {
        this.subjectTitle = subjectTitle;
        this.subjectUnit = subjectUnit;
        this.score = score;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public int getSubjectUnit() {
        return subjectUnit;
    }

    public void setSubjectUnit(int subjectUnit) {
        this.subjectUnit = subjectUnit;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectTitle='" + subjectTitle + '\'' +
                ", subjectUnit=" + subjectUnit +
                ", score=" + score +
                '}';
    }
}

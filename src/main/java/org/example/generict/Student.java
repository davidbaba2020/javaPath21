package org.example.generict;

public class Student extends Person{
    private String grade;

    public Student() {
        super();
    }
    public Student(String name, Integer age) {
        super(name, age);
    }

    public Student(String s, String david, int i) {
    }


    public String getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                "} " + super.toString();
    }
}

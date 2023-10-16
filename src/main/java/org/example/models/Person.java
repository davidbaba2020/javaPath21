package org.example.models;

import org.example.enums.GENDER;
import org.example.enums.ROLE;

public abstract class Person {
    static private String name;
    private String email;
    private GENDER gender;
    private ROLE role;
    private static int num =1;

    public Person() {
    }

    public Person(String name, String email, GENDER gender, ROLE role) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.role = role;
    }


    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Person.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", role=" + role +
                '}';
    }
}

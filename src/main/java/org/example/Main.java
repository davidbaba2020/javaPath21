package org.example;

import org.example.enums.*;
import org.example.models.*;

import java.util.*;

public class Main {
     public static void main(String[] args) {
        System.out.println("Hello world!");

        Student david = new Student();
//        Student bill = new Student("bill","bill@gmail.com","Male",23,23,"Grade1");
         Subject math = new Subject();

//         math.setSubjectCode("MTH101");
         math.setSubjectUnit(3);
         System.out.println("*******************>>>>>>>>>>>>>>>>>>>>>");
//         System.out.println(math.getSubjectCode());
         System.out.println();
         System.out.println("*******************>>>>>>>>>>>>>>>>>>>>>");



         System.out.println(david);
//         System.out.println(bill);
//         System.out.println(bill.getRegNumber());
//         System.out.println(bill.getAge());
//         bill.setAge(40);
//         System.out.println(bill.getAge());
//         System.out.println(bill);

         System.out.println(math);
         System.out.println();
         Main m = new Main();
         System.out.println("***************AREA 4 SIDEs*******************");
         System.out.println("The area of the shape is : "+m.areaOfPlaneShapes(3, 4));
         System.out.println("**********************************");
         System.out.println("*****************TRIANGLE*****************");
         System.out.println("The area of the shape is : "+m.areaOfPlaneShapes(3, 4,5));
         System.out.println("**********************************");

         System.out.println("************************Second Class ************************");
//         Lecturer g = new Lecturer("Goodluck","gluck@gmail.com", GENDER.MALE,101, DESIGNATION.ACADEMIC,20022.00);
//         System.out.println(g);

//        Student st1 = new Student("David","st1@gmail.com",GENDER.MALE,101,15,"SS1");
//        Student st2 = new Student();
//        st2.setAge(10);
        Staff lt1 = new Staff();
//         SecurityOfficer so1 = new SecurityOfficer();
//         Person p1 = new Person();

         Person st3 = new Student();
         Person lt2 = new Staff();
//         Person so2 = new SecurityOfficer();

         List<Person> person = new ArrayList<>();
         Set<String> person3 = new HashSet<>();
         List<String> person4 = new ArrayList<>();

         person3.add("one");
         person3.add("two");
         person3.add("three");
         person3.add("three");
         person3.add("four");
         person3.add("one");

         person4.add("one");
         person4.add("two");
         person4.add("three");
         person4.add("four");
         person4.add("four");
         person4.add("four");
         person4.add("five");
         person4.add("five");


         person.add(st3);
         person.add(lt2);
//         person.add(so2);
         System.out.println("**************** Lecturer admit student ****************");

//         System.out.println(lt1.admitStudent(st2));
//         System.out.println(st2);


         System.out.println("**************** Third class ****************");

//         Student martin = new Student();
//         martin.setName("Martin");
//         martin.setGender(GENDER.MALE);
//
//         System.out.println(person3);
//         System.out.println(person4);
//         System.out.println(martin);
//
         //Students of the school
      Subject sub1 = new Subject("Math",2,0.0);
      Subject sub2 = new Subject("English",3,0.0);
      Subject sub3 = new Subject("Biology",1,0.0);

      List<Subject> stsub1 = new ArrayList<>(Arrays.asList(sub1,sub2,sub3));

      Student st1 = new Student();
              st1.setName("Student1");
              st1.setRole(ROLE.STUDENT);
              st1.setAge(12);
              st1.setGender(GENDER.MALE);
              st1.setStudentClass("SS1");
              st1.setSubjectsOffered(stsub1);

//      st1.setAverageScore(23);

      Student st2 = new Student();
              st2.setName("Student2");
              st2.setRole(ROLE.STUDENT);
              st2.setAge(13);
              st2.setGender(GENDER.FEMALE);
              st2.setStudentClass("SS1");
              st2.setSubjectsOffered(stsub1);

      Student st4 = new Student();
              st4.setName("Student4");
              st4.setRole(ROLE.STUDENT);
              st4.setAge(11);
              st4.setGender(GENDER.MALE);
              st4.setStudentClass("SS1");
              st4.setSubjectsOffered(stsub1);


     List<Subject> entranceExam = new ArrayList<>(Arrays.asList(sub1,sub2));
     Applicant ap1 = new Applicant();
             ap1.setAge(10);
             ap1.setName("Applicant 1");
             ap1.setRole(ROLE.APPLICANT);
             ap1.setEntranceExamSubjects(entranceExam);

     Applicant ap2 = new Applicant();
             ap2.setAge(11);
             ap2.setName("Applicant 2");
             ap2.setRole(ROLE.APPLICANT);
             ap2.setEntranceExamSubjects(entranceExam);

     Staff  prin = new Staff();
            prin.setDesignation(DESIGNATION.NON_ACADEMIC);
            prin.setName("Principal 1");
            prin.setRole(ROLE.PRINCIPAL);

     Staff teach1 = new Staff();
             teach1.setName("Teacher 1");
             teach1.setRole(ROLE.LECTURER);
             teach1.setDesignation(DESIGNATION.ACADEMIC);

     Staff ad1 = new Staff();
             ad1.setName("Admin 1");
             ad1.setRole(ROLE.ADMISSION);
             ad1.setDesignation(DESIGNATION.NON_ACADEMIC);

    }


    public int areaOfPlaneShapes(int length, int breath) {
         return length*breath;
    }

    public int areaOfPlaneShapes(int length, int breath, int height) {
        return length*breath*height;
    }


}
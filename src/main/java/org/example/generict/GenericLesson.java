package org.example.generict;

import java.util.ArrayList;
import java.util.List;

public class GenericLesson {

    public static void main(String[] args) {
//        System.out.println("Generic in action");

        List student = new ArrayList();
        student.add(1);
        student.add("Hello");
        student.add(3.23);

        System.out.println(student);

        Furniture<Boolean,Integer> f1 = new Furniture(7,5);
        Furniture<Boolean,String> f2 = new Furniture<>("David","Baba");
        Furniture<Boolean,String> f3 = new Furniture<>("Em","Os",true);
        Furniture<Boolean,String> f4 = new Furniture<>("Em","Os",true);


        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        System.out.println("*****************************************");
        System.out.println("*****************************************");

        Animal<Integer> a1 = new Animal<>(5);
        Animal<Float> a2 = new Animal<>(5F);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("*****************************************");
        System.out.println("*****************************************");

        Individuals<Student> dave = new Individuals<Student>(new Student("David",750));

        System.out.println(dave);


    }

}

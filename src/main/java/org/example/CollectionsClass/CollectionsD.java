package org.example.CollectionsClass;

import java.util.*;

public class CollectionsD {


    public static class Chair {
        private String name;
        private int noOfLegs;

        public Chair() {
        }

        public Chair(String name, int noOfLegs) {
            this.name = name;
            this.noOfLegs = noOfLegs;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNoOfLegs() {
            return noOfLegs;
        }

        public void setNoOfLegs(int noOfLegs) {
            this.noOfLegs = noOfLegs;
        }

        @Override
        public String toString() {
            return "Chair{" +
                    "name='" + name + '\'' +
                    ", noOfLegs=" + noOfLegs +
                    '}';
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello Java Path");

        Chair c = new Chair("Galooova",7);

        int [] nembers = {1,2,3,4,5,6,8,12,22};

        int [] n = new int[10];
        n[0] = 23;
        n[9]=56;
        int l = n.length;

        Collection<Chair> n2 = new ArrayList<>();

//        n2.add(1);
//        n2.add("Tim");
//        n2.add(2.5);
        n2.add(c);
        n2.add(new Chair("Kara",1));
        n2.add(new Chair("Lag",2));

//        System.out.println(l);
        System.out.println(n2.size());
        System.out.println(Arrays.toString(n));
//        for (Chair nums : n2) {
//            System.out.println("************");
//            System.out.println(nums);
//
//        }

        System.out.println(n2);
        System.out.println("**********************");
        System.out.println(checkForEVne2(nembers));

//        num % 2 = 0;
//        num % 2 = 1;


    }
//    List -84

    static List<Integer> checkForEVne(int[] arr) {
//        int[] evenIntegers = new int [arr.length];
        List<Integer > evenIntegers = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if((arr[i])%2==0) {
                evenIntegers.add(arr[i]);
            }
        }
//        for(int i : arr) {
//
//        }
        return evenIntegers;
    }

    static List<Integer> checkForEVne2(int[] arr) {
        List<Integer > evenIntegers = new ArrayList<>();
        for(int i : arr) {
            if((i%2)==0) {
                evenIntegers.add(i);
            }
        }
        return evenIntegers;
    }
}

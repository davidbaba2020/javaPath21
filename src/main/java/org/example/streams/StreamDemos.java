package org.example.streams;

import java.util.*;
import java.util.stream.Collectors;


public class StreamDemos {

    private static List<Integer> numberList = Arrays.asList(1,2,5,6,8,10,15,20,30,35);
    private static List<Integer> newNumberList = new ArrayList<>();
    private static List<String> names = Arrays.asList("Greyson" ,"HarveyCopy", "BednarCopy", "Orin", "NitzscheCopy","HellerCopy"
           , "Albertha", "BechtelarCopy","HermannCopy","Angelo ReynoldsCopy");
    private static List<String>    newNames = new ArrayList<>();

    private static List<String> vehicles = Arrays.asList("car", "bus", "trailer", "plain", "train");

    private static List<Integer> numberListMul = Arrays.asList(2,4,6,8,10,12,14,16,18);
    private static List<Integer> numberListMultiples = new ArrayList<>();

    private static List<Employee> employees = Arrays.asList(
            new Employee(101,"Dave", 5000000.00),
            new Employee(102,"Martin", 23000.00),
            new Employee(103,"Osemeka", 450000.00),
            new Employee(104,"Uwana", 100000.00),
            new Employee(105,"Godstime", 22000.00),
            new Employee(106,"Timothy", 2200000.00)
    );
    private static List<Employee> employeesNewList = new ArrayList<>();

    //Fetch all even numbers
//    without stream

    public static void loopingStyle() {
        for (int n: numberList) {
            if(n%2==0) {
                System.out.println(n);
            }
        }
    }

    //With streams
    public static void streaming() {
        newNumberList = numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("**************Method 1********************");
        System.out.println("The collected list: "+newNumberList);
//        Print each on the console
        System.out.println("**********************************");
        System.out.println("***************Method 2*******************");

        numberList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

        System.out.println("**********************************");
        System.out.println("***************Method 3*******************");
        numberList.stream().filter(n->n%2==0).forEach(System.out::println);

    }


    public static void streaming2() {
//        newNames = names.stream().filter(n->n.length()>=6&&n.length()<=12).collect(Collectors.toList());
        newNames = names.stream().filter(n->checkLength(n)).collect(Collectors.toList());
        System.out.println(newNames);
        names.stream().filter(n->n.length()>=6&&n.length()<=12).forEach(System.out::println);
    }


    public static void lengthOfVehiclesSpellingMapping () {
        vehicles.stream().map(vLength->vLength.length()).forEach(System.out::println);
        List<Integer> allLenth = vehicles.stream().map(vLength->vLength.length()).collect(Collectors.toList());
        System.out.println("*********************************************");
        System.out.println(allLenth);

        System.out.println("*********************************************");
        numberListMultiples  = numberListMul.stream().map(n->n*3).collect(Collectors.toList());
        System.out.println("Multiples for 3: of"+numberListMul+" are"+ numberListMultiples);
        System.out.println("*********************************************");
    }


    public static void objectStream() {
       List<Double> salaries =  employees.stream().filter(e->e.getSalary()>200000)
                .map(em->em.getSalary()).collect(Collectors.toList());
        System.out.println("******************Filter & Map ************************");
        System.out.println(salaries);
        System.out.println("*********************************************");
    }


    private static boolean checkLength(String n) {
        return n.length()>=6&&n.length()<=12;
    }

    }

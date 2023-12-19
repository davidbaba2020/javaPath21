package org.example.excepptions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExceptClass {
    public static void main(String[] args) {
        System.out.println("Exceptiiiion!");

        Dev d = Dev.builder()
                .emaIL("d@gmail.com")
                .age(21)
                .allowance(new BigDecimal(21))
                .build();

        Dev d2 = new Dev("D2","d2@gmail.com",20,new BigDecimal(2000));
        Dev d3 = new Dev();

        d3.setName("d3");
        d3.setAge(19);
        d3.setEmaIL("d3@gmail.com");
        d3.setAllowance(new BigDecimal(30000));

        System.out.println(register(d));

    }
        static List<Dev> allRegisteredDev = new ArrayList<>();

    public static String register(Dev dev) {
        if(dev.getName()==null) {
            throw new NumberFormatException("name can not be empty");
        }
        allRegisteredDev.add(dev);
        return dev.toString();
    }
}

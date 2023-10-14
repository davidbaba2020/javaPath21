package org.example.SOLID;

import java.util.ArrayList;
import java.util.List;

public class SolidMain {

    public static void main(String[] args) {
        Furniture f1 = new Furniture();
        Chair chair = new Chair();
        Table table = new Table();

        Furniture f2 = new Chair();

        List<Furniture> furnitures = new ArrayList<>();
        furnitures.add(chair);
        furnitures.add(table);
        furnitures.add(f1);

        List<Chair> chairs = new ArrayList<>();

//S  -  Single responsibility
//O  -  Open to extension close to modification
//L  -  Liskov substitution
//I  -  interface segregation
//D  -  dependency inversion


//D - Don't
//R - Repeat
//Y - Yourself
    }
}

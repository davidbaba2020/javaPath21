package org.example;

import org.example.models.Staff;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Service {




    String borrowBook(Collection<Staff> borrowers) {
        Iterator r = borrowers.iterator();
        while (r.hasNext()) {
            Object ob = r.next();
            System.out.println(ob);
        }
        return "Borrowed successfully";
    }

}

package org.example.generict;

public class Individuals <T extends Person>{

    private T person;
    public Individuals() {
    }

    public Individuals(T person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Individuals{" +
                "person=" + person +
                '}';
    }
}

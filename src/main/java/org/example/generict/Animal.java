package org.example.generict;

public class Animal <T extends Number>{
    private T colour;

    public Animal() {
    }

    public Animal(T colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "colour=" + colour +
                '}';
    }
}

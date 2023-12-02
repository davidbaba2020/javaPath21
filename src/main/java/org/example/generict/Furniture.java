package org.example.generict;


public class Furniture <E,T> {
    private T value;
    private T getValue;
    private E status;

    public Furniture() {
    }

    public Furniture(T value) {
        this.value = value;
    }

    public Furniture(T value, T getValue) {
        this.value = value;
        this.getValue = getValue;
    }


    public Furniture(T value, T getValue, E status) {
        this.value = value;
        this.getValue = getValue;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "value=" + value +
                ", getValue=" + getValue +
                ", status=" + status +
                '}';
    }
}

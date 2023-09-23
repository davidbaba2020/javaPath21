package org.example.exceptions;

public class OutOfRangeScore extends RuntimeException {
    public OutOfRangeScore(String message) {
        super(message);
    }

}

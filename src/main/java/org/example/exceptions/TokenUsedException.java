package org.example.exceptions;

public class TokenUsedException extends RuntimeException {
    public TokenUsedException(String message) {
        super(message);
    }
}

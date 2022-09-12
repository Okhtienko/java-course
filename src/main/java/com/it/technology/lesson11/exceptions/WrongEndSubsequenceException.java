package com.it.technology.lesson11.exceptions;

public class WrongEndSubsequenceException extends Exception {
    private String detail;

    public WrongEndSubsequenceException() {
        detail = "String does not ends with sequence";
    }

    public WrongEndSubsequenceException(String message) {
        super(message);
        detail = message;
    }
}

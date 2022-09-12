package com.it.technology.lesson11.exceptions;

public class WrongSubsequenceException extends Exception {
    private String detail;

    public WrongSubsequenceException() {
        detail = "String does not contain sequence";
    }

    public WrongSubsequenceException(String message) {
        super(message);
        detail = message;
    }
}

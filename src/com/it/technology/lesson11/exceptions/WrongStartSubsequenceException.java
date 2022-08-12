package com.it.technology.lesson11.exceptions;

public class WrongStartSubsequenceException extends Exception{
    private String detail;

    public WrongStartSubsequenceException() {
        detail = "String does not start with sequence";
    }

    public WrongStartSubsequenceException(String message) {
        super(message);
        detail = message;
    }
}

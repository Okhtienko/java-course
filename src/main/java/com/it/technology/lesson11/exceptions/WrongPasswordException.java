package com.it.technology.lesson11.exceptions;

public class WrongPasswordException extends Exception {
    private String detail;

    public WrongPasswordException() {
        detail = "Incorrect password";
    }

    public WrongPasswordException(String message) {
        super(message);
        detail = message;
    }
}

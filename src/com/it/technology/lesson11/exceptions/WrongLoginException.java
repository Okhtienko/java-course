package com.it.technology.lesson11.exceptions;

public class WrongLoginException extends Exception {
    private String detail;

    public WrongLoginException() {
        detail = "Incorrect login";
    }

    public WrongLoginException(String message) {
        super(message);
        detail = message;
    }
}

package com.it.technology.lesson14.utils;

public final class FactorialUtils {
    private FactorialUtils() {

    }

    public static int calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * calculateFactorial(number -1);
        }
    }
}

package com.it.technology.lesson9.utils;

public final class OperatorUtils {

    private OperatorUtils() {

    }

    public static void checkOperatorKey(int key) {
        switch (key) {
            case 0 -> {
                System.out.println("Vectors equal");
                break;
            }
            case -1 -> {
                System.out.println("First vector is less than second");
                break;
            }
            case 1 -> {
                System.out.println("First vector is greater than second");
                break;
            }
        }
    }
}

package com.it.technology.lesson10.utils;

public final class ReverseUtils {
    protected ReverseUtils() {

    }

    public static String reverseString(String string) {
        return new StringBuilder(string.toLowerCase()).reverse().toString();
    }
}

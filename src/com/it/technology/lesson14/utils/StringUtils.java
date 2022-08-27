package com.it.technology.lesson14.utils;

public final class StringUtils {
    private StringUtils() {

    }

    public static String reverseString(String text) {
        StringBuilder reverseText = new StringBuilder(text);
        return reverseText.reverse().toString();
    }
}

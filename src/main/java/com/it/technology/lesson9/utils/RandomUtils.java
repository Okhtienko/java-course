package com.it.technology.lesson9.utils;

public final class RandomUtils {

    private RandomUtils() {

    }

    public static double generateRandomValue(int initialValue, int endValue) {
        return initialValue + (Math.random() * (endValue - initialValue + 1));
    }
}

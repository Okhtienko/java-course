package com.it.technology.lesson9.utils;

import java.util.ArrayList;

public final class RandomListUtils {

    private RandomListUtils() {

    }

    public static ArrayList<Double> generateRandomList(int size) {
        ArrayList<Double>  randomList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomList.add(RandomUtils.generateRandomValue(2, 7));
        }
        return randomList;
    }
}

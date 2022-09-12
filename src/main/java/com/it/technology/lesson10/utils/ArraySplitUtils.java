package com.it.technology.lesson10.utils;

import com.it.technology.lesson10.classes.Text;

public final class ArraySplitUtils {
    protected ArraySplitUtils() {

    }

    public static String[] getArrayOfStringsWithoutPunctuation(Text text) {
        final String string = text.getText();
        return string.replaceAll("\\pP", "").split(" ");
    }

    public static String[] getArrayOfStringsBySpace(Text text) {
        final String string = text.getText();
        return string.split(" ");
    }

    public static String[] getArrayOfStringsByDash(Text text) {
        final String string = text.getText();
        return string.split("-");
    }
    
    public static String[] getArrayOfStringsBySymbol(Text text) {
        final String string = text.getText();
        return string.split("");
    }
}

package com.it.technology.lesson10.services;

import com.it.technology.lesson10.classes.Text;
import com.it.technology.lesson10.utils.ArraySplitUtils;

public class ServiceDocumentParser {

    public static String displayFirstTwoBlocksFourOfDigits(Text text) {
        final String[] arrayWords = ArraySplitUtils.getArrayOfStringsByDash(text);
        String twoBlocksFourOfDigits = arrayWords[0] + "-" + arrayWords[2];
        return twoBlocksFourOfDigits;
    }

    public static String replaceBlocksOfThreeLetters(Text text) {
        final String string = text.getText();
        return string.replaceAll("[a-zA-z]{3}", "***");
    }

    public static boolean checkDocumentNumberContainsSequence(Text text, String subsequence) {
        final String string = text.getText();
        return string.toLowerCase().contains(subsequence.toLowerCase());
    }

    public static boolean checkDocumentNumberStartWithSequence(Text text, String subsequence) {
        final String string = text.getText();
        return string.toLowerCase().startsWith(subsequence.toLowerCase());
    }

    public static boolean checkDocumentNumberEndsWithSequence(Text text, String subsequence) {
        final String string = text.getText();
        return string.toLowerCase().endsWith(subsequence.toLowerCase());
    }

    public static String displayOnlyLettersFromDocumentNumber(Text text) {
        final String string = text.getText();
        final String[] arrayWords = string.replaceAll("\\d", "/").split("-");
        StringBuilder lettersNumber = new StringBuilder();

        for (String word : arrayWords) {
            if (!word.equals("////")) {
                lettersNumber.append(word.toLowerCase());
            }
            lettersNumber.append("/");
        }

        String onlyLetters = lettersNumber.toString().replaceAll("//", "/");
        return onlyLetters.substring(1, onlyLetters.length()-1);
    }
}

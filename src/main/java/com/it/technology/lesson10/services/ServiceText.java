package com.it.technology.lesson10.services;

import com.it.technology.lesson10.utils.ArraySplitUtils;
import com.it.technology.lesson10.utils.ReverseUtils;
import com.it.technology.lesson10.classes.Text;

public class ServiceText {

    private String removeDuplicates(String word) {
        StringBuilder noDuplicates = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i + 1);
            if (noDuplicates.indexOf(letter) == -1) {
                noDuplicates.append(letter);
            }
        }
        return noDuplicates.toString();
    }

    public String checkWordWithMinimumCounterDifferentCharacters(Text text) {
        final String[] arrayWords = ArraySplitUtils.getArrayOfStringsWithoutPunctuation(text);
        String word = arrayWords[0];
        for (int i = 0; i < arrayWords.length; i++) {
            if (removeDuplicates(arrayWords[i]).length() <removeDuplicates(word).length()) {
                word = arrayWords[i];
            }
        }
        return word;
    }

    public String findShortWord(Text text) {
        final String[] arrayWords = ArraySplitUtils.getArrayOfStringsWithoutPunctuation(text);
        String shortWord = arrayWords[0];
        for (int i = 0; i < arrayWords.length; i++) {
            if (arrayWords[i].length() <= shortWord.length()) {
                shortWord = arrayWords[i];
            }
        }
        return shortWord;
    }

    public String findLongWord(Text text) {
        final String[] arrayWords = ArraySplitUtils.getArrayOfStringsWithoutPunctuation(text);
        String longWord = arrayWords[0];
        for (int i = 0; i < arrayWords.length; i++) {
            if (arrayWords[i].length() >= longWord.length()) {
                longWord = arrayWords[i];
            }
        }
        return longWord;
    }

    public String getWordyIndex(Text text, int index) throws RuntimeException{
        final String[] arrayWords = ArraySplitUtils.getArrayOfStringsWithoutPunctuation(text);
        if ((index > arrayWords.length - 1) || (index < 0)) {
            throw new RuntimeException("String does not contain a word at the given index " + index);
        }
        for (int i = 0; i < arrayWords.length; i++) {
            if (index == i) {
                return arrayWords[i];
            }
        }
        return null;
    }

    public boolean checkPalindrome(String word) {
        final String reverseWord = ReverseUtils.reverseString(word);
        if (word.toLowerCase().equals(reverseWord)) {
            return true;
        }
        return false;
    }

    public String duplicateLettersInString(Text text) {
        final String[] arrayCharacter = ArraySplitUtils.getArrayOfStringsBySymbol(text);
        String duplicateLettersString = "";
        for (String character : arrayCharacter) {
            duplicateLettersString += character.repeat(2);
        }
        return duplicateLettersString;
    }
}

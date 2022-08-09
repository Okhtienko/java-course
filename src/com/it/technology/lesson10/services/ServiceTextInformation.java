package com.it.technology.lesson10.services;

import com.it.technology.lesson10.classes.Text;

public final class ServiceTextInformation {
    public void displayInformation(Text text) {
        ServiceText serviceText = new ServiceText();

        System.out.println("Shortest word in a string: " + serviceText.findShortWord(text));
        System.out.println("Longest word in a string: " + serviceText.findLongWord(text));
        System.out.println("Word with a minimum number of different characters: " +
                serviceText.checkWordWithMinimumCounterDifferentCharacters(text));

        String stringPalindrome = serviceText.getWordyIndex(text, 2);

        System.out.println("The word is palindrome: " + serviceText.checkPalindrome(stringPalindrome));
        System.out.println("Duplicate letters in a string: " + serviceText.duplicateLettersInString(text));
    }
}

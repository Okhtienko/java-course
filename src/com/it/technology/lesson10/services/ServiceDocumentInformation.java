package com.it.technology.lesson10.services;

import com.it.technology.lesson10.classes.Text;

public final class ServiceDocumentInformation {

    public void displayInformation(Text text) {
        System.out.println("Two blocks of digits: " +
                ServiceDocumentParser.displayFirstTwoBlocksFourOfDigits(text));

        System.out.println("New document number: " +
                ServiceDocumentParser.replaceBlocksOfThreeLetters(text));

        System.out.println("Only letters of the document number in lowercase: " +
                ServiceDocumentParser.displayOnlyLettersFromDocumentNumber(text));

        System.out.println("Only letters of the document number in uppercase: " + "letters - " +
                (ServiceDocumentParser.displayOnlyLettersFromDocumentNumber(text)).toUpperCase());


        System.out.println("Document number contains sequence: " +
                ServiceDocumentParser.checkDocumentNumberContainsSequence(text, "abc"));

        System.out.println("Does the document number begin with the sequence: " +
                ServiceDocumentParser.checkDocumentNumberStartWithSequence(text, "5555"));

        System.out.println("Does the document number end with subsequence: " +
                ServiceDocumentParser.checkDocumentNumberEndsWithSequence(text, "1a2b"));
    }
}

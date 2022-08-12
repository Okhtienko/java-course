package com.it.technology.lesson11.services;

import com.it.technology.lesson11.classes.Text;
import com.it.technology.lesson11.exceptions.WrongEndSubsequenceException;
import com.it.technology.lesson11.exceptions.WrongStartSubsequenceException;
import com.it.technology.lesson11.exceptions.WrongSubsequenceException;

public final class DocumentParserService {

    public static boolean checkDocumentNumberContainsSequence(Text text, final String subsequence) throws
            WrongSubsequenceException {
        final String string = text.getText();
        if (!string.toLowerCase().contains(subsequence.toLowerCase())) {
            throw new WrongSubsequenceException("String does not contain " + subsequence + " sequence");
        }
        return true;
    }

    public static boolean checkDocumentNumberStartWithSequence(Text text, final String subsequence) throws
            WrongStartSubsequenceException {
        final String string = text.getText();
        if (!string.toLowerCase().startsWith(subsequence.toLowerCase())) {
            throw new WrongStartSubsequenceException("String does not start with " + subsequence + " sequence");
        }
        return true;
    }

    public static boolean checkDocumentNumberEndsWithSequence(Text text, final String subsequence) throws
            WrongEndSubsequenceException {
        final String string = text.getText();
        if (!string.toLowerCase().endsWith(subsequence.toLowerCase())) {
            throw new WrongEndSubsequenceException("String does not end with " + subsequence + " sequence");
        }
        return true;
    }

    public static void isStringValid(Text text, final String subsequence) {
        try {
            checkDocumentNumberStartWithSequence(text, subsequence);
            checkDocumentNumberContainsSequence(text, subsequence);
            checkDocumentNumberEndsWithSequence(text, subsequence);
            System.out.println("String is valid"  + subsequence);
        } catch (WrongStartSubsequenceException | WrongSubsequenceException | WrongEndSubsequenceException e) {
            e.printStackTrace();
        }
    }
}

package com.it.technology.lesson13.utils;

public final class DocumentNumberUtil {
    private DocumentNumberUtil() {

    }

    public static boolean isDocumentNumberValid(String documentNumber) {
        if ((!documentNumber.matches("^contract[\\w]{7}")) &&
                (!documentNumber.matches("^docnum[\\w]{9}"))) {
            return false;
        }
        return true;
    }
}

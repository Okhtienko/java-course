package com.it.technology.lesson17.utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DocumentNumberUtil {
    private static final Pattern DOCUMENT_NUMBER_PATTERN =
            Pattern.compile("\\d{4}-[a-zA-z]{3}-\\d{4}-\\d[a-zA-z]\\d[a-zA-z]");

    private DocumentNumberUtil() {

    }

    public static List<String> isValidDocumentNumber(final List<String> documentNumbers) {
        return documentNumbers
                .stream()
                .map(DOCUMENT_NUMBER_PATTERN::matcher)
                .filter(Matcher::find)
                .map(Matcher::group)
                .toList();
    }
}

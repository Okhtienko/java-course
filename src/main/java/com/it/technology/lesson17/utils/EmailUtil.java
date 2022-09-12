package com.it.technology.lesson17.utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class EmailUtil {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@[^-][A-Za-z0-9\\+-]" +
                    "+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$");

    private EmailUtil() {

    }

    public static List<String> isValidEmail(final List<String> emails) {
        return emails
                .stream()
                .map(EMAIL_PATTERN::matcher)
                .filter(Matcher::find)
                .map(Matcher::group)
                .toList();
    }
}

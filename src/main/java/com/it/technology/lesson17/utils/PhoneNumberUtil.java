package com.it.technology.lesson17.utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PhoneNumberUtil {
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");

    private PhoneNumberUtil() {

    }

    public static List<String> isValidPhoneNumber(final List<String> phoneNumbers) {
        return phoneNumbers
                .stream()
                .map(PHONE_NUMBER_PATTERN::matcher)
                .filter(Matcher::find)
                .map(Matcher::group)
                .toList();
    }
}

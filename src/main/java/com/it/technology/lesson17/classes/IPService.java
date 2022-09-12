package com.it.technology.lesson17.classes;

import java.util.regex.Pattern;

public class IPService {
    private static final Pattern PATTERN_IPV4 = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}" +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
    private static final Pattern PATTERN_IPV6 = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:{7}[0-9a-fA-F]{1,4}$)");

    public boolean isValidateIPv4(final IP address) {
        return PATTERN_IPV4.matcher(address.getIpAddress()).matches();
    }

    public boolean isValidateIPv6(final IP address) {
        return PATTERN_IPV6.matcher(address.getIpAddress()).matches();
    }
}

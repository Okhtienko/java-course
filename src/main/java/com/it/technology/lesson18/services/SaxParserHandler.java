package com.it.technology.lesson18.services;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.List;

public final class SaxParserHandler extends DefaultHandler {
    private final List<String> sonnet = new ArrayList<>();
    private String element;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        try {
            element = qName;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        try {
            element = "";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        try {
            if (element.equalsIgnoreCase("line")) {
                String line = new String(ch, start, length);
                sonnet.add(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getSonnet() {
        return sonnet;
    }
}

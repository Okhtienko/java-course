package com.it.technology.lesson18.services;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public final class SaxParser {
    public SaxParserHandler parser(final String file) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler saxParserHandler = new SaxParserHandler();
        try {
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(new File(file), saxParserHandler);
            return saxParserHandler;
        } catch (Exception  e) {
            throw new RuntimeException(e);
        }
    }
}

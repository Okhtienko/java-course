package com.it.technology.lesson18.services;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class DomParser {
    public List<String> parser(final String file) {
        List<String> sonnet = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(file));
            document.getDocumentElement().normalize();
            NodeList sonnetElement = document.getElementsByTagName("line");
            for (int i = 0; i < sonnetElement.getLength(); i++) {
                Node node = sonnetElement.item(i);
                sonnet.add(node.getTextContent());
            }
            return sonnet;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

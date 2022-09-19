package com.it.technology.lesson18.services;

import com.it.technology.lesson18.classes.Sonnet;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.File;
import java.io.FileReader;

public final class JaxbParser {
    public void marshal(final Sonnet sonnet, final String file) {
        try {
            JAXBContext context = JAXBContext.newInstance(Sonnet.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(sonnet, new File(file));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Sonnet unmarshall(final String file) {
        try {
            JAXBContext context = JAXBContext.newInstance(Sonnet.class);
            return (Sonnet) context.createUnmarshaller().unmarshal(new FileReader(file));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

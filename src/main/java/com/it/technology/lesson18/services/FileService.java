package com.it.technology.lesson18.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class FileService {
    public List<String> readFile(final String file) {
        try {
            List<String> sonnet = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
            return sonnet.isEmpty() ? new ArrayList<>() : sonnet;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeDataToFile(
            final int key,
            final SaxParser saxParser,
            final DomParser domParser,
            final String file) {
        switch (key) {
            case 1 -> {
                List<String> lines = saxParser.parser(file).getSonnet();
                writeFile(lines,  "./src/main/java/com/it/technology/lesson18/files/sonnetSax.txt" );
                System.out.println("Check the file sonnetSax.txt");
            }
            case 2 -> {
                List<String> lines = domParser.parser(file);
                writeFile(lines, "./src/main/java/com/it/technology/lesson18/files/sonnetDom.txt");
                System.out.println("Check the file sonnetDOm.txt");
            }
            default -> System.out.println("Key entered incorrectly");
        }
    }

    private void writeFile(final List<String> lines, final String file) {
        try {
            Files.write(Paths.get(file), lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

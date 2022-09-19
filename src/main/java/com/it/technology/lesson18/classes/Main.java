package com.it.technology.lesson18.classes;

import com.it.technology.lesson18.services.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("##########Task1##########");
        System.out.println("1. SAX parser");
        System.out.println("2. DOM parser");
        System.out.print("Enter key: ");

        int key = scanner.nextInt();

        SaxParser saxParser = new SaxParser();
        DomParser domParser = new DomParser();
        FileService fileService = new FileService();
        String fileSonnetXml = "./src/main/java/com/it/technology/lesson18/files/sonnet.xml";

        fileService.writeDataToFile(key, saxParser, domParser, fileSonnetXml);

        System.out.println("##########Task3##########");
        Author author = new Author();
        author.setFirstName("William");
        author.setLastName("Shakespeare");
        author.setNationality("British");
        author.setYearOfBirth(1564);
        author.setYearOfDeath(1616);

        String fileSonnetTxt = "./src/main/java/com/it/technology/lesson18/files/sonnet.txt";
        List<String> lines = fileService.readFile(fileSonnetTxt);

        JaxbParser jaxbParser = new JaxbParser();
        Sonnet sonnetMarshal = new Sonnet(author, "Sonnet 130", lines);
        jaxbParser.marshal(sonnetMarshal, fileSonnetXml);

        Sonnet sonnetUnmarshall = jaxbParser.unmarshall(fileSonnetXml);

        SonnetService sonnetService = new SonnetService();
        sonnetService.displayInformationAboutSonnet(sonnetUnmarshall);



    }
}

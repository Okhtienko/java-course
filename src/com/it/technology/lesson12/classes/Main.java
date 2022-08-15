package com.it.technology.lesson12.classes;

import com.it.technology.lesson12.services.FileService;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("##########Task1##########\n");

        System.out.print("Input the path to the document: ");
        String path = scanner.next();
        final List<String> documentNumbers = FileService.readFile(path);

        FileService.displayInformationAboutDocumentNumbers(documentNumbers);

        System.out.println("\n##########Task2##########\n");

        final String pathForValidFile = "./src/com/it/technology/lesson12/files/validDocumentNumbers.txt";
        final String pathForInvalidFile = "./src/com/it/technology/lesson12/files/invalidDocumentNumbers.txt";

        FileService.writeValidNumbersToFile(pathForValidFile, documentNumbers);
        System.out.println("Check validDocumentNumbers.txt");
        FileService.writeInvalidNumbersToFile(pathForInvalidFile, documentNumbers);
        System.out.println("Check invalidDocumentNumbers.txt");
    }
}

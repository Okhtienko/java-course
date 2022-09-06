package com.it.technology.lesson17.classes;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("##########Task1##########");

        IPService ipService = new IPService();
        System.out.print("Enter IPv4 address: ");
        String addressIPv4 = scanner.nextLine();
        IP iPv4 = new IP(addressIPv4);
        System.out.println("Valid IPv4 address: " + ipService.isValidateIPv4(iPv4));

        System.out.print("Enter IPv6 address: ");
        String addressIPv6 = scanner.nextLine();
        IP iPv6 = new IP(addressIPv6);
        System.out.println("Valid IPv6 address: " + ipService.isValidateIPv6(iPv6));

        System.out.println("\n##########Task2##########");

        System.out.print("Enter directory path: ");
        String pathDirectory = scanner.nextLine();

        DirectoryService directoryService = new DirectoryService();
        List<Path> documentPaths = directoryService.processFilesFromDirectory(pathDirectory);

        DocumentService documentService = new DocumentService();
        System.out.print("Enter the number of documents to be read: ");
        int quantityDocuments = scanner.nextInt();

        Map<String, Document> documents = documentService.retrieveInformationFromDocument(
                documentPaths, quantityDocuments);

        System.out.println("Number of invalid documents: " +
                documentService.calculateOfNumberOfInvalidDocuments(documents));

        System.out.println("Number of processed documents: " +
                documentService.countNumberOfProcessedDocuments(documents, quantityDocuments));
    }
}

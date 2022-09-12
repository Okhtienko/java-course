package com.it.technology.lesson13.services;

import com.it.technology.lesson13.classes.Document;
import com.it.technology.lesson13.utils.DocumentNumberUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DocumentService {

    public List<Document> generateDocumentList(Scanner scanner) {
        ArrayList<Document> documents = new ArrayList<>();
        String fileName = "";
        String filePath = "";

        while (!(fileName.equals("0"))) {
            System.out.print("Input file name: ");
            fileName = scanner.nextLine();

            if (fileName.equals("0")) {
                break;
            }

            System.out.print("Input path file: ");
            filePath = scanner.nextLine();

            Document document = createDocument(fileName, filePath);
            documents.add(document);
        }

        return documents;
    }

    private Document createDocument(final String fileName, final String filePath) {
        Document document = new Document();
        document.setName(fileName);
        document.setPath(filePath);
        return  document;
    }

    public void displayDocumentList(final List<Document> documents) {
        Document document;

        for (int i = 0; i < documents.size(); i++) {
            document = documents.get(i);
            System.out.printf("%s%s%n", "File directory: ", document.getPath() + "/" + document.getName());
        }
    }

    private Set generateSetDocumentNumbers(final List<Document> documents) throws IOException {
        Set<String> setDocumentNumbers = new HashSet<>();
        final List<List<String>> documentNumbers = readDocument(documents);

        for (int i = 0; i < documentNumbers.size(); i++) {
            for (int j = 0; j < documentNumbers.get(i).size(); j++) {
                setDocumentNumbers.add(documentNumbers.get(i).get(j));
            }
        }

        return setDocumentNumbers.isEmpty() ? null : setDocumentNumbers;
    }

    private List<List<String>> readDocument(final List<Document> documents) throws IOException {
        List<List<String>> documentNumbers = new ArrayList<>();
        Document document;

        for (int i = 0; i < documents.size(); i++) {
            document = documents.get(i);
            final String path = document.getPath() + "/" + document.getName();
            documentNumbers.add(Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8));
        }

        return documentNumbers.isEmpty() ? null : documentNumbers;
    }

    private Map generateMapDocumentNumbers(final List<Document> documentsList) throws IOException {
        final Set<String> documentNumbers = generateSetDocumentNumbers(documentsList);
        Map<String, String> documents = new HashMap<>();
        final String invalidMessage = "the document number does not start with docnum/contract sequences, " +
                "or the length of the number is short/exceeds 15 characters.";
        final String validMessage = "valid";

        for (String documentNumber : documentNumbers) {
            if (DocumentNumberUtil.isDocumentNumberValid(documentNumber)) {
                documents.put(documentNumber, validMessage);
            } else {
                documents.put(documentNumber, invalidMessage);
            }
        }

        return documents.isEmpty() ? null : documents;
    }

    public void writeNumbersToFile(final String path, final List<Document> documentsList) throws IOException {
        final Map<String, String> documentNumbers = generateMapDocumentNumbers(documentsList);
        String documentNumbersInformation = "";

        for (Map.Entry<String, String> documentNumber : documentNumbers.entrySet()) {
            final String documentInformation = documentNumber.getKey() + " - " + documentNumber.getValue() + "\n";
            documentNumbersInformation += documentInformation;
        }

        Files.writeString(Paths.get(path), documentNumbersInformation, StandardCharsets.UTF_8);
    }
}

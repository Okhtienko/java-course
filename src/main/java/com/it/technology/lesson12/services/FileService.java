package com.it.technology.lesson12.services;

import com.it.technology.lesson12.utils.DocumentNumberUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class FileService {

    public static List<String> readFile(String path) throws IOException {
        final List<String> documentNumbers = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
        return documentNumbers.size() == 0 ? null : documentNumbers;
    }

    public static void displayInformationAboutDocumentNumbers(final List<String> documentNumbers) {
        for (String documentNumber : documentNumbers) {
            if (DocumentNumberUtil.isDocumentNumberValid(documentNumber)) {
                System.out.println("Document number " + documentNumber + " is valid");
            } else {
                System.out.println("Document number " + documentNumber + " is invalid");
            }
        }
    }

    public static void writeValidNumbersToFile(String path, List<String> documentNumbers) throws IOException{
        Files.write(Paths.get(path),
                generateListOfValidDocumentNumbers(documentNumbers),
                StandardCharsets.UTF_8);
    }

    public static void writeInvalidNumbersToFile(String path, List<String> documentNumbers) throws IOException{
        Files.write(Paths.get(path),
                generateListOfInvalidDocumentNumbers(documentNumbers),
                StandardCharsets.UTF_8);
    }

    private static List<String> generateListOfValidDocumentNumbers(final List<String> documentNumbers) {
        List<String> validDocumentNumbers = new ArrayList<>();
        for (String documentNumber : documentNumbers) {
            if (DocumentNumberUtil.isDocumentNumberValid(documentNumber)) {
                validDocumentNumbers.add(documentNumber);
            }
        }
        return documentNumbers.size() == 0 ? null : validDocumentNumbers;
    }

    private static List<String> generateListOfInvalidDocumentNumbers(final List<String> documentNumbers) {
        List<String> invalidDocumentNumbers = new ArrayList<>();
        final String message = "the document number does not start with docnum/contract sequences, " +
                "or the length of the number is short/exceeds 15 characters.";
        for (String documentNumber : documentNumbers) {
            if (!DocumentNumberUtil.isDocumentNumberValid(documentNumber)) {
                invalidDocumentNumbers.add(documentNumber + " - " + message);
            }
        }
        return documentNumbers.size() == 0 ? null : invalidDocumentNumbers;
    }
}

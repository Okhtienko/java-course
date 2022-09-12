package com.it.technology.lesson17.classes;

import com.it.technology.lesson17.utils.DocumentNumberUtil;
import com.it.technology.lesson17.utils.EmailUtil;
import com.it.technology.lesson17.utils.PhoneNumberUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class DocumentService {
    public long calculateOfNumberOfInvalidDocuments(Map<String, Document> mapDocuments) {
        return mapDocuments
                .entrySet()
                .stream()
                .filter(document -> document.getValue().getNumber().isEmpty())
                .count();
    }

    public int countNumberOfProcessedDocuments(Map<String, Document> mapDocument, int quantityDocument ) {
        return Math.min(mapDocument.size(), quantityDocument);
    }

    public Map<String, Document> retrieveInformationFromDocument(final List<Path> documents, int quantityDocuments) {
        Map<String, List<String>> mapDocuments = generateMapFiles(documents);
        return mapDocuments
                .entrySet()
                .stream()
                .limit(quantityDocuments)
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                text -> createDocument(
                                        DocumentNumberUtil.isValidDocumentNumber(text.getValue()),
                                        EmailUtil.isValidEmail(text.getValue()),
                                        PhoneNumberUtil.isValidPhoneNumber(text.getValue()))
                        )
                )
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new
                        )
                );
    }

    private Map<String, List<String>> generateMapFiles(final List<Path> documents) {
        return documents.stream().collect(
                Collectors.toMap(
                        key -> key.getFileName().toString().replaceFirst("[.][^.]+$", ""),
                        value -> {
                            try {
                                return Files.readAllLines(value, StandardCharsets.UTF_8);
                            } catch (IOException exception) {
                                exception.printStackTrace();
                            }
                            return new ArrayList<>();
                        })
        );
    }

    private Document createDocument(List<String> number, List<String> email, List<String> phoneNumber) {
        return new Document(number, email, phoneNumber);
    }
}

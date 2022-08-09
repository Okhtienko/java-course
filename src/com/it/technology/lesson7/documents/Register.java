package com.it.technology.lesson7.documents;

import com.it.technology.lesson7.documents.Document;

import java.util.ArrayList;

public class Register {
    private ArrayList<Document> documents = new ArrayList<Document>();

    public Register(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public Register() {

    }

    private Document searchDocumentByNumber(int documentNumber) {
        for (int i = 0; i < documents.size(); i++) {
            final  Document document = documents.get(i);
            if (documentNumber == document.getNumberDocument()) {
                return document;
            }
        }

        return null;
    }

    public void addDocument(Document document) throws RuntimeException {
        if (documents.size() == 0) {
            documents.add(document);
        } else {
            for (int i = 0; i < documents.size(); i++) {
                final  Document documentInList = documents.get(i);
                if (documentInList.getNumberDocument() != document.getNumberDocument()) {
                    documents.add(document);
                    break;
                } else {
                    throw new RuntimeException("Document with " + document.getNumberDocument() + " number already exists");
                }
            }
        }
    }

    public void displayInformationDocument(int documentNumber) {
        final Document document = searchDocumentByNumber(documentNumber);
        if (document != null) {
            System.out.println(document.getInformationOfDocument());
        }
        else {
            System.out.println("Document does not exist");
        }
    }
}

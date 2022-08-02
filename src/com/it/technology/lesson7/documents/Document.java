package com.it.technology.lesson7.documents;

import java.time.LocalDate;

public abstract class Document {
    private int numberDocument;
    private LocalDate dateDocument;

    public Document(int numberDocument, LocalDate dateDocument) {
        this.numberDocument = numberDocument;
        this.dateDocument = dateDocument;
    }

    public Document() {

    }

    public int getNumberDocument() {
        return numberDocument;
    }

    public LocalDate getDateDocument() {
        return dateDocument;
    }

    public abstract String getInformationOfDocument();

}

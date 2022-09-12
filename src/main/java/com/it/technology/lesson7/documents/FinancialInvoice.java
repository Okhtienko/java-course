package com.it.technology.lesson7.documents;

import com.it.technology.lesson7.documents.Document;

import java.time.LocalDate;

public class FinancialInvoice extends Document {
    private double totalAmountForMonth;
    private int departmentCode;

    public FinancialInvoice(int numberDocument, LocalDate dateDocument, double totalAmountForMonth, int departmentCode) {
        super(numberDocument, dateDocument);
        this.totalAmountForMonth = totalAmountForMonth;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice() {

    }

    @Override
    public String getInformationOfDocument() {
        StringBuilder informationOfDocument = new StringBuilder("Financial invoice\n");
        informationOfDocument.append("N-" + getNumberDocument() + "\n");
        informationOfDocument.append(getDateDocument() + "\n");
        informationOfDocument.append(departmentCode + "\n");
        informationOfDocument.append(totalAmountForMonth + "$\n");
        return informationOfDocument.toString();
    }
}

package com.it.technology.lesson7.documents;

import java.time.LocalDate;

public class ContractEmployee extends Document {
    private String nameEmployee;
    private LocalDate contractEndDate;

    public ContractEmployee(int numberDocument, LocalDate dateDocument, String nameEmployee, LocalDate contractEndDate) {
        super(numberDocument, dateDocument);
        this.nameEmployee = nameEmployee;
        this.contractEndDate = contractEndDate;
    }

    public ContractEmployee() {

    }

    @Override
    public String getInformationOfDocument() {
        StringBuilder informationOfDocument = new StringBuilder("Contract with an employee\n");
        informationOfDocument.append("N-" + getNumberDocument() + "\n");
        informationOfDocument.append(nameEmployee + "\n");
        informationOfDocument.append(getDateDocument() + "\n");
        informationOfDocument.append(contractEndDate + "\n");
        return informationOfDocument.toString();
    }
}

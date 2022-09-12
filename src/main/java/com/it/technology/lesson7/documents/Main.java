package com.it.technology.lesson7.documents;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.print("##########Task3##########\n");

        Document contractEmployee = new ContractEmployee(554,
                LocalDate.of(2022, 7, 27),
                "Trofimov Semyon",
                LocalDate.of(2026, 7, 27));

        Document financialInvoice = new FinancialInvoice(423,
                LocalDate.of(2021, 5, 12),
                15578.45,
                4567);

        Document contractSupplyGoods = new ContractSupplyGoods(348,
                LocalDate.of(2022, 12, 19),
                "consumer",
                250);
        Document test = new FinancialInvoice();

        Register register = new Register();
        register.addDocument(contractSupplyGoods);
        register.addDocument(financialInvoice);
        register.addDocument(contractEmployee);

        register.displayInformationDocument(12);

    }
}

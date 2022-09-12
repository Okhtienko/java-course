package com.it.technology.lesson7.documents;

import java.time.LocalDate;

public class ContractSupplyGoods extends Document {
    private String goodsType;
    private int numberOfGoods;

    public ContractSupplyGoods(int numberDocument, LocalDate dateDocument, String goodsType, int numberOfGoods) {
        super(numberDocument, dateDocument);
        this.goodsType = goodsType;
        this.numberOfGoods = numberOfGoods;
    }

    public ContractSupplyGoods() {

    }

    @Override
    public String getInformationOfDocument() {
        StringBuilder informationOfDocument = new StringBuilder("Contract for the supply of goods\n");
        informationOfDocument.append("N-" + getNumberDocument() + "\n");
        informationOfDocument.append(getDateDocument() + "\n");
        informationOfDocument.append(goodsType + "\n");
        informationOfDocument.append(numberOfGoods + "\n");
        return informationOfDocument.toString();
    }
}

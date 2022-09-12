package com.it.technology.lesson10.classes;

import com.it.technology.lesson10.services.ServiceDocumentInformation;
import com.it.technology.lesson10.services.ServiceTextInformation;

public class Main {
    public static void main(String[] args) {

        System.out.println("##########Task1##########\n");

        Text firstText = new Text("1234-abc-5678-def-g9h0");
        ServiceDocumentInformation serviceDocument = new ServiceDocumentInformation();
        serviceDocument.displayInformation(firstText);

        System.out.println("\n##########Task2##########");

        Text secondText = new Text("Lorem ipsum non");
        ServiceTextInformation serviceTextInformation = new ServiceTextInformation();
        serviceTextInformation.displayInformation(secondText);

    }
}

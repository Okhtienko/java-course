package com.it.technology.lesson13.classes;

import com.it.technology.lesson13.services.DocumentService;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("##########Task1##########");

        DocumentService documentService = new DocumentService();

        List<Document> documents = documentService.generateDocumentList(scanner);
        String path = "./src/com/it/technology/lesson13/files/report.txt";

        System.out.println();
        documentService.displayDocumentList(documents);
        documentService.writeNumbersToFile(path, documents);

        System.out.println("\nCheck report.txt");

        System.out.println("\n##########Task2##########");

        CustomArrayList<Integer> arrayList = new CustomArrayList<>();
        CustomArrayListService arrayListService = new CustomArrayListService();

        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(0);

        System.out.print("Source arrayList:\n");
        arrayListService.displayArrayList(arrayList);
        System.out.println();

        System.out.println("\nRemoved element by index 16: " + arrayList.removeByIndex(16));
        arrayListService.displayArrayList(arrayList);
        System.out.println();

        System.out.println("\nRemoved element by index 0: " + arrayList.removeByIndex(0));
        arrayListService.displayArrayList(arrayList);
        System.out.println();

        System.out.println("\nRemoved element by index 8: " + arrayList.removeByIndex(8));
        arrayListService.displayArrayList(arrayList);
        System.out.println();

    }
}

package com.it.technology.lesson14.classes;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateService dateService = new DateService();

        System.out.println("##########Task1##########");

        System.out.print("Input date in the format dd.MM.yyyy: ");
        String date = scanner.next();
        System.out.println("Day of the week on " + date + " - " + dateService.findDayOfWeek(date));

        System.out.println("\n##########Task2##########");

        LocalDate localDate = LocalDate.now();
        System.out.println("Next tuesday: " + dateService.findNextTuesdayDate(localDate));

        System.out.println("\n##########Task3##########");

        System.out.print("Input the key: ");
        int key = scanner.nextInt();
        InformationService informationService = new InformationService();
        informationService.display(key, "Hello World", 5);
    }
}

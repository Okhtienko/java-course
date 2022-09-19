package com.it.technology.lesson18.services;

import com.it.technology.lesson18.classes.Sonnet;

public final class SonnetService {
    public void displayInformationAboutSonnet(final Sonnet sonnet) {
        System.out.printf("%-6s%-10s%n%-9s%-10s%n%-10s%-10s%n%-5s%-5d%n%-6s%10s%n%-7s%-10s%n%n",
                "Name: ",
                sonnet.getAuthor().getFirstName(),
                "Surname: ",
                sonnet.getAuthor().getLastName(),
                "Nationality: ",
                sonnet.getAuthor().getNationality(),
                "Age: ",
                sonnet.getAuthor().getYearOfDeath() - sonnet.getAuthor().getYearOfBirth(),
                "Type: ",
                sonnet.getType(),
                "Title: ",
                sonnet.getTitle()
        );
        sonnet.getLine().forEach(System.out::println);
    }
}

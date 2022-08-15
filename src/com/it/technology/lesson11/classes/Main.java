package com.it.technology.lesson11.classes;

import com.it.technology.lesson11.exceptions.WrongLoginException;
import com.it.technology.lesson11.exceptions.WrongPasswordException;
import com.it.technology.lesson11.exceptions.WrongSubsequenceException;
import com.it.technology.lesson11.services.CredentialsService;
import com.it.technology.lesson11.services.DocumentParserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException,
            WrongPasswordException, WrongSubsequenceException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("##########Task1##########\n");

        System.out.print("Input document number: ");
        String documentNumber = scanner.next();
        Text text = new Text();
        text.setText(documentNumber);

        DocumentParserService.isDocumentNumberValid(text, "5555");

        System.out.print("\n##########Task2##########\n");

        System.out.print("Input login: ");
        String login = scanner.next();
        System.out.print("Input password: ");
        String password = scanner.next();
        System.out.print("Confirm password: ");
        String confirmPassword = scanner.next();

        Credentials credentials = new Credentials();
        credentials.setLogin(login);
        credentials.setPassword(password);
        credentials.setConfirmPassword(confirmPassword);

        System.out.println();
        String regex = "[\\w]{1,20}";
        CredentialsService.isCredentialsValid(credentials, regex);
    }
}

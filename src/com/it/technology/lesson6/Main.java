package com.it.technology.lesson6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("##########Task1##########\n");

        CreditCard creditCardOne = new CreditCard();
        creditCardOne.setNameCard("VISA");
        creditCardOne.setBankAccountNumber(4130594230702273L);
        creditCardOne.setCurrentSum(2507.599);

        CreditCard creditCardTwo = new CreditCard();
        creditCardTwo.setNameCard("MASTERCARD");
        creditCardTwo.setBankAccountNumber(5489529307275385L);
        creditCardTwo.setCurrentSum(4755.6174);

        CreditCard creditCardThree = new CreditCard();
        creditCardThree.setNameCard("MASTERCARD");
        creditCardThree.setBankAccountNumber(5366004165765917L);
        creditCardThree.setCurrentSum(3089.7652);

        creditCardOne.creditingMoneyBankCard(1200.5);
        creditCardTwo.creditingMoneyBankCard(575.08);
        creditCardThree.withdrawMoneyBankCard(89.77);

        creditCardOne.displayingCurrentStateCard();
        System.out.println();
        creditCardTwo.displayingCurrentStateCard();
        System.out.println();
        creditCardThree.displayingCurrentStateCard();
        System.out.println();

        System.out.print("##########Task2##########\n");

        Computer computerOne = new Computer("ZenBook Asus", 1012.9900);
        HDD computerHDD = new HDD("HP", "embedded", 1000);
        RAM computerRAM = new RAM("Kingston KVR32S22S8", "DDR4", 16);
        Computer computerTwo = new Computer("HP Pavilion Gaming", 1410.9991, computerHDD, computerRAM);

        computerOne.displayingInformationComputer();
        System.out.println();
        computerTwo.displayingInformationComputer();

    }
}

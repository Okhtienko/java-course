package com.it.technology.lesson8.phone;

import java.util.ArrayList;

public class ListPhone {
    private ArrayList<String> listOfPhoneNumbers = new ArrayList<>();

    public void addPhoneNumbersInList(Phone numberPhone) throws RuntimeException{
        if ((listOfPhoneNumbers.size() == 0) && (numberPhone.getNumber() != null)) {
            listOfPhoneNumbers.add(numberPhone.getNumber());
        } else {
            for (int i = 0; i < listOfPhoneNumbers.size(); i++) {
                if (listOfPhoneNumbers.get(i) != numberPhone.getNumber()) {
                    listOfPhoneNumbers.add(numberPhone.getNumber());
                    break;
                } else {
                    throw new RuntimeException("Number already added to the list");
                }
            }
        }
    }

    public  void sendMessage() {
        System.out.println("List of phone numbers:");
        for (int i = 0; i < listOfPhoneNumbers.size(); i++) {
            System.out.println(listOfPhoneNumbers.get(i));
        }
    }


}

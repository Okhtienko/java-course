package com.it.technology.lesson8.phone;

public class Main {
    public static void main(String[] args) {
        System.out.print("##########Task1##########\n");

        Phone firstPone = new Phone();
        Phone secondPone = new Phone("+7(93)445-97-27", "Apple iPhone 13");
        Phone thirdPhone = new Phone("+46(174)394-08-66", "Huawei P50 ABR-LX9", 350);

        ServicePhone servicePhone = new ServicePhone();

        servicePhone.receiveCall("Victor");
        servicePhone.receiveCall("Catherine", thirdPhone);

        System.out.println();

        ListPhone listPhone = new ListPhone();

        listPhone.addPhoneNumbersInList(firstPone);
        listPhone.addPhoneNumbersInList(secondPone);
        listPhone.addPhoneNumbersInList(thirdPhone);

        listPhone.sendMessage();
    }
}

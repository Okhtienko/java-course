package com.it.technology.lesson8.phone;

public class ServicePhone {

    public void receiveCall(String callerIsName) {
        System.out.println("Calling " + callerIsName);
    }

    public void receiveCall(String callerIsName, Phone numberPhone) {
        String number = numberPhone.getNumber();
        System.out.println("Calling " + callerIsName + " " + number);
    }
}

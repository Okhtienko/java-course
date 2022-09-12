package com.it.technology.lesson8.phone;

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }
}

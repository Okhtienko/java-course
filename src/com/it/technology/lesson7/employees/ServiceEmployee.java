package com.it.technology.lesson7.employees;

public class ServiceEmployee {

    public void displayInformationArray(Displayable[] array) {
        for (Displayable value : array) {
            value.displayInformationEmployee();
        }
    }
}

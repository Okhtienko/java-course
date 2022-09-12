package com.it.technology.lesson7.employees;

public class Main {
    public static void main(String[] args) {

        System.out.print("##########Task2##########\n");

        Worker worker = new Worker(121,
                "Shumilo Pavel",
                2500,
                31);

        Accountant accountant = new Accountant(37,
                "Ilyina Polina",
                2700,
                43);

        ChiefExecutiveOfficer chiefExecutiveOfficer = new ChiefExecutiveOfficer(5,
                "Kornilov Rostislav",
                5800,
                37);

        Displayable[] employees = {worker, accountant, chiefExecutiveOfficer};
        ServiceEmployee serviceEmployee = new ServiceEmployee();
        serviceEmployee.displayInformationArray(employees);
    }
}

package com.it.technology.lesson7.employees;

public class ChiefExecutiveOfficer extends Employee implements Displayable{


    public ChiefExecutiveOfficer(int idEmployee,
                                 String nameEmployee,
                                 double salaryEmployee,
                                 int ageEmployee)
    {
        super(idEmployee, nameEmployee, salaryEmployee, ageEmployee);
    }

    @Override
    public void displayInformationEmployee() {
        System.out.printf("%s" + " - " + "%s%n", getNameEmployee(), "chief executive officer");
    }
}

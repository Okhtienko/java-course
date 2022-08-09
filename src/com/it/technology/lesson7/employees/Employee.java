package com.it.technology.lesson7.employees;

public class Employee {

    private int idEmployee;
    private String nameEmployee;
    private double salaryEmployee;
    private int ageEmployee;

    public Employee(int idEmployee, String nameEmployee, double salaryEmployee, int ageEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.salaryEmployee = salaryEmployee;
        this.ageEmployee = ageEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }
}

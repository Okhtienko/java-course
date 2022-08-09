package com.it.technology.lesson6;

public class Computer {
    private String modelComputer;
    private double costComputer;
    private HDD computerHDD = new HDD();
    private RAM computerRAM = new RAM();

    public Computer(String modelComputer, double costComputer) {
        this.modelComputer = modelComputer;
        this.costComputer = costComputer;
    }

    public Computer(String modelComputer, double costComputer, HDD computerHDD, RAM computerRAM) {
        this.modelComputer = modelComputer;
        this.costComputer = costComputer;
        this.computerHDD = computerHDD;
        this.computerRAM = computerRAM;
    }

    public void displayingInformationComputer() {
        System.out.printf("%s%s%n%s%.2f%s%n",
                "Model computer: ",
                modelComputer,
                "Computer cost: ",
                costComputer,
                "$");
        System.out.println("RAM information: ");
        computerRAM.displayingInformationRAM();
        System.out.println("HDD information: ");
        computerHDD.displayingInformationHDD();
    }
}

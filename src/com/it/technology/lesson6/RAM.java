package com.it.technology.lesson6;

public class RAM {
    private String nameRAM;
    private String typeRAM;
    private int volumeRAM;

    public RAM(String nameRAM, String typeRAM, int volumeRAM) {
        this.nameRAM = nameRAM;
        this.typeRAM = typeRAM;
        this.volumeRAM = volumeRAM;
    }

    public RAM() {

    }

    public void displayingInformationRAM() {
        System.out.printf("%s%s%n%s%s%n%s%d%s%n",
                "\t1.Name RAM: ",
                nameRAM,
                "\t2.Type RAM: ",
                typeRAM,
                "\t3.Volume RAM: ",
                volumeRAM,
                "GB");
    }
}

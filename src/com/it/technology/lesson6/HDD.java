package com.it.technology.lesson6;

public class HDD {
    private String nameHDD;
    private String typeHDD;
    private int volumeHDD;

    public HDD(String nameHDD, String typeHDD, int volumeHDD) {
        this.nameHDD = nameHDD;
        this.typeHDD = typeHDD;
        this.volumeHDD = volumeHDD;
    }

    public HDD() {

    }

    public void displayingInformationHDD() {
        System.out.printf("%s%s%n%s%s%n%s%d%s%n",
                "\t1.Name HDD: ",
                nameHDD,
                "\t2.Type HDD: ",
                typeHDD,
                "\t3.Volume HDD: ",
                volumeHDD,
                "GB");
    }
}

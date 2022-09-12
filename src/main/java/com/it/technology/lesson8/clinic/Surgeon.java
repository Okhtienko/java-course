package com.it.technology.lesson8.clinic;

public class Surgeon extends Person implements Treatable {
    public Surgeon(int idPerson,
                   String firstName,
                   String lastName,
                   String gender,
                   int age,
                   String position)
    {
        super(idPerson, firstName, lastName, gender, age, position);
    }

    public Surgeon(Person surgeon) {
        super(surgeon.getIdPerson(),
                surgeon.getFirstName(),
                surgeon.getLastName(),
                surgeon.getGender(),
                surgeon.getAge(),
                surgeon.getPosition());
    }

    @Override
    public String getInformation() {
        String personalMatter = "The doctor's personal file:\n" + getFirstName() + " " +
                getLastName() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Age: " + getAge() + "\n" +
                "Position: " + getPosition() + "\n";
        return personalMatter;
    }

    @Override
    public void treat() {
        System.out.println("Treatment of fractures and bone cracks of all types\n");
    }
}

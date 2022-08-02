package com.it.technology.lesson8.clinic;

public class Therapist extends Person implements Treatable {
    public Therapist(int idPerson,
                     String firstName,
                     String lastName,
                     String gender,
                     int age,
                     String position)
    {
        super(idPerson, firstName, lastName, gender, age, position);
    }

    public Therapist(Person therapist) {
        super(therapist.getIdPerson(),
                therapist.getFirstName(),
                therapist.getLastName(),
                therapist.getGender(),
                therapist.getAge(),
                therapist.getPosition());
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
        System.out.println("Treatment of acute respiratory viral infections\n");
    }
}

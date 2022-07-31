package com.it.technology.lesson8.clinic;

public class Therapist extends Person implements Treatable {
    public Therapist(int idPerson,
                     String firstName,
                     String lastName,
                     String gender,
                     int age)
    {
        super(idPerson, firstName, lastName, gender, age);
    }

    @Override
    public String getInformation() {
        StringBuilder personalMatter = new StringBuilder("Therapist\n");
        personalMatter.append(getFirstName() + " ");
        personalMatter.append(getLastName() + "\n");
        personalMatter.append("Gender: " + getGender() + "\n");
        personalMatter.append("Age: " + getAge() + "\n");
        return personalMatter.toString();
    }

    @Override
    public void treat() {
        System.out.println("Treatment of acute respiratory viral infections");
    }
}

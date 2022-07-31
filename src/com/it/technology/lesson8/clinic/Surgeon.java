package com.it.technology.lesson8.clinic;

public class Surgeon extends Person implements Treatable {
    public Surgeon(int idPerson,
                   String firstName,
                   String lastName,
                   String gender,
                   int age)
    {
        super(idPerson, firstName, lastName, gender, age);
    }

    public Surgeon(Person surgeon) {
        super(surgeon.getIdPerson(),
                surgeon.getFirstName(),
                surgeon.getLastName(),
                surgeon.getGender(),
                surgeon.getAge());
    }

    @Override
    public String getInformation() {
        StringBuilder personalMatter = new StringBuilder("Surgeon\n");
        personalMatter.append(getFirstName() + " ");
        personalMatter.append(getLastName() + "\n");
        personalMatter.append("Gender: " + getGender() + "\n");
        personalMatter.append("Age: " + getAge() + "\n");
        return personalMatter.toString();
    }

    @Override
    public void treat() {
        System.out.println("Treatment of fractures and bone cracks of all types");
    }
}

package com.it.technology.lesson8.clinic;

public class Dentist extends Person implements Treatable {
    public Dentist(int idPerson,
                   String firstName,
                   String lastName,
                   String gender,
                   int age)
    {
        super(idPerson, firstName, lastName, gender, age);
    }

    public Dentist(Person dentist) {
        super(dentist.getIdPerson(),
                dentist.getFirstName(),
                dentist.getLastName(),
                dentist.getGender(),
                dentist.getAge());
    }

    @Override
    public String getInformation() {
        StringBuilder personalMatter = new StringBuilder("Dentist:\n");
        personalMatter.append(getFirstName() + " ");
        personalMatter.append(getLastName() + "\n");
        personalMatter.append("Gender: " + getGender() + "\n");
        personalMatter.append("Age: " + getAge() + "\n");
        return personalMatter.toString();
    }

    @Override
    public void treat() {
        System.out.println("Filling of shallow caries without complications");
    }
}

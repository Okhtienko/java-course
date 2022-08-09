package com.it.technology.lesson8.clinic;

public class Dentist extends Person implements Treatable {
    public Dentist(int idPerson,
                   String firstName,
                   String lastName,
                   String gender,
                   int age,
                   String position)
    {
        super(idPerson, firstName, lastName, gender, age, position);
    }

    public Dentist(Person dentist) {
        super(dentist.getIdPerson(),
                dentist.getFirstName(),
                dentist.getLastName(),
                dentist.getGender(),
                dentist.getAge(),
                dentist.getPosition());
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
        System.out.println("Filling of shallow caries without complications\n");
    }
}

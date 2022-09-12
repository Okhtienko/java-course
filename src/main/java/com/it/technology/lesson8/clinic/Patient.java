package com.it.technology.lesson8.clinic;

public class Patient extends Person {
    private boolean isSick;
    private TreatmentPlan keyPlan;

    public Patient(int idPerson,
                   String firstName,
                   String lastName,
                   String gender,
                   int age,
                   boolean isSick,
                   TreatmentPlan keyPlan)
    {
        super(idPerson, firstName, lastName, gender, age);
        this.isSick = isSick;
        this.keyPlan = keyPlan;
    }

    public TreatmentPlan getKeyPlan() {
        return keyPlan;
    }

    private String isStickPerson() {
        String status = "";
        if (isSick == true) {
            status += "Yes";
        } else {
            status += "No";
        }

        return status;
    }

    @Override
    public String getInformation() {
        String personalMatter = "The patient's personal file:\n" + getFirstName() + " " +
                getLastName() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Age: " + getAge() + "\n" +
                "Sick: " + isStickPerson();
        return personalMatter;
    }
}

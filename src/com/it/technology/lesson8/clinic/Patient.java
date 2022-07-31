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

    public boolean isSick() {
        return isSick;
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
        StringBuilder personalMatter = new StringBuilder("Patient\n");
        personalMatter.append(getFirstName() + " ");
        personalMatter.append(getLastName() + "\n");
        personalMatter.append("Gender: " + getGender() + "\n");
        personalMatter.append("Age: " + getAge() + "\n");
        personalMatter.append("Sick: " + isStickPerson() + "\n");
        return personalMatter.toString();
    }
}

package com.it.technology.lesson8.clinic;

public class Main {
    public static void main(String[] args) {
        System.out.print("##########Task2##########\n");
        Surgeon surgeon = new Surgeon(1,
                "Agnes",
                "Battle",
                "female",
                37,
                "surgeon");
        Dentist dentist = new Dentist(2,
                "Joseph",
                "Hull",
                "male",
                28,
                "dentist");
        Therapist therapist = new Therapist(3,
                "Tracy",
                "Berumen",
                "female",
                41,
                "therapist");

        ServiceClinic doctors = new ServiceClinic();
        doctors.addPerson(surgeon);
        doctors.addPerson(dentist);
        doctors.addPerson(therapist);

        doctors.displayInformationPerson(1);
        doctors.displayInformationPerson(2);
        doctors.displayInformationPerson(3);

        TreatmentPlan firstPlan = new TreatmentPlan(1);
        TreatmentPlan secondPlan = new TreatmentPlan(2);
        TreatmentPlan thirdPlan = new TreatmentPlan(3);

        Patient firstPatient = new Patient(1,
                "James",
                "Sutton",
                "female",
                85,
                true,
                firstPlan);

        Patient secondPatient = new Patient(2,
                "Alpha",
                "Galarza",
                "male",
                25,
                true,
                secondPlan);

        Patient thirdPatient = new Patient(3,
                "Louis",
                "Garcia",
                "male",
                48,
                true,
                thirdPlan);

        ServiceClinic patients = new ServiceClinic();
        patients.addPerson(firstPatient);
        patients.addPerson(secondPatient);
        patients.addPerson(thirdPatient);

        patients.displayInformationPerson(1);
        patients.makeDoctorAppointment(firstPatient, doctors);

        patients.displayInformationPerson(2);
        patients.makeDoctorAppointment(secondPatient, doctors);

        patients.displayInformationPerson(3);
        patients.makeDoctorAppointment(thirdPatient, doctors);
    }
}

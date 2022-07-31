package com.it.technology.lesson8.clinic;

public class Main {
    public static void main(String[] args) {
        System.out.print("##########Task2##########\n");
        Surgeon surgeon = new Surgeon(1, "Agnes", "Battle", "female", 37);
        Dentist dentist = new Dentist(2, "Joseph", "Hull", "male", 28);
        Therapist therapist = new Therapist(3, "Tracy", "Berumen", "female", 41);

        ServiceClinic doctors = new ServiceClinic();
        doctors.addPerson(surgeon);
        doctors.addPerson(dentist);
        doctors.addPerson(therapist);

        doctors.displayInformationPerson(2);

        TreatmentPlan firstPlan = new TreatmentPlan(1);

        Patient patient = new Patient(1,
                "James",
                "Sutton",
                "female",
                85,
                true,
                firstPlan);

        ServiceClinic patients = new ServiceClinic();
        patients.addPerson(patient);
        patients.displayInformationPerson(1);

        patients.makeDoctorAppointment(patient, doctors);

    }
}

package com.it.technology.lesson8.clinic;

import java.util.ArrayList;

public class ServiceClinic {
    ArrayList<Person> personList = new ArrayList<>();

    private Person searchPersonById(int idPerson) {
        for (int i = 0; i < personList.size(); i++) {
            final  Person person = personList.get(i);
            if (idPerson == person.getIdPerson()) {
                return person;
            }
        }

        return null;
    }

    public void addPerson(Person person) throws RuntimeException {
        if (personList.size() == 0) {
            personList.add(person);
        } else {
            for (int i = 0; i < personList.size(); i++) {
                final  Person personInList = personList.get(i);
                if (personInList.getIdPerson() != person.getIdPerson()) {
                    personList.add(person);
                    break;
                } else {
                    throw new RuntimeException("person with this " + person.getIdPerson() + " already exists");
                }
            }
        }
    }

    public void displayInformationPerson(int idPerson) {
        final Person person = searchPersonById(idPerson);
        if (person != null) {
            System.out.println(person.getInformation());
        }
        else {
            System.out.println("Person does not exist");
        }
    }

    private Person getObjectById(int idPerson, Person person) {
        if ( idPerson == person.getIdPerson()) {
            return person;
        }

        return null;
    }

    public void makeDoctorAppointment(Patient patient, ServiceClinic listDoctors) {
        TreatmentPlan keyPlan = patient.getKeyPlan();

        for (int i = 0; i < listDoctors.personList.size(); i++) {
            final Person doctorsInList = listDoctors.personList.get(i);
            if (keyPlan.getKey() == 1) {
                Person doctorSurgeon = new Surgeon(getObjectById(1, doctorsInList));
                ((Surgeon)doctorSurgeon).treat();
                break;
            } else if (keyPlan.getKey() == 2) {
                Person doctorDentist = new Dentist(getObjectById(2, doctorsInList));
                ((Dentist)doctorDentist).treat();
                break;
            } else {

            }
        }
    }
}

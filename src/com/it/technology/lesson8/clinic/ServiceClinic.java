package com.it.technology.lesson8.clinic;

import java.util.ArrayList;

public class ServiceClinic {
    ArrayList<Person> personsList = new ArrayList<>();
    static final int KEY_SURGEON = 1;
    static final int KEY_DENTIST = 2;
    static final String POSITION_OF_DOCTOR_IN_ACCORDANCE_WITH_FIRST_KEY = "surgeon";
    static final String POSITION_OF_DOCTOR_IN_ACCORDANCE_WITH_SECOND_KEY = "dentist";
    static final String POSITION_OF_DOCTOR_IN_ACCORDANCE_WITH_THIRD_KEY = "therapist";

    private Person searchPersonById(int idPerson) {
        for (int i = 0; i < personsList.size(); i++) {
            final Person person = personsList.get(i);
            if (idPerson == person.getIdPerson()) {
                return person;
            }
        }
        return null;
    }

    public void addPerson(Person person) throws RuntimeException {
        if (personsList.size() == 0) {
            personsList.add(person);
        } else {
            for (int i = 0; i < personsList.size(); i++) {
                final Person personInList = personsList.get(i);
                if (personInList.getIdPerson() != person.getIdPerson()) {
                    personsList.add(person);
                    break;
                } else {
                    throw new RuntimeException("Person with this " + person.getIdPerson() + " already exists");
                }
            }
        }
    }

    public void displayInformationPerson(int idPerson) {
        final Person person = searchPersonById(idPerson);
        if (person != null) {
            System.out.println(person.getInformation());
        } else {
            System.out.println("Person does not exist");
        }
    }

    private Person searchPersonById(String position) {
        for (int i = 0; i < personsList.size(); i++) {
            final Person person = personsList.get(i);
            if (position == person.getPosition()) {
                return person;
            }
        }
        return null;
    }

    public void makeDoctorAppointment(Patient patient, ServiceClinic listDoctors) {
        TreatmentPlan keyPlan = patient.getKeyPlan();
        for (int i = 0; i < listDoctors.personsList.size(); i++) {
            final Person doctorsInList = listDoctors.personsList.get(i);
            if (keyPlan.getKey() == KEY_SURGEON) {
                if (doctorsInList.getPosition() == POSITION_OF_DOCTOR_IN_ACCORDANCE_WITH_FIRST_KEY.toLowerCase()) {
                    Person doctorSurgeon = new Surgeon(listDoctors.searchPersonById(
                            POSITION_OF_DOCTOR_IN_ACCORDANCE_WITH_FIRST_KEY.toLowerCase()));
                    ((Surgeon) doctorSurgeon).treat();
                    break;
                }
            } else if (keyPlan.getKey() == KEY_DENTIST) {
                if (doctorsInList.getPosition() == POSITION_OF_DOCTOR_IN_ACCORDANCE_WITH_SECOND_KEY.toLowerCase()) {
                    Person doctorDentist = new Dentist(listDoctors.searchPersonById(
                            POSITION_OF_DOCTOR_IN_ACCORDANCE_WITH_SECOND_KEY.toLowerCase()));
                    ((Dentist) doctorDentist).treat();
                    break;
                }
            } else {
                if (doctorsInList.getPosition() == POSITION_OF_DOCTOR_IN_ACCORDANCE_WITH_THIRD_KEY.toLowerCase()) {
                    Person doctorTherapist = new Therapist(listDoctors.searchPersonById(
                            POSITION_OF_DOCTOR_IN_ACCORDANCE_WITH_THIRD_KEY.toLowerCase()));
                    ((Therapist) doctorTherapist).treat();
                    break;
                }
            }
        }
    }
}

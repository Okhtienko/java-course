package com.it.technology.lesson8.clinic;

public abstract class Person {
    private int idPerson;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    public Person(int idPerson,
                  String firstName,
                  String lastName,
                  String gender,
                  int age)
    {
        this.idPerson = idPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public Person(Person person) {
        this.idPerson = person.idPerson;
        this.firstName = person.firstName;
        this.lastName = person.lastName;
        this.gender = person.gender;
        this.age = person.age;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public abstract String getInformation();
}

package com.it.technology.lesson8.clinic;

public abstract class Person {
    private int idPerson;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String position;

    public Person(int idPerson,
                  String firstName,
                  String lastName,
                  String gender,
                  int age,
                  String position)
    {
        this.idPerson = idPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.position = position;
    }

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

    public String getPosition() {
        return position;
    }

    public abstract String getInformation();
}

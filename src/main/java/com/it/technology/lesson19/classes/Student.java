package com.it.technology.lesson19.classes;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String gender;
    private LocalDate birthday;
    private double stipend;
    private int addressId;
    private  int groupId;

    public Student(int id,
                   String name,
                   String surname,
                   String gender,
                   LocalDate birthday,
                   double stipend,
                   int addressId,
                   int groupId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
        this.stipend = stipend;
        this.addressId = addressId;
        this.groupId = groupId;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getStipend() {
        return stipend;
    }

    public void setStipend(double stipend) {
        this.stipend = stipend;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", stipend=" + stipend +
                ", addressId=" + addressId +
                ", groupId=" + groupId +
                '}';
    }
}

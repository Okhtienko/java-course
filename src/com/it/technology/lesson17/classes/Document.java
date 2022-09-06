package com.it.technology.lesson17.classes;

import java.util.List;

public class Document {
    private List<String> number;
    private List<String> email;
    private List<String> phoneNumber;

    public Document(List<String> number, List<String> email, List<String> phoneNumber) {
        this.number = number;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public List<String> getNumber() {
        return number;
    }

    public void setNumber(List<String> number) {
        this.number = number;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "number=" + number +
                ", email=" + email +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}

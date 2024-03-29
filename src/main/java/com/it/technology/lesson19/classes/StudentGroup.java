package com.it.technology.lesson19.classes;

public class StudentGroup {
    private int id;
    private int number;
    private String formOfEducation;
    private int course;

    public StudentGroup(int id, int number, String formOfEducation, int course) {
        this.id = id;
        this.number = number;
        this.formOfEducation = formOfEducation;
        this.course = course;
    }

    public StudentGroup() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFormOfEducation() {
        return formOfEducation;
    }

    public void setFormOfEducation(String formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "id=" + id +
                ", number=" + number +
                ", formOfEducation='" + formOfEducation + '\'' +
                ", course=" + course +
                '}';
    }
}

package com.it.technology.lesson19.services;

import com.it.technology.lesson19.classes.Address;
import com.it.technology.lesson19.classes.Student;
import com.it.technology.lesson19.classes.StudentGroup;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public final class StudentService {
    public void displayInformationAboutStudent(List<Student> students) {
        System.out.printf("%-5s%-15s%-15s%-10s%-5s%-10s%n",
                "Id",
                "Name",
                "Surname",
                "Gender",
                "Age",
                "Stipend");
        System.out.println("_________________________________________________________");
        students.forEach(student -> System.out.printf(
                "%-5d%-15s%-15s%-10s%-5d%-10.2f%n",
                student.getId(),
                student.getName(),
                student.getSurname(),
                student.getGender(),
                Period.between(student.getBirthday(), LocalDate.now()).getYears(),
                student.getStipend())
        );
        System.out.println("_________________________________________________________");
    }

    public void displayInformationAboutGroup(List<StudentGroup> studentGroups) {
        System.out.printf("%-5s%-15s%-20s%-10s%n",
                "Id",
                "Group number",
                "Form of education",
                "Course");
        System.out.println("______________________________________________");
        studentGroups.forEach(studentGroup -> System.out.printf(
                "%-5d%-15d%-20s%-10s%n",
                studentGroup.getId(),
                studentGroup.getNumber(),
                studentGroup.getFormOfEducation(),
                studentGroup.getCourse())
        );
        System.out.println("______________________________________________");
    }

    public void displayInformationAboutAddress(List<Address> addresses) {
        System.out.printf(
                "%-5s%-40s%-25s%-10s%-10s%n",
                "Id",
                "Address",
                "City",
                "Country",
                "Postal code");
        System.out.println(
                "____________________________________________________________________________________________"
        );
        addresses.forEach(address -> System.out.printf(
                "%-5d%-40s%-25s%-10s%-10d%n",
                address.getId(),
                address.getAddressLine(),
                address.getCity(),
                address.getCountry(),
                address.getPostalCode())
        );
        System.out.println(
                "____________________________________________________________________________________________"
        );
    }
 }

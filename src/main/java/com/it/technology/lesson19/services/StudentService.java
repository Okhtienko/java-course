package com.it.technology.lesson19.services;

import com.it.technology.lesson19.classes.Student;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public final class StudentService {
    public void displayInformationAboutStudents(List<Student> students) {
        System.out.printf(
                "%-5s%-15s%-15s%-10s%-5s%-15s%-15s%-10s%n",
                "Id",
                "Name",
                "Surname",
                "Gender",
                "Age",
                "Stipend",
                "Address id",
                "Group id");
        System.out.println(
                "-------------------------------------------------------------------------------------------"
        );
        students.forEach(student -> System.out.printf(
                "%-5d%-15s%-15s%-10s%-5d%-15.2f%-15d%-10d%n",
                student.getId(),
                student.getName(),
                student.getSurname(),
                student.getGender(),
                Period.between(student.getBirthday(), LocalDate.now()).getYears(),
                student.getStipend(),
                student.getAddressId(),
                student.getGroupId())
        );
        System.out.println(
                "-------------------------------------------------------------------------------------------"
        );
    }
}

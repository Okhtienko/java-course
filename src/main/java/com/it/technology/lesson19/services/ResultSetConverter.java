package com.it.technology.lesson19.services;

import com.it.technology.lesson19.classes.Address;
import com.it.technology.lesson19.classes.Student;
import com.it.technology.lesson19.classes.StudentGroup;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public final class ResultSetConverter {
    public Student convertDataInStudent(ResultSet resultSet) {
        Student student = new Student();
        try {
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setSurname(resultSet.getString("surname"));
            student.setGender(resultSet.getString("gender"));
            student.setBirthday(resultSet.getObject("birthday", LocalDate.class));
            student.setStipend(resultSet.getDouble("stipend"));
            student.setAddressId(resultSet.getInt("address_id"));
            student.setGroupId(resultSet.getInt("group_id"));
            return student;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Address convertDataInAddress(ResultSet resultSet) {
        Address address = new Address();
        try {
            address.setId(resultSet.getInt("id"));
            address.setAddressLine(resultSet.getString("address"));
            address.setCity(resultSet.getString("city"));
            address.setCountry(resultSet.getString("country"));
            address.setPostalCode(resultSet.getInt("postal_code"));
            return address;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public StudentGroup convertDataInStudentGroup(ResultSet resultSet) {
        StudentGroup studentGroup = new StudentGroup();
        try {
            studentGroup.setId(resultSet.getInt("id"));
            studentGroup.setNumber(resultSet.getInt("number"));
            studentGroup.setFormOfEducation(resultSet.getString("form_education"));
            studentGroup.setCourse(resultSet.getInt("course"));
            return studentGroup;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

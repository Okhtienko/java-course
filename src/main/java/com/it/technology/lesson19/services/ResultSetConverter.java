package com.it.technology.lesson19.services;

import com.it.technology.lesson19.classes.Address;
import com.it.technology.lesson19.classes.Group;
import com.it.technology.lesson19.classes.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ResultSetConverter {
    public Student convertStudent(final ResultSet resultSet) {
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
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public Address convertAddress(final ResultSet resultSet) {
        Address address = new Address();
        try {
            address.setId(resultSet.getInt("id"));
            address.setAddressLine(resultSet.getString("address"));
            address.setCity(resultSet.getString("city"));
            address.setCountry(resultSet.getString("country"));
            address.setPostalCode(resultSet.getInt("postal_code"));
            return address;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public Group convertGroup(final ResultSet resultSet) {
        Group group = new Group();
        try {
            group.setId(resultSet.getInt("id"));
            group.setNumber(resultSet.getInt("number"));
            group.setFormOfEducation(resultSet.getString("form_education"));
            group.setCourse(resultSet.getInt("course"));
            return group;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}

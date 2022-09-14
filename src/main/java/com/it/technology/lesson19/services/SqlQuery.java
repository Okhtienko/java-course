package com.it.technology.lesson19.services;

import com.it.technology.lesson19.classes.Address;
import com.it.technology.lesson19.classes.Student;
import com.it.technology.lesson19.classes.StudentGroup;
import com.it.technology.lesson19.services.ResultSetConverter;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class SqlQuery {
    private static final String SELECT_STUDENT_QUERY = "SELECT * FROM student";
    private static final String SELECT_ADDRESS_QUERY = "SELECT * FROM address";
    private static final String SELECT_STUDENT_GROUP_QUERY = "SELECT * FROM student_group";
    private static final String DELETE_DATA_STUDENT_QUERY = "DELETE FROM student WHERE id = ?";
    private static final String DELETE_DATA_ADDRESS_QUERY = "DELETE FROM address WHERE id = ?";
    private static final String DELETE_DATA_STUDENT_GROUP_QUERY = "DELETE FROM student_group WHERE id = ?";
    private static final String INSERT_DATA_INTO_ADDRESS = "INSERT INTO address " +
            "(address, city, country, postal_code) " +
            "VALUES (?, ?, ?, ?)";
    private static final String INSERT_INTO_STUDENT_GROUP_QUERY = "INSERT INTO student_group " +
            "(number, form_education, course) " +
            "VALUES (?, ?, ?)";
    private static final String INSERT_INTO_STUDENT_QUERY = "INSERT INTO student " +
            "(name, surname, gender, birthday, stipend, address_id, group_id) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String INNER_JOIN_QUERY = "SELECT student.id, student.name, student.surname, " +
            "student.gender, student_group.number, student_group.course, address.city " +
            "FROM student " +
            "INNER JOIN student_group ON student.group_id = student_group.id " +
            "INNER JOIN address ON student.address_id = address.id";

    public List<Student> getListStudents(final Connection connection, final ResultSetConverter resultSetConverter) {
        List<Student> students = new ArrayList<>();
        try(Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_STUDENT_QUERY);
            while (resultSet.next()) {
                students.add(resultSetConverter.convertDataInStudent(resultSet));
            }
            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Address> getListAddresses(final Connection connection, final ResultSetConverter resultSetConverter) {
        List<Address> addresses = new ArrayList<>();
        try(Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ADDRESS_QUERY);
            while (resultSet.next()) {
                addresses.add(resultSetConverter.convertDataInAddress(resultSet));
            }
            return addresses;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<StudentGroup> getListStudentGroups(
            final Connection connection,
            final ResultSetConverter resultSetConverter
    ) {
        List<StudentGroup> studentGroups = new ArrayList<>();
        try(Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_STUDENT_GROUP_QUERY);
            while (resultSet.next()) {
                studentGroups.add(resultSetConverter.convertDataInStudentGroup(resultSet));
            }
            return studentGroups;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean removeDataStudentById(final Connection connection, final int studentId) {
        try(PreparedStatement preparedStatement = connection.prepareStatement(DELETE_DATA_STUDENT_QUERY)) {
            preparedStatement.setInt(1, studentId);
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean removeDataAddressById(final Connection connection, final int addressId) {
        try(PreparedStatement preparedStatement = connection.prepareStatement(DELETE_DATA_ADDRESS_QUERY)) {
            preparedStatement.setInt(1, addressId);
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean removeDataStudentGroupById(final Connection connection, final int groupId) {
        try(PreparedStatement preparedStatement = connection.prepareStatement(DELETE_DATA_STUDENT_GROUP_QUERY)) {
            preparedStatement.setInt(1, groupId);
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean insertDataIntoTableStudent(
            final Connection connection,
            final String name,
            final String surname,
            final String gender,
            final LocalDate birthday,
            final double stipend,
            final int addressId,
            final int groupId)
    {
        try(PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_STUDENT_QUERY)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, gender);
            preparedStatement.setObject(4, birthday);
            preparedStatement.setDouble(5, stipend);
            preparedStatement.setInt(6, addressId);
            preparedStatement.setInt(7, groupId);
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean insertDataIntoTableAddress(
            final Connection connection,
            final String addressLine,
            final String city,
            final String country,
            final int postalCode) {
        try(PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DATA_INTO_ADDRESS)) {
            preparedStatement.setString(1, addressLine);
            preparedStatement.setString(2, city);
            preparedStatement.setString(3, country);
            preparedStatement.setInt(4, postalCode);
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean insertDataIntoTableGroup(
            final Connection connection,
            final int number,
            final String formOfEducation,
            final int course) {
        try(PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_STUDENT_GROUP_QUERY)) {
            preparedStatement.setInt(1, number);
            preparedStatement.setString(2, formOfEducation);
            preparedStatement.setInt(3, course);
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayAdditionalInformationAboutStudents(final Connection connection) {
        try(Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(INNER_JOIN_QUERY);
            System.out.printf(
                    "%-5s%-15s%-15s%-10s%-15s%-10s%-20s%n",
                    "Id",
                    "Name",
                    "Surname",
                    "Gender",
                    "Group number",
                    "Course",
                    "City"
            );
            System.out.println(
                    "______________________________________________________________________________________"
            );
            while (resultSet.next()) {
                System.out.printf(
                        "%-5d%-15s%-15s%-10s%-15d%-10s%-20s%n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("gender"),
                        resultSet.getInt("number"),
                        resultSet.getInt("course"),
                        resultSet.getString("city")
                );
            }
            System.out.println(
                    "______________________________________________________________________________________"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

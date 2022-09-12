package com.it.technology.lesson19.services;

import com.it.technology.lesson19.classes.Address;
import com.it.technology.lesson19.classes.Group;
import com.it.technology.lesson19.classes.Student;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class SqlQuery {
    private static final String SELECT_FROM_STUDENT_QUERY = "SELECT * FROM student";
    private static final String SELECT_FROM_GROUP_QUERY = "SELECT * FROM group";
    private static final String SELECT_FROM_ADDRESS_QUERY = "SELECT * FROM address";
    private static final String DELETE_FROM_STUDENT_QUERY = "DELETE FROM student WHERE id = ?";

    private static final String DELETE_FROM_GROUP_QUERY = "DELETE FROM group WHERE id = ?";

    private static final String DELETE_FROM_ADDRESS_QUERY = "DELETE FROM address WHERE id = ?";
    private static final String INSERT_INTO_STUDENT_QUERY = "INSERT INTO student " +
            "(name, surname, gender, birthday, stipend, address_id, group_id) VALUES " +
            "(?, ?, ?, ?, ?, ?, ?)";
    private static final String INSERT_INTO_GROUP_QUERY = "INSERT INTO group " +
            "(number, form_education, course) VALUES " +
            "(?, ?, ?)";
    private static final String INSERT_INTO_ADDRESS_QUERY = "INSERT INTO address " +
            "(address, city, country, postal_code) VALUES " +
            "(?, ?, ?, ?)";
    private static final String INNER_JOIN_QUERY = "SELECT student.id, student.name, student.surname, student.gender," +
            "student_group.number, student_group.course, address.city " +
            "FROM student " +
            "INNER JOIN student_group ON student.group_id = student_group.id " +
            "INNER JOIN address ON student.address_id = address.id";

    public void displayGeneralInformationAboutStudents(final Connection connection) {
        try (PreparedStatement statement = connection.prepareStatement(INNER_JOIN_QUERY)) {
            ResultSet resultSet = statement.executeQuery();
            System.out.printf("%-5s%-15s%-15s%-10s%-20s%-10s%-15s%n",
                    "Id",
                    "Name",
                    "Surname",
                    "Gender",
                    "Group number",
                    "Course",
                    "City");
            System.out.println(
                    "-------------------------------------------------------------------------------------------"
            );
            while (resultSet.next()) {
                System.out.printf("%-5d%-15s%-15s%-10s%-20d%-10d%-15s%n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("gender"),
                        resultSet.getInt("number"),
                        resultSet.getInt("course"),
                        resultSet.getString("city"));
            }
            System.out.println(
                    "-------------------------------------------------------------------------------------------"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Student> getListStudents(final Connection connection, final ResultSetConverter resultSetConverter) {
        List<Student> students = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_FROM_STUDENT_QUERY);
            while (resultSet.next()) {
                students.add(resultSetConverter.convertStudent(resultSet));
            }
            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Group> getListGroups(final Connection connection, final ResultSetConverter resultSetConverter) {
        List<Group> groups = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_FROM_GROUP_QUERY);
            while (resultSet.next()) {
                groups.add(resultSetConverter.convertGroup(resultSet));
            }
            return groups;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Address> getListAddresses(final Connection connection, final ResultSetConverter resultSetConverter) {
        List<Address> addresses = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_FROM_ADDRESS_QUERY);
            while (resultSet.next()) {
                addresses.add(resultSetConverter.convertAddress(resultSet));
            }
            return addresses;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean removeStudentById(final Connection connection, final int studentId) {
        try (PreparedStatement statement = connection.prepareStatement(DELETE_FROM_STUDENT_QUERY)) {
            statement.setInt(1, studentId);
            return statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean removeGroupById(final Connection connection, final int groupId) {
        try (PreparedStatement statement = connection.prepareStatement(DELETE_FROM_GROUP_QUERY)) {
            statement.setInt(1, groupId);
            return statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean removeAddressById(final Connection connection, final int addressId) {
        try (PreparedStatement statement = connection.prepareStatement(DELETE_FROM_ADDRESS_QUERY)) {
            statement.setInt(1, addressId);
            return statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean insertStudent(final Connection connection,
                                 final String name,
                                 final String surname,
                                 final String gender,
                                 final LocalDate birthday,
                                 final double stipend,
                                 final int addressId,
                                 final int groupId) {
        try (PreparedStatement statement = connection.prepareStatement(INSERT_INTO_STUDENT_QUERY)) {
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, gender);
            statement.setObject(4, birthday);
            statement.setDouble(5, stipend);
            statement.setInt(6, addressId);
            statement.setInt(7, groupId);

            return statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean insertGroup(final Connection connection,
                               final int number,
                               final String formOfEducation,
                               final int course) {
        try (PreparedStatement statement = connection.prepareStatement(INSERT_INTO_STUDENT_QUERY)) {
            statement.setInt(1, number);
            statement.setString(2, formOfEducation);
            statement.setInt(3, course);
            return statement.execute(INSERT_INTO_GROUP_QUERY);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean insertAddress(final Connection connection,
                                 final String addressLine,
                                 final String city,
                                 final String country,
                                 final int postalCode) {
        try (PreparedStatement statement = connection.prepareStatement(INSERT_INTO_ADDRESS_QUERY)) {
            statement.setString(1, addressLine);
            statement.setString(2, city);
            statement.setString(3, country);
            statement.setInt(4, postalCode);
            return statement.execute(INSERT_INTO_GROUP_QUERY);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

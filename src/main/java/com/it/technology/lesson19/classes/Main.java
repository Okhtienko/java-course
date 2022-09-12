package com.it.technology.lesson19.classes;

import com.it.technology.lesson19.services.ResultSetConverter;
import com.it.technology.lesson19.services.SqlQuery;
import com.it.technology.lesson19.services.StudentService;
import com.it.technology.lesson19.utils.JdbcConnection;
import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = JdbcConnection.getConnectionDataBase();
        ResultSetConverter resultSetConverter = new ResultSetConverter();
        SqlQuery sqlQuery = new SqlQuery();
        StudentService studentService = new StudentService();

        studentService.displayInformationAboutStudents(sqlQuery.getListStudents(connection, resultSetConverter));

        System.out.print("Enter the id of the student to be removed from the database: ");
        int studentId = scanner.nextInt();
        sqlQuery.removeStudentById(connection, studentId);

        System.out.println(
                "\n------------------------------------Data after removal-------------------------------------\n"
        );
        studentService.displayInformationAboutStudents(sqlQuery.getListStudents(connection, resultSetConverter));

        System.out.println(
                "\n-----------------------------------Data after insertion------------------------------------\n"
        );
        sqlQuery.insertStudent(
                connection,
                "Oliver",
                "Boyle",
                "Male",
                LocalDate.of(1994, 7, 21),
                7910.00,
                1,
                3
        );

        studentService.displayInformationAboutStudents(sqlQuery.getListStudents(connection, resultSetConverter));

        System.out.println(
                "\n--------------------------------Display general information--------------------------------\n"
        );

        sqlQuery.displayGeneralInformationAboutStudents(connection);
    }
}

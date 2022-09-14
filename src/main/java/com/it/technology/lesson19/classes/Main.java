package com.it.technology.lesson19.classes;

import com.it.technology.lesson19.services.ResultSetConverter;
import com.it.technology.lesson19.services.SqlQuery;
import com.it.technology.lesson19.services.StudentService;
import com.it.technology.lesson19.utils.ConnectionDataBaseJdbc;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = ConnectionDataBaseJdbc.getConnectionDataBase();
        ResultSetConverter resultSetConverter = new ResultSetConverter();
        SqlQuery sqlQuery = new SqlQuery();
        StudentService studentService = new StudentService();

        studentService.displayInformationAboutStudent(sqlQuery.getListStudents(connection, resultSetConverter));

        System.out.print("Enter id to delete data: ");
        int studentId = scanner.nextInt();
        sqlQuery.removeDataStudentById(connection, studentId);

        System.out.println("\n____________________Data after removal___________________\n");
        studentService.displayInformationAboutStudent(sqlQuery.getListStudents(connection, resultSetConverter));

        sqlQuery.insertDataIntoTableStudent(
                connection,
                "Joyce",
                "Campbell",
                "Female",
                LocalDate.of(1997, 12, 6),
                3642.00,
                2,
                7
        );

        System.out.println("\n___________________Data after insertion__________________\n");
        studentService.displayInformationAboutStudent(sqlQuery.getListStudents(connection, resultSetConverter));

        System.out.println(
                "\n_________________________Additional information about students________________________\n"
        );
        sqlQuery.displayAdditionalInformationAboutStudents(connection);
    }
}

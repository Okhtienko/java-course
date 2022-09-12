package com.it.technology.lesson19.utils;

import java.sql.*;

public final class JdbcConnection {
    private static final String USER = "root";
    private static final String PASSWORD = "Scorpions12345";
    private static final String URL = "jdbc:mysql://localhost:3306/student";

    private JdbcConnection() {

    }

    public static Connection getConnectionDataBase() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
}

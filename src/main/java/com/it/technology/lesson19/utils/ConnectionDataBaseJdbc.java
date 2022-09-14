package com.it.technology.lesson19.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionDataBaseJdbc {
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String ROOT = "root";
    private static final String PASSWORD = "Scorpions12345";

    private ConnectionDataBaseJdbc() {

    }

    public static Connection getConnectionDataBase() {
        try {
            return DriverManager.getConnection(URL, ROOT, PASSWORD);
        } catch (SQLException e) {
           throw  new RuntimeException(e);
        }
    }
}

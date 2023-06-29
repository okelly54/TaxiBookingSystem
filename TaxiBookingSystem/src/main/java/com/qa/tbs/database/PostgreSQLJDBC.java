package com.qa.tbs.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLJDBC {
    // JDBC driver name / url
    static final String JDBCDriver = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5454/tbsdb";

    // DB login details
    static final String USERNAME = "root";
    static final String PASSWORD = "pass";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // connecting
            Class.forName("org.postgresql.Driver");
            System.out.println("Connecting to database");
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // creating statement
            stmt = conn.createStatement();

            // methods

            // clean up
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Connected to database");
    }
}

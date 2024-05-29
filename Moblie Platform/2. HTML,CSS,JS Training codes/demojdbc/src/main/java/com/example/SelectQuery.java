package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQuery {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Establish the connection
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1", "root", "root");

            // Step 2: Create a PreparedStatement object
           PreparedStatement stmt1 =conn.prepareStatement("insert into users values(?,?,?)");

            // Step 3: Set the parameters
            stmt1.setInt(1,1);
            stmt1.setString(2, "Rana"); // Set the first parameter (name)
            stmt1.setString(3, "Rana123"); // Set the second parameter (password)

            // Step 4: Execute the query
            resultSet = stmt1.executeQuery();

            // Step 5: Process the results
            while (resultSet.next()) {
                System.out.println("User ID: " + resultSet.getInt("id"));
                System.out.println("User Name: " + resultSet.getString("name"));
                System.out.println("User Password: " + resultSet.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Step 6: Close the resources
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    System.out.println("Error closing result set: " + e.getMessage());
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.out.println("Error closing statement: " + e.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}

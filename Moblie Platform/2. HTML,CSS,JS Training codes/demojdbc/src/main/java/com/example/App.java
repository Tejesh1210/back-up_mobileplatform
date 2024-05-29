package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public final class App {
    public static void main(String[] args) {
        String sql = "select * from Persons";
 
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/test", "root", "root");
            PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
 
            ResultSet resultSet = preparedStatement.executeQuery();
 
            while (resultSet.next()) {
                int PersonId = resultSet.getInt("PersonId");
                String LastName = resultSet.getString("LastName");
                String FirstName = resultSet.getString("FirstName");
                String Address = resultSet.getString("Address");
                String City = resultSet.getString("City");
                
 
                System.out.println(PersonId+", "+LastName + ", " +FirstName+ ", " + Address+", "+City);
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 

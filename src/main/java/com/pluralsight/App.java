package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        String sql = "SELECT *,\n" +
                "FROM actor;";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
             int actorId = resultSet.getInt("actor_id");
             String firstName = resultSet.getString("first_name");
             String lastName = resultSet.getString("last_name");
             Instant lastUpdate = resultSet.getTimestamp("last_update");.toInstant
             s
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Failed to retrieve request. Please contact your admin and try again.");
            e.printStackTrace();
        }

    }

}

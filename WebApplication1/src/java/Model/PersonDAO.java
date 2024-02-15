/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

/**
 *
 * @author luisr_6g40j75
 */

import Config.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    public static List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<>();

        try (Connection connection = Connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String lastName = resultSet.getString("lastname");

                Person person = new Person(id, name, lastName);
                persons.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persons;
    }
    
    public static void addPerson(String name, String lastname) {
        try (Connection connection = Connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name, lastname) VALUES (?, ?)")) {
          
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastname);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void editPerson(int id, String name, String lastname) {
    try (Connection connection = Connect.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET name=?, lastname=? WHERE id=?")) {

        preparedStatement.setString(1, name);
        preparedStatement.setString(2, lastname);
        preparedStatement.setInt(3, id);

        preparedStatement.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
    
    public static void deletePerson(int id) {
        try (Connection connection = Connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
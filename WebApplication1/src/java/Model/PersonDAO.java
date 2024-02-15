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
}
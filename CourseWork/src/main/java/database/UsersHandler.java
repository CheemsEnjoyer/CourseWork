/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class UsersHandler {
    public void registerUser(String name, String password, String email) {
        URLHandler urlHandling = new URLHandler();
        String databaseURL = urlHandling.getDatabaseURL();
        try {
            Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO user (name, password, email) VALUES (?, ?, ?)");
            statement.setString(1, name);
            statement.setString(2, password);
            statement.setString(3, email);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Пользователь успешно зарегистрировался!");
            }
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ошибка: " + ex.getMessage());
        }
    }
}

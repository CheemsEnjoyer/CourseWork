package Entity;
import URL.URL;
import java.sql.*;
import javax.swing.*;

public class Users {
    private static String userName = null;
    
    public void registerUser(String name, String password, String email) {
        URL url = new URL();
        String databaseURL = url.Url;
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
    
    public String authenticateUser(String email, String password) {
        URL url = new URL();
        String databaseURL = url.Url;
        try {
            Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");
            PreparedStatement statement = connection.prepareStatement("SELECT name FROM user WHERE email = ? AND password = ?");
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                userName = resultSet.getString("name");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return userName;
    }
    

    public static String getUsername() {
        return userName;
    }

    public static void setUsername(String name) {
        userName = name;
    }
    
    public void logout() {
        this.userName = null;
    }
    
    public int getUserIdByUsername(String username) {
    int userId = -1;
    URL url = new URL();
    String databaseURL = url.Url;
    try {
        Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");
        String sqlQuery = "SELECT id FROM user WHERE name = ?";
        PreparedStatement statement = connection.prepareStatement(sqlQuery);
        statement.setString(1, username);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            userId = resultSet.getInt("id");
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return userId;
    }
}

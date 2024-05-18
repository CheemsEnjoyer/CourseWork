package data.repository;
import domain.port.UserRepository;
import java.sql.*;
import domain.entity.Users;
import com.mycompany.coursework.URL;
import javax.swing.JOptionPane;
public class UsersRepositoryImp implements UserRepository {
    @Override
    public Users fetchUserByEmailAndPassword(String email, String password) {
        Users user = null;

        URL url = new URL();
        String databaseURL = url.Url;

        try (Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-")) {
            String query = "SELECT id, name, email FROM user WHERE email = ? AND password = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, email);
                statement.setString(2, password);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        String userEmail = resultSet.getString("email");
                        user = new Users(id, name, "", userEmail);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return user;
    }
    @Override
    public Users fetchUserByUsername(String username) {
        Users user = null;

        URL url = new URL();
        String databaseURL = url.Url;

        try (Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-")) {
            String sqlQuery = "SELECT id, name FROM user WHERE name = ?";
            try (PreparedStatement statement = connection.prepareStatement(sqlQuery)) {
                statement.setString(1, username);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int userId = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        user = new Users(userId, name, "", "");
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return user;
    }

     @Override
     public int insertUserToDatabase(Users user) {
        URL url = new URL();
        String databaseURL = url.Url;
        int userId = -1;

        try {
            Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");
            PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO user (name, password, email) VALUES (?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS
            );
            statement.setString(1, user.getName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    userId = generatedKeys.getInt(1);
                }
            }

            statement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ошибка: " + ex.getMessage());
        }

        return userId;
    }
}

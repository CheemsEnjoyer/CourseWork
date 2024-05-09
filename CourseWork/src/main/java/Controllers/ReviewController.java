/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import URL.URL;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ReviewController {
    
        public void leaveReview(String reviewText, int rating, int userId, int companyId) {

        URL url = new URL();
        String databaseURL = url.Url;
        
        try {
            Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");
            String sqlQuery = "INSERT INTO review (text, rating, user_id, company_id) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            statement.setString(1, reviewText);
            statement.setInt(2, rating);
            statement.setInt(3, userId);
            statement.setInt(4, companyId);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Отзыв успешно оставлен!");
            } else {
                JOptionPane.showMessageDialog(null, "Отзыв не удалось добавить");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

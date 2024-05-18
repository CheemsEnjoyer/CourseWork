package data.repository;
import com.mycompany.coursework.URL;
import domain.port.ReviewRepository;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import domain.entity.Review;
public class ReviewRepositoryImp implements ReviewRepository {
    @Override
    public List<Review> fetchReviewsByCompanyName(String companyName) {
        List<Review> reviews = new ArrayList<>();

        URL url = new URL();
        String databaseURL = url.Url;

        try (Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-")) {
            String query = "SELECT r.id, u.name AS user_name, r.text, r.rating, r.user_id, r.company_id " +
                           "FROM review r " +
                           "JOIN user u ON r.user_id = u.id " +
                           "JOIN company c ON r.company_id = c.id " +
                           "WHERE c.name = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, companyName);

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String userName = resultSet.getString("user_name");
                        String text = resultSet.getString("text");
                        int rating = resultSet.getInt("rating");
                        int userId = resultSet.getInt("user_id");
                        int companyId = resultSet.getInt("company_id");

                        Review review = new Review(id, text, rating, userId, companyId);
                        reviews.add(review);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return reviews;
    }

            
    @Override
    public boolean insertReviewToDatabase(String reviewText, int rating, int userId, int companyId) {
        URL url = new URL();
        String databaseURL = url.Url;

        try (Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-")) {
            String query = "INSERT INTO review (text, rating, user_id, company_id) VALUES (?, ?, ?, ?)";
            
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, reviewText);
                statement.setInt(2, rating);
                statement.setInt(3, userId);
                statement.setInt(4, companyId);
                
                int rowsInserted = statement.executeUpdate();
                return rowsInserted > 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
}

package domain.port;
import domain.entity.Review;
import java.util.List;
public interface ReviewRepository {
    List<Review> fetchReviewsByCompanyName(String inputData);
    boolean insertReviewToDatabase(String reviewText, int rating, int userId, int companyId);
}

package domain.usecase.review;
import domain.port.ReviewRepository;
import domain.entity.Review;
public class LeaveReviewUseCase {

    private final ReviewRepository reviewRepository;

    public LeaveReviewUseCase(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review leaveReview(String reviewText, int rating, int userId, int companyId) {
        boolean isInserted = reviewRepository.insertReviewToDatabase(reviewText, rating, userId, companyId);
        
        if (isInserted) {
            return new Review(0, reviewText, rating, userId, companyId);
        }
        
        return null;
    }
}

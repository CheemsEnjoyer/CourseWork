package domain.usecase.review;
import data.repository.ReviewRepositoryImp;
import domain.entity.Review;
public class LeaveReviewUseCase {

    private ReviewRepositoryImp reviewRepository;

    public LeaveReviewUseCase() {
        this.reviewRepository = new ReviewRepositoryImp();
    }

    public Review leaveReview(String reviewText, int rating, int userId, int companyId) {
        boolean isInserted = reviewRepository.insertReviewToDatabase(reviewText, rating, userId, companyId);
        
        if (isInserted) {
            return new Review(0, reviewText, rating, userId, companyId);
        }
        
        return null;
    }
}

package domain.usecase.review;
import domain.entity.Review;
import domain.port.ReviewRepository;
import java.util.List;
public class LoadReviewsUseCase {
    private final ReviewRepository reviewRepository;

    public LoadReviewsUseCase(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> loadReviews(String companyName) {
        return reviewRepository.fetchReviewsByCompanyName(companyName);
    }
}

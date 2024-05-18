package domain.usecase.review;
import data.repository.ReviewRepositoryImp;
import domain.entity.Review;
import java.util.List;
public class LoadReviewsUseCase {
    private ReviewRepositoryImp reviewRepositoryImp;

    public LoadReviewsUseCase() {
        this.reviewRepositoryImp = new ReviewRepositoryImp();
    }

    public List<Review> loadReviews(String companyName) {
        return reviewRepositoryImp.fetchReviewsByCompanyName(companyName);
    }
}

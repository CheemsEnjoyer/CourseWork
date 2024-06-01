package view.config;
import domain.usecase.company.GetCompanyByNameUseCase;
import domain.usecase.company.ShowCompaniesUseCase;
import domain.usecase.company.ShowInformationUseCase;
import domain.usecase.review.LeaveReviewUseCase;
import domain.usecase.review.LoadReviewsUseCase;
import domain.usecase.user.AuthenticateUserUseCase;
import domain.usecase.user.GetUserByUsernameUseCase;
import domain.usecase.user.RegisterUserUseCase;
import domain.port.CompanyRepository;
import domain.port.ReviewRepository;
import domain.port.UserRepository;
import data.repository.CompanyRepositoryImp;
import data.repository.ReviewRepositoryImp;
import data.repository.UsersRepositoryImp;

public class DefaultConfig {
    private final CompanyRepository companyRepository = new CompanyRepositoryImp();
    private final ReviewRepository reviewRepository = new ReviewRepositoryImp();
    private final UserRepository userRepository = new UsersRepositoryImp();
    
    public GetCompanyByNameUseCase getCompanyByNameUseCase() {
        return new GetCompanyByNameUseCase(companyRepository);
    }
    
    public ShowCompaniesUseCase showCompaniesUseCase() {
        return new ShowCompaniesUseCase(companyRepository);
    }
    
    public ShowInformationUseCase showInformationUseCase() {
        return new ShowInformationUseCase(companyRepository);
    }
    
    public LeaveReviewUseCase leaveReviewUseCase() {
        return new LeaveReviewUseCase(reviewRepository);
    }

    public LoadReviewsUseCase loadReviewsUseCase() {
        return new LoadReviewsUseCase(reviewRepository);
    }    

    public AuthenticateUserUseCase authenticateUserUseCase() {
        return new AuthenticateUserUseCase(userRepository);
    }

    public GetUserByUsernameUseCase getUserByUsernameUseCase() {
        return new GetUserByUsernameUseCase(userRepository);
    }
    
    public RegisterUserUseCase registerUserUseCase() {
        return new RegisterUserUseCase(userRepository);
    }
}

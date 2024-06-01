package domain.usecase.company;
import domain.entity.Company;
import domain.port.CompanyRepository;
public class ShowInformationUseCase {
        
    private final GetCompanyByNameUseCase getCompanyByNameUseCase;
    public ShowInformationUseCase(CompanyRepository companyRepository) {
        this.getCompanyByNameUseCase = new GetCompanyByNameUseCase(companyRepository);
    }

    public Company showCompany(String companyName) {
        return getCompanyByNameUseCase.getCompanyByName(companyName);
    }
}

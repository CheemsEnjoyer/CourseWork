package domain.usecase.company;
import domain.port.CompanyRepository;
import domain.entity.Company;
public class GetCompanyByNameUseCase {

    private final CompanyRepository companyRepository;

    public GetCompanyByNameUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company getCompanyByName(String companyName) {
        return companyRepository.fetchCompanyByName(companyName);
    }
    
}

package domain.usecase.company;
import domain.port.CompanyRepository;
import domain.entity.Company;
import java.util.List;
public class ShowCompaniesUseCase {
    
    private final CompanyRepository companyRepository;

    public ShowCompaniesUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> showCompanies(String specializationName) {
        return companyRepository.loadData(specializationName);
    }    
}

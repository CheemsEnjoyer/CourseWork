package domain.usecase.company;
import data.repository.CompanyRepositoryImp;
import domain.entity.Company;
public class GetCompanyByNameUseCase {

    private CompanyRepositoryImp companyRepositoryImp;

    public GetCompanyByNameUseCase() {
        this.companyRepositoryImp = new CompanyRepositoryImp();
    }

    public Company getCompanyByName(String companyName) {
        return companyRepositoryImp.fetchCompanyByName(companyName);
    }
    
}

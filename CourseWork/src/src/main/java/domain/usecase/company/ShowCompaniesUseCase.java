package domain.usecase.company;
import data.repository.CompanyRepositoryImp;
import domain.entity.Company;
import java.util.List;
public class ShowCompaniesUseCase {
    
    private CompanyRepositoryImp companyRepositoryImp;

    public ShowCompaniesUseCase() {
        this.companyRepositoryImp = new CompanyRepositoryImp();
    }

    public List<Company> showCompanies(String specializationName) {
        return companyRepositoryImp.loadData(specializationName);
    }    
}

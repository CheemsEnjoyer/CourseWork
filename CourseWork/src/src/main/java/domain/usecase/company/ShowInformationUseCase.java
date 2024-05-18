package domain.usecase.company;
import domain.entity.Company;
public class ShowInformationUseCase {
        
    private GetCompanyByNameUseCase getCompanyByNameUseCase;

    public ShowInformationUseCase() {
        this.getCompanyByNameUseCase = new GetCompanyByNameUseCase();
    }

    public Company showCompany(String companyName) {
        return getCompanyByNameUseCase.getCompanyByName(companyName);
    }
}

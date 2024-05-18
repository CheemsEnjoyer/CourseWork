package domain.port;
import java.util.List;
import domain.entity.Company;
public interface CompanyRepository {
    List<Company> loadData(String inputData);
    Company fetchCompanyByName(String companyName);
}
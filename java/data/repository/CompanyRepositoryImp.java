package data.repository;
import com.mycompany.coursework.URL;
import domain.port.CompanyRepository;
import domain.entity.Company;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class CompanyRepositoryImp implements CompanyRepository {
        @Override
        public List<Company> loadData(String specializationName) {
        List<Company> companies = new ArrayList<>();

        URL url = new URL();
        String databaseURL = url.Url;

        try (Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-")) {
            String query = "SELECT c.id, c.name AS company_name, c.link, " +
                           "c.isPaid, c.hasIntership, c.hasDistant, " +
                           "AVG(r.rating) AS avg_rating " +
                       "FROM company c " +
                       "JOIN company_has_specialization chi ON c.id = chi.company_id " +
                       "JOIN specialization s ON chi.specialization_id = s.id " +
                       "LEFT JOIN review r ON c.id = r.company_id " +
                       "WHERE s.name = ? " +
                       "GROUP BY c.id";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, specializationName);

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int companyId = resultSet.getInt("id");
                        String companyName = resultSet.getString("company_name");
                        String link = resultSet.getString("link");
                        boolean isPaid = resultSet.getBoolean("isPaid");
                        boolean hasIntership = resultSet.getBoolean("hasIntership");
                        boolean hasDistant = resultSet.getBoolean("hasDistant");
                        float rating = resultSet.getFloat("avg_rating");

                        Company company = new Company(companyId, companyName, link, isPaid, hasIntership, hasDistant, rating);
                        companies.add(company);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return companies;
    }
    @Override
    public Company fetchCompanyByName(String companyName) {
        URL url = new URL();
        String databaseURL = url.Url;
        Company company = null;

        try (Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-")) {
            String query = "SELECT * FROM company WHERE name = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, companyName);
                try (ResultSet rs = statement.executeQuery()) {
                    if (rs.next()) {
                        company = new Company(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("link"),
                            rs.getBoolean("isPaid"),
                            rs.getBoolean("hasIntership"),
                            rs.getBoolean("hasDistant"),
                            rs.getFloat("rating")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return company;
    }
    
}

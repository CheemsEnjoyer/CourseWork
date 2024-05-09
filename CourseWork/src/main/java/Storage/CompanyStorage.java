package Storage;
import URL.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CompanyStorage implements Storage {
    @Override
    public void loadData(JTable table, String inputData) {
    URL url = new URL();
    String databaseURL = url.Url;
    try {
        Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");
        
        String query = "SELECT c.name AS company_name, " +
                            "GROUP_CONCAT(c.name) AS company_names, " +
                            "AVG(r.rating) AS avg_rating " +
                       "FROM company c " +
                       "JOIN company_has_specialization chi ON c.id = chi.company_id " +
                       "JOIN specialization s ON chi.specialization_id = s.id " +
                       "LEFT JOIN review r ON c.id = r.company_id " +
                       "WHERE s.name = ? " +
                       "GROUP BY c.name";
        
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, inputData);
        ResultSet resultSet = statement.executeQuery();

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        while (resultSet.next()) {
            String companyName = resultSet.getString("company_name");
            double avgRating = resultSet.getDouble("avg_rating");
            Object[] rowData = {companyName, avgRating};
            model.addRow(rowData);
        }

        connection.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
}

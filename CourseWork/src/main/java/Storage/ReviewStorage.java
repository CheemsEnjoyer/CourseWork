package Storage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import URL.URL;
public class ReviewStorage implements Storage{
        public void loadData(JTable table, String inputData) {
        URL url = new URL();
        String databaseURL = url.Url;
        try {
            Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");

            String query = "SELECT u.name AS user_name, r.text, r.rating " +
                           "FROM review r " +
                           "JOIN user u ON r.user_id = u.id " +
                           "JOIN company c ON r.company_id = c.id " +
                           "WHERE c.name = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, inputData);
            ResultSet resultSet = statement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                String userName = resultSet.getString("user_name");
                String text = resultSet.getString("text");
                int rating = resultSet.getInt("rating");
                Object[] rowData = {userName, text, rating};
                model.addRow(rowData);
            }

            connection.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

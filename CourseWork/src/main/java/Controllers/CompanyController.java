/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import view.ListOfCompaniesWindow;
/**
 *
 * @author Admin
 */
public class CompanyController {
    private DefaultTableModel model;
    private JTable table;
    private Map<Integer, Integer> columnMap;
    private ListOfCompaniesWindow specsWindow;

    public CompanyController() {

    }
    public void loadData(JTable table, String buttonText) {
        UrlController urlHandling = new UrlController();
        String databaseURL = urlHandling.getDatabaseURL();
        try {
            Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");
            String companiesQuery = "SELECT GROUP_CONCAT(c.name) AS company_names " +
                                    "FROM company_has_specialization chi " +
                                    "JOIN company c ON chi.company_id = c.id " +
                                    "JOIN specialization s ON chi.specialization_id = s.id " +
                                    "WHERE s.name = ?";
            PreparedStatement companiesStatement = connection.prepareStatement(companiesQuery);
            companiesStatement.setString(1, buttonText);
            ResultSet resultSet = companiesStatement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            if (resultSet.next()) {
                String companies = resultSet.getString("company_names");
                //System.out.println("Companies for institute " + buttonText + ": " + companies);
                String[] companyArray = companies.split(",");
                for (String companyName : companyArray) {
                    if (!companyName.isEmpty()) {
                        Object[] rowData = {companyName};
                        model.addRow(rowData);
                    }
                }
            }

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }








}


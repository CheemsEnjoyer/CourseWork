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
import view.CompanyWindow;
import URL.URL;

public class CompanyController {
    private DefaultTableModel model;
    private JTable table;
    private Map<Integer, Integer> columnMap;
    private ListOfCompaniesWindow specsWindow;

    public CompanyController() {

    }

    public void openCompanyView(String cellText) {
        URL url = new URL();
        String databaseURL = url.Url;
        try (Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-")) {
            String query = "SELECT * FROM company WHERE name = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, cellText);
                try (ResultSet rs = statement.executeQuery()) {
                    if (rs.next()) {
                        String companyName = rs.getString("name");
                        String link = rs.getString("link");
                        int isPaid = rs.getInt("isPaid");
                        int hasIntership = rs.getInt("hasIntership");
                        int hasDistant = rs.getInt("hasDistant");
                        CompanyWindow companyView = new CompanyWindow(companyName, link, isPaid, hasIntership, hasDistant);
                        companyView.setVisible(true);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public int getCompanyIdByName(String companyName) {
        int companyId = -1;
        URL url = new URL();
        String databaseURL = url.Url;
        try {
            Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");
            String sqlQuery = "SELECT id FROM company WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            statement.setString(1, companyName);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                companyId = resultSet.getInt("id");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return companyId;
    }





}


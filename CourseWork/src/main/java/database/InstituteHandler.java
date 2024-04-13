/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Admin
 */
public class InstituteHandler {
    private DefaultTableModel model;
    private JTable table;
    private Map<Integer, Integer> columnMap;
    
    public void fillTable(JTable table) {
    URLHandler urlHandling = new URLHandler();
    String databaseURL = urlHandling.getDatabaseURL();
    try {
        Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");
String sqlQuery = "SELECT " +
    "(SELECT name FROM company WHERE id = (SELECT company_id FROM company_has_institute WHERE institute_id = 1 LIMIT 1)) AS \"ИИТиАД\"," +
    "(SELECT name FROM company WHERE id = (SELECT company_id FROM company_has_institute WHERE institute_id = 2 LIMIT 1)) AS \"ИАСиД\"," +
    "(SELECT name FROM company WHERE id = (SELECT company_id FROM company_has_institute WHERE institute_id = 3 LIMIT 1)) AS \"ИН\"," +
    "(SELECT name FROM company WHERE id = (SELECT company_id FROM company_has_institute WHERE institute_id = 4 LIMIT 1)) AS \"ИЭ\"," +
    "(SELECT name FROM company WHERE id = (SELECT company_id FROM company_has_institute WHERE institute_id = 5 LIMIT 1)) AS \"ИВТ\"," +
    "(SELECT name FROM company WHERE id = (SELECT company_id FROM company_has_institute WHERE institute_id = 6 LIMIT 1)) AS \"ИАМиТ\"," +
    "(SELECT name FROM company WHERE id = (SELECT company_id FROM company_has_institute WHERE institute_id = 7 LIMIT 1)) AS \"ИЭУиП\"";




        PreparedStatement statement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = statement.executeQuery();

        // Получение модели таблицы
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Очистка таблицы перед добавлением новых данных
        model.setRowCount(0);

        // Добавление данных из результатов запроса в модель таблицы
        while (resultSet.next()) {
            // Получение данных из каждого столбца и добавление их в модель таблицы
            model.addRow(new Object[]{
                resultSet.getString("ИИТиАД"),
                resultSet.getString("ИАСиД"),
                resultSet.getString("ИН"),
                resultSet.getString("ИЭ"),
                resultSet.getString("ИВТ"),
                resultSet.getString("ИАМиТ"),
                resultSet.getString("ИЭУиП")
            });
        }

        connection.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        }
    }
}


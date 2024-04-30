/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import Controllers.CompanyController;
import Controllers.UrlController;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.sql.*;
public class ListOfCompaniesWindow extends javax.swing.JFrame {
    CompanyController specController = new CompanyController();
    public ListOfCompaniesWindow(JTable table, String buttonText) {
        initComponents();
        specController.loadData(jTable2, buttonText);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        exitLabel.setText("<html>&larr; Назад</html>");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitLabelMousePressed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Предприятие"
            })
            {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            }
        );
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMousePressed

    }//GEN-LAST:event_exitLabelMousePressed

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        listOfSpecsWindow lstSpecs = new listOfSpecsWindow();
        lstSpecs.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("D:\\University\\OOP\\CourseWork\\CourseWork\\src\\icon.jpg");
        setIconImage(icon.getImage());
        setLocation(200,200);
    }//GEN-LAST:event_formWindowActivated

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
    int row = jTable2.rowAtPoint(evt.getPoint());
    int col = jTable2.columnAtPoint(evt .getPoint());
    UrlController urlHandling = new UrlController();
    String databaseURL = urlHandling.getDatabaseURL();
        if (row >= 0 && col >= 0) {
            Object value = jTable2.getValueAt(row, col);
            if (value != null) {
                String cellText = value.toString();
                try {
                    Connection connection = DriverManager.getConnection(databaseURL, "root", "12345678a-");
                    Statement stmt = connection.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM company WHERE name = '" + cellText + "'");
                  if (rs.next()) {
                    String companyName = rs.getString("name");
                    String link = rs.getString("link");
                    int isPaid = rs.getInt("isPaid");
                    int hasIntership = rs.getInt("hasIntership");
                    CompanyView companyView = new CompanyView(companyName, link, isPaid, hasIntership );
                    companyView.setVisible(true);
                } else {
                        System.out.println("Совпадение не найдено");
                    }
                    rs.close();
                    stmt.close();
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

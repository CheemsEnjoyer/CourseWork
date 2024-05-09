/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.*;
import Entity.Users;
public class MainWindow extends javax.swing.JFrame {
    Users users = new Users();
    public MainWindow() {
        initComponents();
        String usrName = users.getUsername(); 
        if (usrName != null && !usrName.isEmpty()) {
            lblUsername.setText(usrName);
        } else {
            lblUsername.setText("Вы не авторизованы");
        }
        if ((lblUsername.getText())== "Вы не авторизованы" ) {
            lblEnterOrExit.setText("Войти");
        }
        else {
            lblEnterOrExit.setText("Выйти");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        watchCompaniesButtin = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblEnterOrExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        watchCompaniesButtin.setBackground(new java.awt.Color(102, 204, 255));
        watchCompaniesButtin.setText("Просмотреть предприятия");
        watchCompaniesButtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchCompaniesButtinActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(102, 204, 255));
        exitButton.setText("Назад");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        lblUsername.setText("Вы не авторизованы");

        lblEnterOrExit.setText("(войти)");
        lblEnterOrExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEnterOrExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(watchCompaniesButtin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 208, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnterOrExit))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnterOrExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(watchCompaniesButtin)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("D:\\University\\OOP\\CourseWork\\CourseWork\\src\\icon.jpg");
        setIconImage(icon.getImage());
        setLocation(200,200);
    }//GEN-LAST:event_formWindowActivated
    EntryWindow entrWindow = new EntryWindow();
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        entrWindow.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void watchCompaniesButtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchCompaniesButtinActionPerformed
        ListOfSpecsWindow lstSpecs = new ListOfSpecsWindow();
        lstSpecs.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_watchCompaniesButtinActionPerformed

    private void lblEnterOrExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnterOrExitMouseClicked
        if (lblEnterOrExit.getText() == "Войти") {
            RegistryWindow registryWindow = new RegistryWindow();
            registryWindow.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Вы вышли из аккаунта");
            users.logout();
            lblUsername.setText("Вы не авторизованы");
            lblEnterOrExit.setText("Войти");
        }
    }//GEN-LAST:event_lblEnterOrExitMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEnterOrExit;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JButton watchCompaniesButtin;
    // End of variables declaration//GEN-END:variables
}

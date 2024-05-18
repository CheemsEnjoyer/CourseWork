/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.*;

public class ListOfInstitusWindow extends javax.swing.JFrame {
    private JTable table;
    public ListOfInstitusWindow() {
        initComponents();
        table = new JTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonIITIAD = new javax.swing.JButton();
        buttonIN = new javax.swing.JButton();
        buttonIASID = new javax.swing.JButton();
        buttonIE = new javax.swing.JButton();
        buttonIEUiP = new javax.swing.JButton();
        buttonIAMIT = new javax.swing.JButton();
        buttonIVT = new javax.swing.JButton();
        exitLabel = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblEnterOrExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        buttonIITIAD.setBackground(new java.awt.Color(102, 204, 255));
        buttonIITIAD.setText("ИИТиАД");
        buttonIITIAD.setName("buttonIITIAD"); // NOI18N
        buttonIITIAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIITIADActionPerformed(evt);
            }
        });

        buttonIN.setBackground(new java.awt.Color(102, 204, 255));
        buttonIN.setText("ИН");
        buttonIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonINActionPerformed(evt);
            }
        });

        buttonIASID.setBackground(new java.awt.Color(102, 204, 255));
        buttonIASID.setText("ИАСиД");
        buttonIASID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIASIDActionPerformed(evt);
            }
        });

        buttonIE.setBackground(new java.awt.Color(102, 204, 255));
        buttonIE.setText("ИЭ");
        buttonIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIEActionPerformed(evt);
            }
        });

        buttonIEUiP.setBackground(new java.awt.Color(102, 204, 255));
        buttonIEUiP.setText("ИЭУиП");
        buttonIEUiP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIEUiPActionPerformed(evt);
            }
        });

        buttonIAMIT.setBackground(new java.awt.Color(102, 204, 255));
        buttonIAMIT.setText("ИАМиТ");
        buttonIAMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIAMITActionPerformed(evt);
            }
        });

        buttonIVT.setBackground(new java.awt.Color(102, 204, 255));
        buttonIVT.setText("ИВТ");
        buttonIVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIVTActionPerformed(evt);
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
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnterOrExit)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buttonIEUiP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonIAMIT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonIVT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonIE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonIN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonIASID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonIITIAD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEnterOrExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonIITIAD)
                .addGap(12, 12, 12)
                .addComponent(buttonIASID)
                .addGap(18, 18, 18)
                .addComponent(buttonIN)
                .addGap(18, 18, 18)
                .addComponent(buttonIE)
                .addGap(18, 18, 18)
                .addComponent(buttonIVT)
                .addGap(18, 18, 18)
                .addComponent(buttonIAMIT)
                .addGap(18, 18, 18)
                .addComponent(buttonIEUiP)
                .addContainerGap())
        );

        buttonIITIAD.getAccessibleContext().setAccessibleName("buttonIITIAD");
        buttonIN.getAccessibleContext().setAccessibleName("buttonIN");
        buttonIASID.getAccessibleContext().setAccessibleName("buttonIASID");
        buttonIE.getAccessibleContext().setAccessibleName("buttonIE");
        buttonIEUiP.getAccessibleContext().setAccessibleName("buttonIUEiP");
        buttonIAMIT.getAccessibleContext().setAccessibleName("buttonIAMIT");
        buttonIVT.getAccessibleContext().setAccessibleName("buttonIVT");
        exitLabel.getAccessibleContext().setAccessibleName("<html>&larr; Назад</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMousePressed
        MainMenu mainWindow = new MainMenu();
        mainWindow.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_exitLabelMousePressed

    private void buttonIITIADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIITIADActionPerformed
    String buttonText = buttonIITIAD.getText();
    ListOfCompaniesWindow specsWindow = new ListOfCompaniesWindow(table, buttonText);
    specsWindow.setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_buttonIITIADActionPerformed

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked

    }//GEN-LAST:event_exitLabelMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("D:\\University\\OOP\\CourseWork\\CourseWork\\src\\icon.jpg");
        setIconImage(icon.getImage());
        setLocation(200,200);
    }//GEN-LAST:event_formWindowActivated

    private void buttonIASIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIASIDActionPerformed
    String buttonText = buttonIASID.getText();
    ListOfCompaniesWindow specsWindow = new ListOfCompaniesWindow(table, buttonText);
    specsWindow.setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_buttonIASIDActionPerformed

    private void buttonINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonINActionPerformed
    String buttonText = buttonIN.getText();
    ListOfCompaniesWindow specsWindow = new ListOfCompaniesWindow(table, buttonText);
    specsWindow.setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_buttonINActionPerformed

    private void buttonIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIEActionPerformed
    String buttonText = buttonIE.getText();
    ListOfCompaniesWindow specsWindow = new ListOfCompaniesWindow(table, buttonText);
    specsWindow.setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_buttonIEActionPerformed

    private void buttonIVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIVTActionPerformed
    String buttonText = buttonIVT.getText();
    ListOfCompaniesWindow specsWindow = new ListOfCompaniesWindow(table, buttonText);
    specsWindow.setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_buttonIVTActionPerformed

    private void buttonIAMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIAMITActionPerformed
    String buttonText = buttonIAMIT.getText();
    ListOfCompaniesWindow specsWindow = new ListOfCompaniesWindow(table, buttonText);
    specsWindow.setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_buttonIAMITActionPerformed

    private void buttonIEUiPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIEUiPActionPerformed
    String buttonText = buttonIEUiP.getText();
    ListOfCompaniesWindow specsWindow = new ListOfCompaniesWindow(table, buttonText);
    specsWindow.setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_buttonIEUiPActionPerformed

    private void lblEnterOrExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnterOrExitMouseClicked
        /*if (lblEnterOrExit.getText() == "Войти") {
            RegistryWindow registryWindow = new RegistryWindow();
            registryWindow.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Вы вышли из аккаунта");
            users.logout();
            lblUsername.setText("Вы не авторизованы");
            lblEnterOrExit.setText("Войти");
        }*/
    }//GEN-LAST:event_lblEnterOrExitMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIAMIT;
    private javax.swing.JButton buttonIASID;
    private javax.swing.JButton buttonIE;
    private javax.swing.JButton buttonIEUiP;
    private javax.swing.JButton buttonIITIAD;
    private javax.swing.JButton buttonIN;
    private javax.swing.JButton buttonIVT;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEnterOrExit;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}

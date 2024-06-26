/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.*;
import Entity.Users;
/**
 *
 * @author Admin
 */
public class LoginWindow extends javax.swing.JFrame {

    /**
     * Creates new form RegistryWindow
     */
    public LoginWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFieldName = new javax.swing.JTextField();
        textFieldMail = new javax.swing.JTextField();
        registryButton = new javax.swing.JButton();
        alreadyExistLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        passwordToggle = new javax.swing.JRadioButton();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        textFieldName.setText("Введите ФИО");
        textFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNameFocusLost(evt);
            }
        });

        textFieldMail.setText("Введите почту");
        textFieldMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldMailFocusLost(evt);
            }
        });

        registryButton.setBackground(new java.awt.Color(102, 204, 255));
        registryButton.setText("Зарегистрироваться");
        registryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registryButtonActionPerformed(evt);
            }
        });

        alreadyExistLabel.setForeground(new java.awt.Color(51, 102, 255));
        alreadyExistLabel.setText("У меня уже есть аккаунт");

        exitLabel.setText("<html>&larr; Назад</html>");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitLabelMousePressed(evt);
            }
        });

        passwordToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordToggleActionPerformed(evt);
            }
        });

        passwordField.setText("Введите пароль");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldName)
                            .addComponent(textFieldMail)
                            .addComponent(registryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(alreadyExistLabel)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordToggle)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordToggle)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(alreadyExistLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(registryButton)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMousePressed
        RegistryWindow loginWindow = new RegistryWindow();
        loginWindow.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_exitLabelMousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("D:\\University\\OOP\\CourseWork\\CourseWork\\src\\icon.jpg");
        setIconImage(icon.getImage());
        passwordField.setEchoChar((char) 0);
        setLocation(200,200);
    }//GEN-LAST:event_formWindowActivated

    private void textFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNameFocusGained
    if (textFieldName.getText().equals("Введите ФИО")) {
        textFieldName.setText("");
    }
    }//GEN-LAST:event_textFieldNameFocusGained

    private void textFieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNameFocusLost
    if (textFieldName.getText().isEmpty()) {
        textFieldName.setText("Введите ФИО");
    }
    }//GEN-LAST:event_textFieldNameFocusLost

    private void textFieldMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMailFocusGained
    if (textFieldMail.getText().equals("Введите почту")) {
        textFieldMail.setText("");
    }
    }//GEN-LAST:event_textFieldMailFocusGained

    private void textFieldMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMailFocusLost
    if (textFieldMail.getText().isEmpty()) {
        textFieldMail.setText("Введите почту");
    }
    }//GEN-LAST:event_textFieldMailFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
    if (passwordField.getText().equals("Введите пароль")) {
        passwordField.setText("");
    }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
    if (passwordField.getText().isEmpty()) {
        passwordField.setText("Введите пароль");
    }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void passwordToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordToggleActionPerformed
        if (passwordToggle.isSelected()) {
            passwordField.setEchoChar((char) 0);
        } else {
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_passwordToggleActionPerformed

    private void registryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registryButtonActionPerformed
        String name = textFieldName.getText();
        String password = new String(passwordField.getPassword());
        String email = textFieldMail.getText();
        Users usersHandling = new Users();
        usersHandling.registerUser(name, password, email);
    }//GEN-LAST:event_registryButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alreadyExistLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JRadioButton passwordToggle;
    private javax.swing.JButton registryButton;
    private javax.swing.JTextField textFieldMail;
    private javax.swing.JTextField textFieldName;
    // End of variables declaration//GEN-END:variables
}

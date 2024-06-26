package view.gui;
import javax.swing.*;
import domain.entity.Users;
import domain.usecase.user.AuthenticateUserUseCase;
import view.config.DefaultConfig;
public class RegistryWindow extends javax.swing.JFrame {
    private AuthenticateUserUseCase authenticateUserUseCase;
    public RegistryWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFieldMail = new javax.swing.JTextField();
        registryLabel = new javax.swing.JLabel();
        entryButton = new javax.swing.JButton();
        exitLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        radionButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        textFieldMail.setText("Введите почту");
        textFieldMail.setToolTipText("");
        textFieldMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldMailFocusLost(evt);
            }
        });

        registryLabel.setForeground(new java.awt.Color(51, 102, 255));
        registryLabel.setText("У вас нет аккаунта? Зарегистрируйтесь");
        registryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registryLabelMousePressed(evt);
            }
        });

        entryButton.setBackground(new java.awt.Color(102, 204, 255));
        entryButton.setText("Войти");
        entryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryButtonActionPerformed(evt);
            }
        });

        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        exitLabel.setText("<html>&larr; Назад</html>");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitLabelMousePressed(evt);
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

        radionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(entryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldMail)
                            .addComponent(registryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radionButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radionButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entryButton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void exitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMousePressed
        setVisible(false);
    }//GEN-LAST:event_exitLabelMousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("D:\\University\\OOP\\CourseWork\\CourseWork\\src\\icon.jpg");
        setIconImage(icon.getImage());
        passwordField.setEchoChar((char) 0);
        setLocation(200,200);
    }//GEN-LAST:event_formWindowActivated

    private void registryLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registryLabelMousePressed
        LoginWindow registryWindow = new LoginWindow();
        registryWindow.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_registryLabelMousePressed

    private void radionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radionButtonActionPerformed
        if (radionButton.isSelected()) {
            passwordField.setEchoChar((char) 0);
        } else {
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_radionButtonActionPerformed

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

    private void entryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryButtonActionPerformed
    String email = textFieldMail.getText();
    String password = new String(passwordField.getPassword());
    DefaultConfig config = new DefaultConfig();
    authenticateUserUseCase = config.authenticateUserUseCase();
    Users authenticatedUser = authenticateUserUseCase.authenticateUser(email, password);

    if (authenticatedUser != null) {
        JOptionPane.showMessageDialog(this, "Добро пожаловать, " + authenticatedUser.getName() + "!");
        int id = authenticatedUser.getId();
        String name = authenticatedUser.getName();
        String userEmail = authenticatedUser.getEmail();
        String userPassword = authenticatedUser.getPassword();
        Users loggedInUser = new Users(id, name, userPassword, userEmail);
    } else {
        JOptionPane.showMessageDialog(this, "Вы ввели неправильную почту или пароль!");
    }
    }//GEN-LAST:event_entryButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entryButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JRadioButton radionButton;
    private javax.swing.JLabel registryLabel;
    private javax.swing.JTextField textFieldMail;
    // End of variables declaration//GEN-END:variables
}

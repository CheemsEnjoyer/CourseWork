/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class entryWindow extends javax.swing.JFrame {

    /**
     * Creates new form entryWindow
     */
    public entryWindow() {
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

        Panel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        enterAsGuestButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.yellow);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(102, 204, 255));
        loginButton.setText("Авторизоваться");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        enterAsGuestButton.setBackground(new java.awt.Color(102, 204, 255));
        enterAsGuestButton.setText("Войти как гость");
        enterAsGuestButton.setToolTipText("");
        enterAsGuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAsGuestButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(102, 204, 255));
        exitButton.setText("Выйти");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterAsGuestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addGap(18, 18, 18)
                .addComponent(enterAsGuestButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addGap(34, 34, 34))
        );

        loginButton.getAccessibleContext().setAccessibleName("registerButton");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        RegistryWindow loginWindow = new RegistryWindow();
        loginWindow.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void enterAsGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAsGuestButtonActionPerformed
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_enterAsGuestButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

    int confirmed = JOptionPane.showConfirmDialog(null,
                        "Действительно ли вы хотите выйти из приложения?", "Подтверждение",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    ImageIcon icon = new ImageIcon("D:\\University\\OOP\\CourseWork\\CourseWork\\src\\icon.jpg");
    setIconImage(icon.getImage());
    setLocation(200,200);
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton enterAsGuestButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables
}
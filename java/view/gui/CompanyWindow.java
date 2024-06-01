/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.gui;
import javax.swing.JOptionPane;
import domain.entity.Company;

public class CompanyWindow extends javax.swing.JFrame {
    public CompanyWindow(Company company) {
        initComponents();
        String name = company.getName();
        lblCompanyName.setText(name);
        String link = company.getLink();
        lblInfo.setText(link);
        boolean isPaid = company.getIsPaid();
        if (isPaid == true) {
            lblPaid.setText("<html><span style='color:green;'>&#x2713;</span></html>");
        }
        else {
            lblPaid.setText("<html><span style='color:red;'>&#x2717;</span></html>");
        }
        boolean hasIntership = company.getHasIntership();
        if (hasIntership == true) {
            lblIntership.setText("<html><span style='color:green;'>&#x2713;</span></html>");
        }
        else {
            lblIntership.setText("<html><span style='color:red;'>&#x2717;</span></html>");
        }
        boolean hasDistant = company.getHasDistant();
        if (hasDistant == true) {
            lblDistant.setText("<html><span style='color:green;'>&#x2713;</span></html>");
        }
        else {
            lblDistant.setText("<html><span style='color:red;'>&#x2717;</span></html>");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitLabel = new javax.swing.JLabel();
        lblCompanyName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblIntership = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPaid = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        leaveReviewButton = new javax.swing.JButton();
        watchReviewsButton = new javax.swing.JButton();
        lblEnterOrExit = new javax.swing.JLabel();
        hasDistant = new javax.swing.JLabel();
        lblDistant = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Компания"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
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

        lblCompanyName.setText("jLabel1");

        jLabel1.setText("Сайт компании:");

        lblInfo.setText("jLabel2");

        jLabel3.setText("Имеется возможность стажировки?");

        lblIntership.setText("jLabel2");

        jLabel4.setText("Является ли оплачиваемой?");

        lblPaid.setText("jLabel2");

        lblUsername.setText("Вы не авторизованы");

        leaveReviewButton.setBackground(new java.awt.Color(102, 204, 255));
        leaveReviewButton.setText("Оставить отзыв");
        leaveReviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveReviewButtonActionPerformed(evt);
            }
        });

        watchReviewsButton.setBackground(new java.awt.Color(102, 204, 255));
        watchReviewsButton.setText("Просмотреть отзывы");
        watchReviewsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchReviewsButtonActionPerformed(evt);
            }
        });

        lblEnterOrExit.setText("(войти)");
        lblEnterOrExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEnterOrExitMouseClicked(evt);
            }
        });

        hasDistant.setText("Возможность удаленной работы?");

        lblDistant.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEnterOrExit)
                        .addGap(273, 273, 273))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hasDistant)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIntership, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDistant, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leaveReviewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(watchReviewsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCompanyName)
                            .addComponent(lblEnterOrExit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(lblIntership)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPaid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasDistant)
                    .addComponent(lblDistant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leaveReviewButton)
                    .addComponent(watchReviewsButton))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked

    }//GEN-LAST:event_exitLabelMouseClicked

    private void exitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMousePressed
        setVisible(false);
    }//GEN-LAST:event_exitLabelMousePressed

    private void leaveReviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveReviewButtonActionPerformed
        if (lblUsername.getText() != "Вы не авторизованы") {
            LeaveReviewWindow leaveReviewWindow = new LeaveReviewWindow(lblCompanyName.getText());
            leaveReviewWindow.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Вам нужно авторизоваться, чтобы оставить отзыв!");
        }
    }//GEN-LAST:event_leaveReviewButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void watchReviewsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchReviewsButtonActionPerformed
        String companyName = lblCompanyName.getText();
        ReviewsWindow reviewsWindow = new ReviewsWindow(companyName);
        reviewsWindow.setVisible(true);
    }//GEN-LAST:event_watchReviewsButtonActionPerformed

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
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel hasDistant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblDistant;
    private javax.swing.JLabel lblEnterOrExit;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblIntership;
    private javax.swing.JLabel lblPaid;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JButton leaveReviewButton;
    private javax.swing.JButton watchReviewsButton;
    // End of variables declaration//GEN-END:variables
}

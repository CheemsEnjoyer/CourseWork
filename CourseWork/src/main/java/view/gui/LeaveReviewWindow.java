package view.gui;
import domain.entity.Users;
import domain.entity.Review;
import domain.entity.Company;
import domain.usecase.review.LeaveReviewUseCase;
import domain.usecase.company.GetCompanyByNameUseCase;
import domain.usecase.user.GetUserByUsernameUseCase;
import view.config.DefaultConfig;
import javax.swing.JOptionPane;
public class LeaveReviewWindow extends javax.swing.JFrame {
    private GetUserByUsernameUseCase getUserByUsernameUseCase;
    private GetCompanyByNameUseCase getCompanyByNameUseCase;
    private LeaveReviewUseCase leaveReviewUseCase;
    public LeaveReviewWindow(String name) {
        initComponents();
        lblCompanyName.setText(name);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        reviewTextField = new javax.swing.JTextField();
        ratingSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblCompanyName = new javax.swing.JLabel();
        lblEnterOrExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        confirmButton.setBackground(new java.awt.Color(102, 204, 255));
        confirmButton.setText("Отправить");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(102, 204, 255));
        closeButton.setText("Закрыть");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        reviewTextField.setText("Опишите ваш опыт");
        reviewTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reviewTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                reviewTextFieldFocusLost(evt);
            }
        });

        ratingSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jLabel1.setText("Оценка");

        lblUsername.setText("Вы не авторизованы");

        lblCompanyName.setText("jLabel1");

        lblEnterOrExit.setText("(войти)");
        lblEnterOrExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEnterOrExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reviewTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ratingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirmButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(closeButton)
                                .addGap(19, 19, 19))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnterOrExit)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompanyName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnterOrExit)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reviewTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(closeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
    String companyName = lblCompanyName.getText();
    String reviewText = reviewTextField.getText();
    int rating = (int) ratingSpinner.getValue();
    DefaultConfig config = new DefaultConfig();
    getUserByUsernameUseCase = config.getUserByUsernameUseCase();
    Users user = getUserByUsernameUseCase.getUserByUsername(lblUsername.getText());
    int userId = user.getId();
    getCompanyByNameUseCase = config.getCompanyByNameUseCase();
    Company company = getCompanyByNameUseCase.getCompanyByName(companyName);
    
    if (company != null) {
        int companyId = company.getId();
        leaveReviewUseCase = config.leaveReviewUseCase();
        Review newReview = leaveReviewUseCase.leaveReview(reviewText, rating, userId, companyId);
        
        if (newReview != null) {
            JOptionPane.showMessageDialog(null, "Отзыв успешно оставлен!");
        } else {
            JOptionPane.showMessageDialog(null, "Ошибка при оставлении отзыва!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Компания не найдена!");
    }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void reviewTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reviewTextFieldFocusGained
    if (reviewTextField.getText().equals("Опишите ваш опыт")) {
        reviewTextField.setText("");
    }
    }//GEN-LAST:event_reviewTextFieldFocusGained

    private void reviewTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reviewTextFieldFocusLost
    if (reviewTextField.getText().isEmpty()) {
        reviewTextField.setText("Опишите ваш опыт");
    }
    }//GEN-LAST:event_reviewTextFieldFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void lblEnterOrExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnterOrExitMouseClicked
        if (lblEnterOrExit.getText() == "Войти") {
            RegistryWindow registryWindow = new RegistryWindow();
            registryWindow.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Вы вышли из аккаунта");
            //users.logout();
            lblUsername.setText("Вы не авторизованы");
            lblEnterOrExit.setText("Войти");
        }
    }//GEN-LAST:event_lblEnterOrExitMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblEnterOrExit;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSpinner ratingSpinner;
    private javax.swing.JTextField reviewTextField;
    // End of variables declaration//GEN-END:variables
}

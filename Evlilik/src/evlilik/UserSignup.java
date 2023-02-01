package evlilik;

import javax.swing.JOptionPane;
import java.sql.*;

public class UserSignup extends javax.swing.JFrame {
    public UserSignup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        WomanAgeCombo = new javax.swing.JComboBox<>();
        manAgeCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        WomanCityText = new javax.swing.JTextField();
        WomanIdText = new javax.swing.JTextField();
        WomanSurnameText = new javax.swing.JTextField();
        WomanNameText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        manCityText = new javax.swing.JTextField();
        manIdText = new javax.swing.JTextField();
        manSurnameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        manNameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        jPanel1.setLayout(null);

        WomanAgeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        WomanAgeCombo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(198, 121, 214)));
        jPanel1.add(WomanAgeCombo);
        WomanAgeCombo.setBounds(600, 150, 250, 35);

        manAgeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        manAgeCombo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jPanel1.add(manAgeCombo);
        manAgeCombo.setBounds(170, 150, 250, 35);

        jButton1.setBackground(new java.awt.Color(189, 235, 188));
        jButton1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jButton1.setText("GÖNDER");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(233, 213, 38)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(580, 350, 190, 60);

        jLabel12.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel12.setText("Sifre:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(240, 400, 36, 24);

        emailText.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(210, 150, 79)));
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        jPanel1.add(emailText);
        emailText.setBounds(300, 340, 250, 35);

        jLabel11.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel11.setText("E_Posta:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 340, 62, 24);

        WomanCityText.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(198, 121, 214)));
        jPanel1.add(WomanCityText);
        WomanCityText.setBounds(600, 270, 250, 35);

        WomanIdText.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(198, 121, 214)));
        jPanel1.add(WomanIdText);
        WomanIdText.setBounds(600, 210, 250, 35);

        WomanSurnameText.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(198, 121, 214)));
        jPanel1.add(WomanSurnameText);
        WomanSurnameText.setBounds(600, 90, 250, 35);

        WomanNameText.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(198, 121, 214)));
        jPanel1.add(WomanNameText);
        WomanNameText.setBounds(600, 30, 250, 35);

        jLabel10.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel10.setText("Kadın Soyadı:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(480, 90, 103, 24);

        jLabel9.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel9.setText("Kadın Sehir:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(480, 270, 100, 30);

        jLabel8.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel8.setText("Kadın Yas:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(480, 150, 79, 24);

        jLabel7.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel7.setText("Kadın Kimlik:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 210, 103, 24);

        jLabel6.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel6.setText("Kadın Adı:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 30, 80, 24);

        manCityText.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jPanel1.add(manCityText);
        manCityText.setBounds(170, 270, 250, 35);

        manIdText.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jPanel1.add(manIdText);
        manIdText.setBounds(170, 210, 250, 35);

        manSurnameText.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jPanel1.add(manSurnameText);
        manSurnameText.setBounds(170, 90, 250, 35);

        jLabel5.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel5.setText("Erkek Soyadı:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 90, 102, 24);

        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(210, 150, 79)));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(300, 390, 250, 35);

        manNameText.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        manNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manNameTextActionPerformed(evt);
            }
        });
        jPanel1.add(manNameText);
        manNameText.setBounds(170, 30, 250, 35);

        jLabel4.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel4.setText("Erkek Sehir:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 280, 89, 24);

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel3.setText("Erkek Yas:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 160, 78, 24);

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel2.setText("Erkek Kimlik:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 220, 102, 24);

        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel1.setText("Erkek Adı:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 30, 90, 40);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngwing.com (12) (1).png"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(0, -5, 930, 450);

        jLabel14.setBackground(new java.awt.Color(170, 213, 218));
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 0)));
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 450, 320);

        jLabel15.setBackground(new java.awt.Color(218, 170, 208));
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(450, 0, 450, 320);

        jLabel16.setBackground(new java.awt.Color(228, 184, 125));
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 320, 900, 120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void manNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manNameTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String manName=manNameText.getText();
        String womanName=WomanNameText.getText();
        String manSurname=manSurnameText.getText();
        String womanSurname=WomanSurnameText.getText();
        int manAge=manAgeCombo.getSelectedIndex()+18;
        int womanAge=WomanAgeCombo.getSelectedIndex()+18;
        String manCity=manCityText.getText();
        String womanCity= WomanCityText.getText();
        String email=emailText.getText();
        String password=new String(jPasswordField1.getPassword());
        String man_id=manIdText.getText();
        String woman_id=WomanIdText.getText();
        try{
            User usr=new User(manName,womanName,manSurname,womanSurname,manAge,womanAge,manCity,womanCity,email,password,man_id,woman_id);
            JOptionPane.showMessageDialog(null, "KİŞİ KAYDEDİLDİ1");
            dispose();
            new UserWindow(usr.getAccount_id(),usr).setVisible(true);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "KAYIT BAŞARISIZ!");
        }
            
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(177, 231, 176));
        jButton1.setBounds(580, 350, 191, 61);
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(4,4, 4, 4, new java.awt.Color(233, 213, 38)));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(189, 235, 189));
        jButton1.setBounds(580, 350, 190, 60);
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(233, 213, 38)));
    }//GEN-LAST:event_jButton1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> WomanAgeCombo;
    private javax.swing.JTextField WomanCityText;
    private javax.swing.JTextField WomanIdText;
    private javax.swing.JTextField WomanNameText;
    private javax.swing.JTextField WomanSurnameText;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JComboBox<String> manAgeCombo;
    private javax.swing.JTextField manCityText;
    private javax.swing.JTextField manIdText;
    private javax.swing.JTextField manNameText;
    private javax.swing.JTextField manSurnameText;
    // End of variables declaration//GEN-END:variables
}

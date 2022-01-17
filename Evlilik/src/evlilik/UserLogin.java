package evlilik;

import javax.swing.JOptionPane;
import java.sql.*;

public class UserLogin extends javax.swing.JFrame {
    public UserLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new javax.swing.ImageIcon(getClass().getResource("/images/pngwing.com (12) (1).png")))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 34)); // NOI18N
        jLabel1.setText("E-Posta:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 170, 160, 40);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 34)); // NOI18N
        jLabel2.setText("Sifre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 230, 110, 40);

        jTextField1.setFont(new java.awt.Font("Gabriola", 0, 15)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(195, 158, 53)));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(370, 170, 250, 35);

        jButton1.setFont(new java.awt.Font("Agency FB", 0, 40)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngwing.com (14) (4).png"))); // NOI18N
        jButton1.setText("Giris Yap");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(182, 122, 35)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 300, 250, 60);

        jLabel3.setFont(new java.awt.Font("French Script MT", 0, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(174, 123, 49));
        jLabel3.setText("Kullanıcı Giris Sayfası");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 60, 330, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngwing.com (15) (1)(2).png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 200, 190);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngwing.com (15) (1).png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(720, 0, 200, 190);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngwing.com (13) (1).png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, -30, 630, 200);

        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(195, 158, 53)));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(370, 230, 250, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String password=new String(jPasswordField1.getPassword());
        if(jTextField1.getText().length()==0 || password.length()==0){
            JOptionPane.showMessageDialog(null, "Boş Yer Bırakma!");
        }
        else{
            boolean key=true;
            DBConnection db=new DBConnection();
            try{
                Connection con=db.ConnDB();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("SELECT *FROM users");
                while(rs.next()){
                    if(jTextField1.getText().equals(rs.getString("email")) && password.equals(rs.getString("password"))){
                        User usr=new User();
                        usr.setManName(rs.getString("man_name"));
                        usr.setWomanName(rs.getString("woman_name"));
                        usr.setManSurname(rs.getString("man_surname"));
                        usr.setWomanSurname(rs.getString("woman_surname"));
                        usr.setManAge(rs.getInt("man_age"));
                        usr.setWomanAge(rs.getInt("woman_age"));
                        usr.setManCity(rs.getString("man_city"));
                        usr.setWomanCity(rs.getString("woman_city"));
                        usr.setManId(rs.getString("man_id"));
                        usr.setWomanId(rs.getString("woman_id"));
                        usr.seteMail(rs.getString("email"));
                        usr.setAccount_id(rs.getInt("account_id"));
                        key=false;
                        new UserWindow(rs.getInt("account_id"),usr).setVisible(true);
                        this.dispose();
                        
                    }
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            if(key){
                JOptionPane.showMessageDialog(null, "YANLIŞ BİLGİ GİRDİN!");
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

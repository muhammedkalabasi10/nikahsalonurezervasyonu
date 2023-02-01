package evlilik;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;

public class UserWindow extends javax.swing.JFrame {
int account_id;
User usr;

    public UserWindow(){
        initComponents();
    }
    public UserWindow(int account_id, User usr) {
        this.account_id=account_id;
        this.usr=usr;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        jPanel2.setBackground(new java.awt.Color(191, 215, 228));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(219, 184, 184));
        jButton2.setFont(new java.awt.Font("Vivaldi", 0, 30)); // NOI18N
        jButton2.setText("RezervasyonYap");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(142, 193, 146), new java.awt.Color(109, 155, 107)));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(310, 10, 300, 120);

        jButton5.setBackground(new java.awt.Color(219, 184, 184));
        jButton5.setFont(new java.awt.Font("Vivaldi", 0, 30)); // NOI18N
        jButton5.setText("Hesabımı Sil");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(142, 193, 146), new java.awt.Color(109, 155, 107)));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(520, 150, 330, 130);

        jButton1.setBackground(new java.awt.Color(219, 184, 184));
        jButton1.setFont(new java.awt.Font("Vivaldi", 0, 30)); // NOI18N
        jButton1.setText("Rezervasyonumu Gör");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(142, 193, 146), new java.awt.Color(109, 155, 107)));
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
        jPanel2.add(jButton1);
        jButton1.setBounds(70, 150, 330, 130);

        jButton4.setBackground(new java.awt.Color(219, 184, 184));
        jButton4.setFont(new java.awt.Font("Vivaldi", 0, 30)); // NOI18N
        jButton4.setText("Hesabımı Güncelle");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(142, 193, 146), new java.awt.Color(109, 155, 107)));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(310, 300, 300, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userwp2.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(570, 260, 350, 260);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userwp.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 370, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userwp3.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 270, 250, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userwp4.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(410, 60, 260, 380);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userwp5.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(640, 20, 250, 203);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userwindowbg.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(-30, -10, 940, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DBConnection db=new DBConnection();
        try{
            boolean ctrl=true;
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            //kullanıcının daha önce rezervasyon yapıp yapmadığı kontrol ediliyor
            ResultSet rs=st.executeQuery("SELECT * FROM reservations WHERE account_id='"+account_id+"'");
            if(rs.next()){
                ctrl=false;
            }
            if(ctrl==true){
                new newReservations(usr).setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "BİR HESAP SADECE BİR ADET REZERVASYON ALABİLİR!!!");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reservation rez=new Reservation(usr);
        if (rez.getRez_id()==0){
            JOptionPane.showMessageDialog(null, "REZERVASYONUNUZ BULUNMAMAKTADIR!");
        }
        else{
            new MyRez(usr).setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int reply=JOptionPane.showConfirmDialog(null, "Silmek istediğinize emin misiniz?","Emin misin?",JOptionPane.YES_NO_OPTION);
        if(reply==JOptionPane.YES_NO_OPTION){
            if(usr.deleteAcc()){
                JOptionPane.showMessageDialog(null, "Hesap SİLİNDİ...");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Silme İşlemi BAŞARISIZ!!!");
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new updateUser(usr).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(202, 161, 161));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(219, 184, 184));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new java.awt.Color(202, 161, 161));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new java.awt.Color(219, 184, 184));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(new java.awt.Color(202, 161, 161));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(new java.awt.Color(219, 184, 184));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new java.awt.Color(202, 161, 161));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new java.awt.Color(219, 184, 184));
    }//GEN-LAST:event_jButton4MouseExited

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
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

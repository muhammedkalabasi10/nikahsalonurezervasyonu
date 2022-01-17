package evlilik;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MyRez extends javax.swing.JFrame {
    User usr;
    Reservation rez;
    public MyRez(User usr) {
        this.usr=usr;
        initComponents();
        //kullanıcının rezervasyon bilgileri labellara yazdırılıyor
        this.rez=new Reservation(usr);
        lblsehir.setText(rez.getData()[0]);
        lblilce.setText(rez.getData()[1]);
        lblsalon.setText(rez.getData()[2]);
        lblzaman.setText(rez.getData()[3]);
        lblkokteyl.setText(rez.getData()[4]);
    }
    
    public MyRez(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblsehir = new javax.swing.JLabel();
        lblilce = new javax.swing.JLabel();
        lblsalon = new javax.swing.JLabel();
        lblzaman = new javax.swing.JLabel();
        lblkokteyl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        jPanel1.setLayout(null);

        delete.setBackground(new java.awt.Color(49, 43, 43));
        delete.setFont(new java.awt.Font("MS UI Gothic", 0, 25)); // NOI18N
        delete.setForeground(new java.awt.Color(204, 204, 0));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        delete.setText("<html><style>p{text-align:center}</style> <p>Rezervasyonumu<br />Sil</p> </html>");
        delete.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(225, 197, 48)));
        delete.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(310, 320, 270, 60);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(234, 200, 93));
        jLabel1.setText("REZERVASYONUM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(256, 10, 380, 59);

        lblsehir.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 25)); // NOI18N
        lblsehir.setForeground(new java.awt.Color(238, 216, 102));
        jPanel1.add(lblsehir);
        lblsehir.setBounds(230, 110, 210, 60);

        lblilce.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 25)); // NOI18N
        lblilce.setForeground(new java.awt.Color(238, 216, 102));
        jPanel1.add(lblilce);
        lblilce.setBounds(230, 160, 210, 60);

        lblsalon.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 25)); // NOI18N
        lblsalon.setForeground(new java.awt.Color(238, 216, 102));
        jPanel1.add(lblsalon);
        lblsalon.setBounds(230, 230, 210, 60);

        lblzaman.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 25)); // NOI18N
        lblzaman.setForeground(new java.awt.Color(238, 216, 102));
        jPanel1.add(lblzaman);
        lblzaman.setBounds(600, 110, 210, 60);

        lblkokteyl.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 25)); // NOI18N
        lblkokteyl.setForeground(new java.awt.Color(238, 216, 102));
        jPanel1.add(lblkokteyl);
        lblkokteyl.setBounds(600, 170, 210, 60);

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 200, 93));
        jLabel2.setText("Kokteyl:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 170, 120, 50);

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(234, 200, 93));
        jLabel3.setText("Sehir:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 110, 100, 50);

        jLabel4.setFont(new java.awt.Font("Poor Richard", 0, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(234, 200, 93));
        jLabel4.setText("Ilce:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 170, 100, 50);

        jLabel5.setFont(new java.awt.Font("Poor Richard", 0, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(234, 200, 93));
        jLabel5.setText("Salon:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 230, 100, 50);

        jLabel6.setFont(new java.awt.Font("Poor Richard", 0, 35)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(234, 200, 93));
        jLabel6.setText("Zaman:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 110, 100, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rose.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(770, 200, 130, 220);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undertitle.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(250, 60, 400, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rose2.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 210, 140, 190);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/myrezframe.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(4, 0, 910, 410);

        jLabel10.setBackground(new java.awt.Color(114, 112, 112));
        jLabel10.setForeground(new java.awt.Color(114, 112, 112));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 910, 430);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rose.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(770, 190, 130, 220);

        jLabel13.setFont(new java.awt.Font("Poor Richard", 0, 35)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(234, 200, 93));
        jLabel13.setText("Zaman:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(440, 110, 100, 50);

        jLabel14.setFont(new java.awt.Font("Poor Richard", 0, 35)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(234, 200, 93));
        jLabel14.setText("Salon:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(120, 230, 100, 50);

        jLabel15.setFont(new java.awt.Font("Poor Richard", 0, 35)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(234, 200, 93));
        jLabel15.setText("Sehir:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(120, 110, 100, 50);

        jLabel16.setFont(new java.awt.Font("Poor Richard", 0, 35)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(234, 200, 93));
        jLabel16.setText("Ilce:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(120, 170, 100, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int reply=JOptionPane.showConfirmDialog(null, "Silmek istediğinize emin misiniz?","Emin misin?",JOptionPane.YES_NO_OPTION);
        if(reply==JOptionPane.YES_NO_OPTION){
            this.rez.deleteRez();
            dispose();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        // TODO add your handling code here:
        delete.setBackground(new java.awt.Color(81, 73, 73));
        delete.setForeground(new java.awt.Color(218, 218, 65));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/breakheart.png")));
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        // TODO add your handling code here:
        delete.setBackground(new java.awt.Color(49, 43, 43));
        delete.setForeground(new java.awt.Color(204, 204, 0));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png")));
    }//GEN-LAST:event_deleteMouseExited

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
            java.util.logging.Logger.getLogger(MyRez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyRez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyRez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyRez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyRez().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblilce;
    private javax.swing.JLabel lblkokteyl;
    private javax.swing.JLabel lblsalon;
    private javax.swing.JLabel lblsehir;
    private javax.swing.JLabel lblzaman;
    // End of variables declaration//GEN-END:variables
}

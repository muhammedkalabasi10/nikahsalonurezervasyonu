package evlilik;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class HallCtrl extends javax.swing.JFrame {

    public HallCtrl() {
        //veritabanından çekilerek şehirler listeleniyor
        initComponents();
        DBConnection db=new DBConnection();
        try{
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from cities");
            while(rs.next()){
                jComboBox1.addItem(rs.getString("city_name"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        jPanel1.setLayout(null);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(380, 262, 210, 30);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tarih:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 250, 120, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(39, 178, 74));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tik.png"))); // NOI18N
        jButton1.setText("Kontrol Et");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
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
        jButton1.setBounds(360, 310, 240, 50);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(380, 110, 200, 30);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(380, 160, 200, 30);

        jRadioButton1.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Bahçe");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(380, 210, 100, 35);

        jRadioButton2.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Üst Kat");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(480, 210, 100, 35);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sehir:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 100, 120, 40);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Daire:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 150, 120, 40);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Salon:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 200, 120, 40);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SALON KONTROL PANELI");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 20, 560, 40);

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 910, 70);

        jLabel7.setBackground(new java.awt.Color(102, 0, 0));
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 70, 910, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(jDateChooser1.getDate());
        String city=jComboBox1.getSelectedItem().toString();
        String venue=jComboBox2.getSelectedItem().toString();
        String hall;
        if(jRadioButton1.isSelected()==true){
            hall="Bahçe";
        }
        else{
            hall="Üst Kat";
        }
        //rezervasyon kontrolü için kullanıcının girdiği bilgiler çekilerek rezControl isimli static metota yollanıyor
        boolean izin=Reservation.rezControl(city, venue, hall, date);
        if(izin){
            JOptionPane.showMessageDialog(null, "<html><font color=#006600>BU REZERVASYON MÜSAİTTİR...</font>");
        }else{
            JOptionPane.showMessageDialog(null, "<html><font color=#990000>BU REZERVASYON DOLUDUR!!!</font>");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //ilceler listeleniyor
        jComboBox2.removeAllItems();
        DBConnection db=new DBConnection();
        try{
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from cities");
            while(rs.next()){
                if(jComboBox1.getSelectedItem().equals(rs.getString("city_name"))){
                    int id=rs.getInt("city_id");
                    Connection con2=db.ConnDB();
                    Statement st2=con2.createStatement();
                    ResultSet rs2=st2.executeQuery("select * from districts where city_id="+id);
                    while(rs2.next()){
                        jComboBox2.addItem(rs2.getString("name"));
                    }
                    st2.close();
                    con2.close();
                }
            }
            st.close();
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBounds(360, 310, 241, 51);
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 102, 102)));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBounds(360, 310, 240, 50);
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
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
            java.util.logging.Logger.getLogger(HallCtrl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HallCtrl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HallCtrl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HallCtrl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HallCtrl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}

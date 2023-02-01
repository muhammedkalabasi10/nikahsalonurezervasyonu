package evlilik;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;  

public class newReservations extends javax.swing.JFrame {
    User usr;
    public newReservations(){
    }
    public newReservations(User usr) {
        this.usr=usr;
        initComponents();
        DBConnection db=new DBConnection();
        try{
            //şehirler listelendi
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
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        jPanel1.setLayout(null);

        jDateChooser1.setBackground(new java.awt.Color(224, 239, 236));
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(410, 240, 200, 35);

        jLabel5.setFont(new java.awt.Font("Pristina", 0, 30)); // NOI18N
        jLabel5.setText("Tarih:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 230, 70, 50);

        jButton1.setBackground(new java.awt.Color(176, 224, 198));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(135, 130, 130));
        jButton1.setText("Rezervasyon Yap");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
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
        jButton1.setBounds(380, 300, 270, 50);

        jLabel1.setFont(new java.awt.Font("Pristina", 0, 30)); // NOI18N
        jLabel1.setText("Sehir:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 30, 80, 40);

        jComboBox1.setBackground(new java.awt.Color(224, 239, 236));
        jComboBox1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 20)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(410, 30, 200, 35);

        jComboBox2.setBackground(new java.awt.Color(224, 239, 236));
        jComboBox2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 20)); // NOI18N
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(410, 90, 200, 35);

        jLabel2.setFont(new java.awt.Font("Pristina", 0, 30)); // NOI18N
        jLabel2.setText("Daire:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 90, 70, 40);

        jLabel3.setFont(new java.awt.Font("Pristina", 0, 30)); // NOI18N
        jLabel3.setText("Salon:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 140, 70, 40);

        jRadioButton1.setBackground(new java.awt.Color(239, 224, 224));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 20)); // NOI18N
        jRadioButton1.setText("Bahçe");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(410, 150, 90, 35);

        jRadioButton2.setBackground(new java.awt.Color(239, 224, 224));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 20)); // NOI18N
        jRadioButton2.setText("Üst Kat");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(500, 150, 100, 35);

        jLabel4.setFont(new java.awt.Font("Pristina", 0, 30)); // NOI18N
        jLabel4.setText("Kokteyl:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 180, 90, 50);
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(410, 200, 21, 21);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngwing.com (25) (4).png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 10, 790, 410);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngwing.com (29) (6).png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(-47, -50, 980, 470);

        jLabel6.setBackground(new java.awt.Color(239, 224, 224));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-6, 0, 920, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //ilceler listelendi
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
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(jDateChooser1.getDate());
        Date dt=new Date();
        String toDate=sdf.format(dt);
        
        
        String city=jComboBox1.getSelectedItem().toString();
        String venue=jComboBox2.getSelectedItem().toString();
        String hall;
        if(jRadioButton1.isSelected()==true){
            hall="Bahçe";
        }
        else{
            hall="Üst Kat";
        }
        boolean cocktail=jCheckBox1.isSelected();
        
        try{
            Date rezDate=sdf.parse(date);
            Date today=sdf.parse(toDate);
            if(rezDate.compareTo(today)>0){
                Reservation rez=new Reservation(usr,city,venue,hall,date,cocktail);
                if(rez.newRez()==true){
                    JOptionPane.showMessageDialog(null, "Rezervasyon Kaydedildi!");
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Rezervasyon Kaydı BAŞARISIZ!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Yarin ve sonraki günler için rezervasyon alabilirsiniz");
            }
        }catch(Exception e){
            System.out.println("Zaman hatasi");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102,102,102)));
        jButton1.setBounds(380, 300, 271, 51);
        jButton1.setBackground(new java.awt.Color(139,225,179));
        jButton1.setForeground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(176, 224, 198));
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102,102,102)));
        jButton1.setBounds(380, 300, 270, 50);
        jButton1.setForeground(new java.awt.Color(135, 130, 130));
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
            java.util.logging.Logger.getLogger(newReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newReservations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}

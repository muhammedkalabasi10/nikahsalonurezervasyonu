package evlilik;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class updateUser extends javax.swing.JFrame {

    public int account_id;
    User usr;
    DefaultTableModel tblModel;
    DefaultTableModel tblModel2;
    public updateUser(User usr){
        initComponents();
        this.usr=usr;
        usingUpdate();
    }
    
    public updateUser(){
        initComponents();
    }
    
    public void usingUpdate(){
        tblModel=(DefaultTableModel)jTable1.getModel();
        tblModel2=(DefaultTableModel)jTable2.getModel();
        if(tblModel.getRowCount()>0){
            tblModel.removeRow(0);
            tblModel2.removeRow(0);
        }
        String man_data[]={usr.getManName(),usr.getManSurname(),String.valueOf(usr.getManAge()),usr.getManCity(),usr.getManId()};
        tblModel.addRow(man_data);
        String woman_data[]={usr.getWomanName(),usr.getWomanSurname(),String.valueOf(usr.getWomanAge()),usr.getWomanCity(),usr.getWomanId()};
        tblModel2.addRow(woman_data);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        jPanel1.setBackground(new java.awt.Color(61, 57, 57));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Erkek");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 20, 100, 36);

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(61, 57, 57));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jTable1.setFont(new java.awt.Font("Ebrima", 0, 20)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ad", "Soyad", "Yaş", "Şehir", "Tc Kimlik"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(120, 60, 650, 60);

        updateBtn.setFont(new java.awt.Font("Yu Gothic Light", 0, 36)); // NOI18N
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        updateBtn.setText("Güncelle");
        updateBtn.setMargin(new java.awt.Insets(4, 14, 2, 14));
        updateBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        updateBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn);
        updateBtn.setBounds(320, 350, 290, 50);

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTable2.setBackground(new java.awt.Color(61, 57, 57));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jTable2.setFont(new java.awt.Font("Ebrima", 0, 20)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ad", "Soyad", "Yaş", "Şehir", "Tc Kimlik"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setRowHeight(25);
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 240, 650, 60);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("kadın");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 200, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String mName=tblModel.getValueAt(0, 0).toString();
        String mSurname=tblModel.getValueAt(0, 1).toString();
        int mAge=Integer.parseInt(tblModel.getValueAt(0, 2).toString());
        String mCity=tblModel.getValueAt(0, 3).toString();
        String mId=tblModel.getValueAt(0, 4).toString();
        String wName=tblModel2.getValueAt(0, 0).toString();
        String wSurname=tblModel2.getValueAt(0, 1).toString();
        int wAge=Integer.parseInt(tblModel2.getValueAt(0, 2).toString());
        String wCity=tblModel2.getValueAt(0, 3).toString();
        String wId=tblModel2.getValueAt(0, 4).toString();
        if(usr.updateAcc(mName,mSurname,mAge,mCity,mId,wName,wSurname,wAge,wCity,wId)){
            JOptionPane.showMessageDialog(null, "GÜNCELLEME BAŞARILI!");
            usingUpdate();
        }
        else{
            JOptionPane.showMessageDialog(null, "GÜNCELLEME BAŞARISIZ!");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(updateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}

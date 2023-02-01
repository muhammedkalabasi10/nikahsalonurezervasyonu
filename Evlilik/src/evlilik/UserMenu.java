package evlilik;

public class UserMenu extends javax.swing.JFrame {
    public UserMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(196, 192, 209));
        jButton2.setFont(new java.awt.Font("Pristina", 0, 60)); // NOI18N
        jButton2.setText("Kayıt Ol");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 204), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 153, 51)));
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
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 50, 330, 140);

        jButton1.setBackground(new java.awt.Color(196, 192, 209));
        jButton1.setFont(new java.awt.Font("Pristina", 0, 60)); // NOI18N
        jButton1.setText("Giris Yap");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 204), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 153, 51)));
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
        jButton1.setBounds(570, 60, 330, 140);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngwing.com (7) (1) (2).png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(5, 280, 910, 170);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/secim.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 40, 250, 370);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usrpanelwp.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(4, 0, 910, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new UserLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new UserSignup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new java.awt.Color(177, 173, 192));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new java.awt.Color(196, 192, 209));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(177, 173, 192));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(196, 192, 209));
    }//GEN-LAST:event_jButton1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

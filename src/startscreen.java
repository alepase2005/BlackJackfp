/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alpas1720
 */
public class startscreen extends javax.swing.JFrame {

    /**
     * Creates new form startscreen
     */
    public startscreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startpnl = new javax.swing.JPanel();
        titlelbl = new javax.swing.JLabel();
        startbtn = new javax.swing.JButton();
        lin1lbl = new javax.swing.JLabel();
        lin2lbl = new javax.swing.JLabel();
        lin3lbl = new javax.swing.JLabel();
        cardlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startpnl.setBackground(new java.awt.Color(0, 102, 51));

        titlelbl.setBackground(new java.awt.Color(255, 0, 0));
        titlelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titlelbl.setForeground(new java.awt.Color(255, 51, 0));
        titlelbl.setText("Black Jack");

        startbtn.setText("Start");
        startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtnActionPerformed(evt);
            }
        });

        lin1lbl.setText("Have you ever wondered how would it be to play Black Jack with no  bets? Wonder no more, we have created it for you! ");

        lin2lbl.setText("No double down, no splitting, no gambling addiction, completely safe and fun!");

        lin3lbl.setText("To make the dealer progress in their turn press the stand button");

        cardlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spades/Jack.png"))); // NOI18N
        cardlbl.setToolTipText("");

        javax.swing.GroupLayout startpnlLayout = new javax.swing.GroupLayout(startpnl);
        startpnl.setLayout(startpnlLayout);
        startpnlLayout.setHorizontalGroup(
            startpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startpnlLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(startpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lin1lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startpnlLayout.createSequentialGroup()
                        .addGroup(startpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(startpnlLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lin3lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lin2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(startpnlLayout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addGroup(startpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardlbl)
                    .addGroup(startpnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(startbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startpnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titlelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        startpnlLayout.setVerticalGroup(
            startpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startpnlLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titlelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lin1lbl)
                .addGap(1, 1, 1)
                .addComponent(lin2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lin3lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startbtn)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed
        game jfrl =new game();
        jfrl.show();
        dispose();
    }//GEN-LAST:event_startbtnActionPerformed

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
            java.util.logging.Logger.getLogger(startscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardlbl;
    private javax.swing.JLabel lin1lbl;
    private javax.swing.JLabel lin2lbl;
    private javax.swing.JLabel lin3lbl;
    private javax.swing.JButton startbtn;
    private javax.swing.JPanel startpnl;
    private javax.swing.JLabel titlelbl;
    // End of variables declaration//GEN-END:variables
}

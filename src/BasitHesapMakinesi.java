/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gulse
 */
public class BasitHesapMakinesi extends javax.swing.JFrame {
   private  int say = 0;
    /**
     * Creates new form BasitHesapMakinesi
     */
    public BasitHesapMakinesi() {
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

        artı = new javax.swing.JButton();
        eksi = new javax.swing.JButton();
        carpı = new javax.swing.JButton();
        bölme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        birinci_sayi = new javax.swing.JTextField();
        ikinci_sayi = new javax.swing.JTextField();
        Sonuc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        artı.setText("+");
        artı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artıActionPerformed(evt);
            }
        });

        eksi.setText("-");
        eksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksiActionPerformed(evt);
            }
        });

        carpı.setText("*");
        carpı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpıActionPerformed(evt);
            }
        });

        bölme.setText("/");
        bölme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bölmeActionPerformed(evt);
            }
        });

        jLabel1.setText("Birinci Sayi");

        jLabel2.setText("İkinci Sayi:");

        jLabel3.setText("Sonuc:");

        Sonuc.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(artı)
                            .addComponent(carpı))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eksi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bölme, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(birinci_sayi, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(ikinci_sayi)
                            .addComponent(Sonuc))
                        .addContainerGap(54, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(birinci_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(ikinci_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artı)
                    .addComponent(eksi))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carpı)
                    .addComponent(bölme))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksiActionPerformed
         int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        
        Sonuc.setText(String.valueOf(birinci_sayi - ikinci_sayi));
    }//GEN-LAST:event_eksiActionPerformed

    private void artıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artıActionPerformed
        int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        
        Sonuc.setText(String.valueOf(birinci_sayi + ikinci_sayi));
    }//GEN-LAST:event_artıActionPerformed

    private void carpıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpıActionPerformed
         int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        
        Sonuc.setText(String.valueOf(birinci_sayi * ikinci_sayi));
    }//GEN-LAST:event_carpıActionPerformed

    private void bölmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bölmeActionPerformed
        int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        
        Sonuc.setText(String.valueOf((double)birinci_sayi / ikinci_sayi));
    }//GEN-LAST:event_bölmeActionPerformed

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
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasitHesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Sonuc;
    private javax.swing.JButton artı;
    private javax.swing.JTextField birinci_sayi;
    private javax.swing.JButton bölme;
    private javax.swing.JButton carpı;
    private javax.swing.JButton eksi;
    private javax.swing.JTextField ikinci_sayi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

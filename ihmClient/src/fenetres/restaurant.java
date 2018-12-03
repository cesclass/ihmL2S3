/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetres;

import ihmclient.IhmClient;

/**
 *
 * @author cyril
 */
public class restaurant extends javax.swing.JFrame {

    /**
     * Creates new form accueil_1
     */
    public restaurant() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_eatvite = new javax.swing.JLabel();
        lbl_connexion = new javax.swing.JLabel();
        lbl_inscription = new javax.swing.JLabel();
        lbl_pseudo = new javax.swing.JLabel();
        lbl_deco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_eatvite.setText("EAT' VITE");
        lbl_eatvite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_eatviteMouseClicked(evt);
            }
        });

        lbl_connexion.setText("se connecter");
        lbl_connexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_connexionMouseClicked(evt);
            }
        });

        lbl_inscription.setText("s'inscrire");
        lbl_inscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_inscriptionMouseClicked(evt);
            }
        });

        lbl_deco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_decoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_eatvite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1057, Short.MAX_VALUE)
                .addComponent(lbl_deco)
                .addGap(18, 18, 18)
                .addComponent(lbl_inscription)
                .addGap(18, 18, 18)
                .addComponent(lbl_pseudo)
                .addGap(18, 18, 18)
                .addComponent(lbl_connexion)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_eatvite)
                    .addComponent(lbl_connexion)
                    .addComponent(lbl_inscription)
                    .addComponent(lbl_pseudo)
                    .addComponent(lbl_deco))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(808, 808, 808))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_decoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_decoMouseClicked
        lbl_inscription.setText("s'inscrire");
        lbl_connexion.setText("se connecter");
        lbl_deco.setText("");
        lbl_pseudo.setText("");
    }//GEN-LAST:event_lbl_decoMouseClicked

    private void lbl_connexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_connexionMouseClicked
        IhmClient.ouvrir_connexion();
        IhmClient.bloquer_restaurant();

    }//GEN-LAST:event_lbl_connexionMouseClicked

    private void lbl_inscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_inscriptionMouseClicked
        IhmClient.bloquer_restaurant();
        IhmClient.ouvrir_inscription();
    }//GEN-LAST:event_lbl_inscriptionMouseClicked

    private void lbl_eatviteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eatviteMouseClicked
        IhmClient.fermer_restaurant();
        IhmClient.ouvrir_accueil();
    }//GEN-LAST:event_lbl_eatviteMouseClicked

    public void changePseudo(String mail) {
        lbl_inscription.setText("");
        lbl_connexion.setText("");
        lbl_deco.setText("se déconnecter");
        lbl_pseudo.setText(mail);
    }
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
            java.util.logging.Logger.getLogger(accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_connexion;
    private javax.swing.JLabel lbl_deco;
    private javax.swing.JLabel lbl_eatvite;
    private javax.swing.JLabel lbl_inscription;
    private javax.swing.JLabel lbl_pseudo;
    // End of variables declaration//GEN-END:variables
}

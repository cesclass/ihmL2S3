/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetres;

/**
 *
 * @author cyril
 */
public class form_inscription extends javax.swing.JFrame {

    /**
     * Creates new form form_inscription
     */
    public form_inscription() {
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

        lbl_inscription = new javax.swing.JLabel();
        lbl_pays = new javax.swing.JLabel();
        fld_pays = new javax.swing.JTextField();
        lbl_ville = new javax.swing.JLabel();
        fld_ville = new javax.swing.JTextField();
        lbl_cp = new javax.swing.JLabel();
        fld_cp = new javax.swing.JTextField();
        fld_nom = new javax.swing.JTextField();
        lbl_nom = new javax.swing.JLabel();
        lbl_prenom = new javax.swing.JLabel();
        fld_prenom = new javax.swing.JTextField();
        lbl_adresse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_adresse = new javax.swing.JTextArea();
        btn_valider = new javax.swing.JButton();
        btn_annuler = new javax.swing.JButton();
        fld_numero = new javax.swing.JTextField();
        lbl_numero = new javax.swing.JLabel();
        fld_mail = new javax.swing.JTextField();
        lbl_mail = new javax.swing.JLabel();
        fld_mdp1 = new javax.swing.JTextField();
        lbl_mdp1 = new javax.swing.JLabel();
        fld_mdp2 = new javax.swing.JTextField();
        lbl_mdp2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_inscription.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_inscription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_inscription.setText("Inscription");
        lbl_inscription.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_pays.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_pays.setText("Pays :");

        fld_pays.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fld_pays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_paysActionPerformed(evt);
            }
        });

        lbl_ville.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_ville.setText("Ville :");

        fld_ville.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fld_ville.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_villeActionPerformed(evt);
            }
        });

        lbl_cp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_cp.setText("CP :");

        fld_cp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fld_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_cpActionPerformed(evt);
            }
        });

        fld_nom.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fld_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_nomActionPerformed(evt);
            }
        });

        lbl_nom.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_nom.setText("Nom :");

        lbl_prenom.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_prenom.setText("Prenom :");

        fld_prenom.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fld_prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_prenomActionPerformed(evt);
            }
        });

        lbl_adresse.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_adresse.setText("Adresse :");

        area_adresse.setColumns(20);
        area_adresse.setRows(5);
        jScrollPane1.setViewportView(area_adresse);

        btn_valider.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_valider.setText("Valider");
        btn_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validerActionPerformed(evt);
            }
        });

        btn_annuler.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_annuler.setText("Annuler");
        btn_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_annulerActionPerformed(evt);
            }
        });

        fld_numero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fld_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_numeroActionPerformed(evt);
            }
        });

        lbl_numero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_numero.setText("Numero :");

        fld_mail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fld_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_mailActionPerformed(evt);
            }
        });

        lbl_mail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_mail.setText("Mail :");

        fld_mdp1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fld_mdp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_mdp1ActionPerformed(evt);
            }
        });

        lbl_mdp1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_mdp1.setText("Mot de passe :");

        fld_mdp2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fld_mdp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_mdp2ActionPerformed(evt);
            }
        });

        lbl_mdp2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_mdp2.setText("Confirmation :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_nom)
                                    .addComponent(lbl_numero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fld_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fld_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_mail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fld_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_prenom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fld_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_pays)
                                    .addComponent(lbl_cp)
                                    .addComponent(lbl_ville))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fld_ville, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(fld_pays)
                                    .addComponent(fld_cp))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_adresse)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_mdp2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fld_mdp2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_mdp1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fld_mdp1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_valider)
                                .addGap(18, 18, 18)
                                .addComponent(btn_annuler)
                                .addGap(42, 42, 42)))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_inscription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_inscription, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fld_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nom)
                    .addComponent(fld_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_prenom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fld_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_numero)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fld_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_mail)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fld_pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_pays))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fld_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ville))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fld_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cp)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_adresse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_mdp1)
                            .addComponent(fld_mdp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_mdp2)
                            .addComponent(fld_mdp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_annuler)
                            .addComponent(btn_valider))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fld_paysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_paysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_paysActionPerformed

    private void fld_villeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_villeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_villeActionPerformed

    private void fld_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_cpActionPerformed

    private void fld_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_nomActionPerformed

    private void fld_prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_prenomActionPerformed

    private void btn_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_validerActionPerformed

    private void btn_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_annulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_annulerActionPerformed

    private void fld_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_numeroActionPerformed

    private void fld_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_mailActionPerformed

    private void fld_mdp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_mdp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_mdp1ActionPerformed

    private void fld_mdp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_mdp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_mdp2ActionPerformed

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
            java.util.logging.Logger.getLogger(form_inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_inscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_adresse;
    private javax.swing.JButton btn_annuler;
    private javax.swing.JButton btn_valider;
    private javax.swing.JTextField fld_cp;
    private javax.swing.JTextField fld_mail;
    private javax.swing.JTextField fld_mdp1;
    private javax.swing.JTextField fld_mdp2;
    private javax.swing.JTextField fld_nom;
    private javax.swing.JTextField fld_numero;
    private javax.swing.JTextField fld_pays;
    private javax.swing.JTextField fld_prenom;
    private javax.swing.JTextField fld_ville;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_adresse;
    private javax.swing.JLabel lbl_cp;
    private javax.swing.JLabel lbl_inscription;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JLabel lbl_mdp1;
    private javax.swing.JLabel lbl_mdp2;
    private javax.swing.JLabel lbl_nom;
    private javax.swing.JLabel lbl_numero;
    private javax.swing.JLabel lbl_pays;
    private javax.swing.JLabel lbl_prenom;
    private javax.swing.JLabel lbl_ville;
    // End of variables declaration//GEN-END:variables
}

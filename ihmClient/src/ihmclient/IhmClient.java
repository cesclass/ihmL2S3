/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihmclient;

import fenetres.*;

/**
 *
 * @author cyril
 */
public class IhmClient {

    public static accueil accueil = new accueil();
    public static connexion connexion = new connexion();
    public static form_inscription inscription = new form_inscription();
    public static profil profil = new profil();
    public static restaurant restaurant = new restaurant();
    
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                accueil.setVisible(true);
            }
        });
    }
    
    public static void ouvrir_accueil(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                accueil.setVisible(true);
                
            }
        });
    }
    
    public static void bloquer_accueil(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                accueil.setEnabled(false);
                
            }
        });
    }
    
    public static void debloquer_accueil(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                accueil.setEnabled(true);
                
            }
        });
    }
    
    public static void fermer_accueil(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                accueil.setVisible(false);
                
            }
        });
    }
    
    public static void ouvrir_connexion(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                connexion.setVisible(true);
                
            }
        });
    }
    
    public static void fermer_connexion(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                connexion.setVisible(false);
                
            }
        });
    }
    
    public static void ouvrir_inscription(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                inscription.setVisible(true);
                
            }
        });
    }
    
    public static void fermer_inscription(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                inscription.setVisible(false);
                
            }
        });
    }
    
    public static void ouvrir_profil(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                profil.setVisible(true);
                
            }
        });
    }
    
    public static void fermer_profil(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                profil.setVisible(false);
                
            }
        });
    }
    
    public static void ouvrir_restaurant(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                restaurant.setVisible(true);
                
            }
        });
    }
    
    public static void fermer_restaurant(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                restaurant.setVisible(false);
                
            }
        });
    }
    
    
}
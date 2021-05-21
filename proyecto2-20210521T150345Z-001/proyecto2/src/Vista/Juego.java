/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.Jugador;
import Logica.Jugar;
import Logica.manejadorNombres;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dabrin Najera
 * @author Raquel Solano
 * @version 2.0.0
 * @since BlackJack 1.0.0
 */
public class Juego extends javax.swing.JFrame {

    Jugar jugar;
    File f;

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        setLocationRelativeTo(null);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jPanel.setVisible(false);
        jIcon.setVisible(false);
   

        try {

            f = new File("Rachas.txt");
            f.createNewFile();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso al archivo");
        }
    } 

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/spade.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        desktopPane = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jIcon = new javax.swing.JLabel();
        jPanel = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuAcerca = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuInsertar = new javax.swing.JMenuItem();
        jMenuActualizar = new javax.swing.JMenuItem();
        jMenuBorrar = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuJNew = new javax.swing.JMenuItem();
        jMenuRestart = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuLista = new javax.swing.JMenuItem();
        jMenuDiario = new javax.swing.JMenuItem();
        jMenuTop = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jButton3.setText("JUGAR VS AMIGO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton3);
        jButton3.setBounds(470, 70, 200, 40);

        jButton2.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jButton2.setText("JUGAR SOLO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton2);
        jButton2.setBounds(510, 150, 130, 39);

        btnSalir.setBackground(new java.awt.Color(0, 51, 0));
        btnSalir.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 255, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        desktopPane.add(btnSalir);
        btnSalir.setBounds(1020, 10, 73, 23);

        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Raquel Solano , Dabrin Najera");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(10, 390, 260, 14);

        jIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spade.png"))); // NOI18N
        desktopPane.add(jIcon);
        jIcon.setBounds(490, 120, 130, 130);

        jText.setBackground(new java.awt.Color(0, 51, 0));
        jText.setColumns(20);
        jText.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jText.setForeground(new java.awt.Color(204, 255, 204));
        jText.setRows(5);
        jText.setText("Este juego fue desarrollado por Dabrin Najera y Raquel Solano \nEs un juego sencillo, las reglas son las siguientes\n->El jugador que llegue primero a 21 puntos gana.\n->El jugador que supere los 21 puntos pierde.\n->Si ambos jugadores llegan a 21 puntos es un empate.\n->Si ninguno de los jugadores llega a los 21 el de mayor puntaje gana.\nAhora que ya tienes una idea del juego disfruta jugando!!");
        jPanel.setViewportView(jText);

        desktopPane.add(jPanel);
        jPanel.setBounds(0, 0, 620, 250);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(-100, -380, 1220, 800);

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1118, 412));

        jMenu6.setText("Sistema");

        jMenuAcerca.setText("Acerca de");
        jMenuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAcercaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuAcerca);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuSalir);

        jMenuBar3.add(jMenu6);

        jMenu7.setText("Mantenimiento");

        jMenuInsertar.setText("Insertar Jugador ");
        jMenuInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInsertarActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuInsertar);

        jMenuActualizar.setText("Actualizar jugador");
        jMenuActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActualizarActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuActualizar);

        jMenuBorrar.setText("Borrar Jugador");
        jMenuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBorrarActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuBorrar);

        jMenuBar3.add(jMenu7);

        jMenu8.setText("Acciones");

        jMenuJNew.setText("Juego nuevo");
        jMenuJNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuJNewActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuJNew);

        jMenuRestart.setText("Reiniciar juego");
        jMenuRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRestartActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuRestart);

        jMenuBar3.add(jMenu8);

        jMenu9.setText("Reportes");

        jMenuLista.setText("Listado general de jugadores");
        jMenuLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListaActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuLista);

        jMenuDiario.setText("Juegos del dia");
        jMenuDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDiarioActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuDiario);

        jMenuTop.setText("Lista partidas");
        jMenuTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTopActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuTop);

        jMenuBar3.add(jMenu9);

        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        PVP jvj = new PVP();
       
        Jugar jugar = new Jugar();
        
        jvj.cartaJ2.setEnabled(false);
        jvj.QuedarseJ1.setEnabled(false);
        jvj.pasarJ1.setEnabled(false);
        jvj.finalizar.setEnabled(false);
        jvj.cartaj1.setEnabled(false);
        jvj.pasarj2.setEnabled(false);
        jvj.quedarseJ2.setEnabled(false);
        
        
        
        //jvj.quedarseJ2.setVisible(false);
        //jvj.pasarj2.setVisible(false);
        //jvj.pasarJ1.setVisible(false);
        //jvj.QuedarseJ1.setVisible(false);
        //jvj.cartaj1.setVisible(false);
        
        
        
        desktopPane.add(jvj);
        jvj.setVisible(true);
        jButton3.setVisible(false);
        jButton2.setVisible(false);
        jIcon.setVisible(false);
        jPanel.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
/**
 * 
 * @param evt 
 */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PVIA jvIA = new PVIA();
        desktopPane.add(jvIA);
        jvIA.setVisible(true);
        jButton3.setVisible(false);
        jButton2.setVisible(false);
        jIcon.setVisible(false);
        jPanel.setVisible(false);
        jvIA.QuedarseJ1.setEnabled(false);
        jvIA.pasarJ1.setEnabled(false);
        jvIA.finalizar.setEnabled(false);
        jvIA.cartaj1.setEnabled(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed
/**
 * 
 * @param evt 
 */
    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed
/**
 * 
 * @param evt 
 */
    private void jMenuInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInsertarActionPerformed
        // TODO add your handling code here:
        Insertar entrada = new Insertar();
        desktopPane.add(entrada);
        entrada.setVisible(true);
        jIcon.setVisible(false);
        jPanel.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
    }//GEN-LAST:event_jMenuInsertarActionPerformed
/**
 * 
 * @param evt 
 */
    private void jMenuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBorrarActionPerformed
        // TODO add your handling code here:
        Borrar entrada = new Borrar();
        desktopPane.add(entrada);
        entrada.setVisible(true);
        jIcon.setVisible(false);
        jPanel.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
    }//GEN-LAST:event_jMenuBorrarActionPerformed
/**
 * 
 * @param evt 
 */
    private void jMenuTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTopActionPerformed
        // TODO add your handling code here:
        Jugar j=new Jugar();
        SalidaTop salida = new SalidaTop( j);
        desktopPane.add(salida);
        salida.setVisible(true);
        jIcon.setVisible(false);
        jPanel.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);

    }//GEN-LAST:event_jMenuTopActionPerformed
/**
 * 
 * @param evt 
 */
    private void jMenuJNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuJNewActionPerformed
        // TODO add your handling code here:
        PVP jvj = new PVP();
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jPanel.setVisible(false);
        jIcon.setVisible(false);
        desktopPane.add(jvj);
        
        

    }//GEN-LAST:event_jMenuJNewActionPerformed
/**
 * 
 * @param evt 
 */
    private void jMenuDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDiarioActionPerformed
        // TODO add your handling code here:
        JuegosDiarios salida = new JuegosDiarios();
        desktopPane.add(salida);
        salida.setVisible(true);
        jIcon.setVisible(false);
        jPanel.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
    }//GEN-LAST:event_jMenuDiarioActionPerformed
/**
 * 
 * @param evt 
 */
    private void jMenuListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListaActionPerformed
        // TODO add your handling code here:
        ListaJugadores salida = new ListaJugadores();
        desktopPane.add(salida);
        salida.setVisible(true);
        jIcon.setVisible(false);
        jPanel.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
    }//GEN-LAST:event_jMenuListaActionPerformed
/**
 * 
 * @param evt 
 */
    private void jMenuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActualizarActionPerformed
        // TODO add your handling code here:
        Actualizar entrada = new Actualizar();
        desktopPane.add(entrada);
        entrada.setVisible(true);
        jIcon.setVisible(false);
        jPanel.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
    }//GEN-LAST:event_jMenuActualizarActionPerformed
/**
 * 
 * @param evt 
 */
    private void jMenuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAcercaActionPerformed
        // TODO add your handling code here:
        jPanel.setVisible(true);
        jIcon.setVisible(true);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        
    }//GEN-LAST:event_jMenuAcercaActionPerformed

    private void jMenuRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRestartActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuRestartActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuAcerca;
    private javax.swing.JMenuItem jMenuActualizar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuBorrar;
    private javax.swing.JMenuItem jMenuDiario;
    private javax.swing.JMenuItem jMenuInsertar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuJNew;
    private javax.swing.JMenuItem jMenuLista;
    private javax.swing.JMenuItem jMenuRestart;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JMenuItem jMenuTop;
    private javax.swing.JScrollPane jPanel;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextArea jText;
    // End of variables declaration//GEN-END:variables

}

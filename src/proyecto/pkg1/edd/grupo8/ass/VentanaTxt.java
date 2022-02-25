/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class VentanaTxt extends javax.swing.JFrame {
    public static String Archtxt;
    public static GrafoMatriz grafo;
    public static GrafoMatriz grafo2;
    ListaUsuarios listau = new ListaUsuarios();
    ListaRelaciones listar = new ListaRelaciones();
    ListaAristas listaa = new ListaAristas();

    /**
     * Creates new form Ventana
     */
    public VentanaTxt(GrafoMatriz grafoMatriz) {
        this.grafo= grafo;
        this.listau = listau;
        this.listar = listar;
        this.listaa = listaa;
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        if (grafo!=null) {
            grafo.getLista_usuarios().ImprimirLista(pantallaTxt);
        grafo.getLista_relaciones().ImprimirLista(pantallaTxt);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        pantallaTxt = new javax.swing.JTextArea();
        SeleccionarArchivo = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        exit = new javax.swing.JToggleButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantallaTxt.setEditable(false);
        pantallaTxt.setBackground(new java.awt.Color(51, 51, 51));
        pantallaTxt.setColumns(20);
        pantallaTxt.setForeground(new java.awt.Color(255, 255, 255));
        pantallaTxt.setRows(5);
        jScrollPane1.setViewportView(pantallaTxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 580, 300));

        SeleccionarArchivo.setBackground(new java.awt.Color(51, 51, 51));
        SeleccionarArchivo.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        SeleccionarArchivo.setForeground(new java.awt.Color(255, 255, 255));
        SeleccionarArchivo.setText("SELECCIONAR ARCHIVO DE TEXTO");
        SeleccionarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(SeleccionarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 60));

        Actualizar.setBackground(new java.awt.Color(51, 51, 51));
        Actualizar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setText("ACTUALIZAR ARCHIVO DE TEXTO");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 240, 60));

        exit.setBackground(new java.awt.Color(51, 51, 51));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 70, 30));

        back.setBackground(new java.awt.Color(51, 51, 51));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText(">>>");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarArchivoActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Desea abrir un nuevo archivo?", "Verificacion", ConfirmationCallback.YES_NO_CANCEL_OPTION);
        if (respuesta ==0) {
        Archivotxt txt = new Archivotxt();
        listaa.vaciar();
        listau.vaciar();
        listar.vaciar();
        grafo= txt.cargarMatrizGrafo(listau, listar,listaa);
        pantallaTxt.setText("");
        VentanaTxt.Archtxt = txt.abrirArchivo();
        txt.lectorString(Archtxt, listau,listar,listaa);
        if (listau.getPfirst()!=null) {
        pantallaTxt.setText(VentanaTxt.Archtxt);
        grafo= txt.cargarMatrizGrafo(listau, listar,listaa);
        }
        }
    }//GEN-LAST:event_SeleccionarArchivoActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new VentanaInicio(grafo).setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed

        Archivotxt txt = new Archivotxt();
         txt.guardarArchivo(pantallaTxt);
         dispose();
    }//GEN-LAST:event_ActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(VentanaTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTxt(grafo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton SeleccionarArchivo;
    private javax.swing.JButton back;
    private javax.swing.JToggleButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pantallaTxt;
    // End of variables declaration//GEN-END:variables
}

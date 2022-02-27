/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.edd.grupo8.ass;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class VentanaModificarGrafo extends javax.swing.JFrame {
    public static GrafoMatriz grafo;
    Funciones func;
    /**
     * Creates new form VentanaModificarGrafo
     */
    public VentanaModificarGrafo(GrafoMatriz grafo) {
        this.grafo= grafo;
        this.func= new Funciones();
        initComponents();
        setLocationRelativeTo(null);
        if (grafo!=null) {
            grafo.getLista_usuarios().ImprimirLista(Usuarios);
        grafo.getLista_relaciones().ImprimirLista(Usuarios);
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
        pantalla = new javax.swing.JScrollPane();
        Usuarios = new javax.swing.JTextArea();
        nombre = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ID2 = new javax.swing.JTextField();
        tiempo = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        IDelim = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setToolTipText("");

        Usuarios.setEditable(false);
        Usuarios.setBackground(new java.awt.Color(51, 51, 51));
        Usuarios.setColumns(20);
        Usuarios.setForeground(new java.awt.Color(204, 204, 204));
        Usuarios.setRows(5);
        pantalla.setViewportView(Usuarios);

        jPanel1.add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 220, 390));

        nombre.setBackground(new java.awt.Color(51, 51, 51));
        nombre.setForeground(new java.awt.Color(204, 204, 204));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, -1));

        ID.setBackground(new java.awt.Color(51, 51, 51));
        ID.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("ID Friend");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 60, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("TIEMPO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 60, -1));

        ID2.setBackground(new java.awt.Color(51, 51, 51));
        ID2.setForeground(new java.awt.Color(204, 204, 204));
        ID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID2ActionPerformed(evt);
            }
        });
        jPanel1.add(ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 70, -1));

        tiempo.setBackground(new java.awt.Color(51, 51, 51));
        tiempo.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, -1));

        botonAgregar.setBackground(new java.awt.Color(51, 51, 51));
        botonAgregar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setText("+");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 80, 60));

        botonVolver.setBackground(new java.awt.Color(51, 51, 51));
        botonVolver.setForeground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("<<<");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 60, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("@");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        botonEliminar.setBackground(new java.awt.Color(51, 51, 51));
        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("-");
        botonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 80, 40));

        IDelim.setBackground(new java.awt.Color(51, 51, 51));
        IDelim.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(IDelim, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 120, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("ELIMINAR USUARIO");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setRows(5);
        jTextArea4.setText("\n ID => Direccion del Usuario a Eliminar");
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 390, 60));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("AGREGAR USUARIO");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("  @ => Nombre del Usuario\n  ID => Direccion del Usuario\n  ID Friend => Direccion de Amigo\n  Tiempo => Tiempo de Amistad");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 390, 60));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setRows(5);
        jTextArea1.setText("Para AGREGAR o ELIMINAR un usuario, solo\nllene una de las dos áreas.");
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 50));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        boolean flag_usuario= func.Validar_Nombre_Usuario(nombre.getText());
        if (flag_usuario==false) {
            return;
        }
        
        flag_usuario= grafo.getLista_usuarios().Validar_Usuario("@" + nombre.getText());
        if (flag_usuario==true) {
            JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya se encuentra registrado");
            return;
        }
        
        boolean flag_id_1= func.Validar_ID(ID.getText());
        if (flag_id_1==false) {
            return;
        }
        if (grafo!=null) {
            if (!grafo.lista_usuarios.estaVacia()) {
        if (grafo.getLista_usuarios().Buscar_ID(Integer.parseInt(ID.getText()))) {
            JOptionPane.showMessageDialog(null, "El ID del nuevo usuario ingresado no esta disponible");
            return;
        }
        boolean flag_id_2= func.Validar_ID(ID2.getText());
        if (flag_id_2==false) {
            return;
        }
        
        if (grafo.getLista_usuarios().Buscar_ID(Integer.parseInt(ID2.getText()))==false) {
            JOptionPane.showMessageDialog(null, "El ID Friend ingresado no se encuentra registrado");
            return;
        }
        
        boolean flag_tiempo= func.Validar_tiempo(tiempo.getText());
        if (flag_tiempo==false) {
            JOptionPane.showMessageDialog(null, "El tiempo de amistad no puede estar vacío, ser negativo o igual a cero");
            return;
        }
        }
        }
        
        Archivotxt txt = new Archivotxt();
        String nom = "@"+nombre.getText();
        if (grafo!=null ) {
            if (!grafo.lista_usuarios.estaVacia()) {
            int posicion = grafo.getLista_usuarios().getPlast().getPosicion();
            posicion +=1; 
            NodoUsuario nodo = new NodoUsuario(Integer.parseInt(ID.getText()),nom,posicion);
            grafo.getLista_usuarios().agregarAlFinal(nodo);
            grafo.getLista_usuarios().ImprimirLista_2();
            int pos= grafo.getLista_usuarios().BuscarPosicion(Integer.parseInt(ID.getText()));
            int pos2= grafo.getLista_usuarios().BuscarPosicion(Integer.parseInt(ID2.getText()));
            NodoRelaciones nodor = new NodoRelaciones(Integer.parseInt(ID.getText()), Integer.parseInt(ID2.getText()), Integer.parseInt(tiempo.getText()));
            NodoArista nodoa = new NodoArista(pos, pos2);
            grafo.getLista_relaciones().agregarAlFinal(nodor);
            grafo.getLista_relaciones().ImprimirLista_2();
            grafo.getLista_aristas().agregarAlFinal(nodoa);
            grafo=txt.cargarMatrizGrafo(grafo.getLista_usuarios(),grafo.getLista_relaciones(),grafo.getLista_aristas());
            }else{
               ListaUsuarios lista_usuarios = new ListaUsuarios();
            NodoUsuario nodo = new NodoUsuario(Integer.parseInt(ID.getText()),nom,0);
            lista_usuarios.agregarAlFinal(nodo);
            ListaRelaciones lista_relaciones = new ListaRelaciones();
            NodoRelaciones nodor = new NodoRelaciones(Integer.parseInt(ID.getText()), Integer.parseInt(ID.getText()),0);
            lista_relaciones.agregarAlFinal(nodor);
            ListaAristas lista_aristas = new ListaAristas();
            NodoArista nodoa = new NodoArista(0, 0);
            lista_aristas.agregarAlFinal(nodoa);
            grafo=txt.cargarMatrizGrafo(lista_usuarios,lista_relaciones,lista_aristas);
            grafo.getLista_relaciones().vaciar();
            grafo.getLista_aristas().vaciar(); 
            }   
        }
        if (grafo==null) {
            ListaUsuarios lista_usuarios = new ListaUsuarios();
            NodoUsuario nodo = new NodoUsuario(Integer.parseInt(ID.getText()),nom,0);
            lista_usuarios.agregarAlFinal(nodo);
            ListaRelaciones lista_relaciones = new ListaRelaciones();
            NodoRelaciones nodor = new NodoRelaciones(Integer.parseInt(ID.getText()), Integer.parseInt(ID.getText()),0);
            lista_relaciones.agregarAlFinal(nodor);
            ListaAristas lista_aristas = new ListaAristas();
            NodoArista nodoa = new NodoArista(0, 0);
            lista_aristas.agregarAlFinal(nodoa);
            grafo=txt.cargarMatrizGrafo(lista_usuarios,lista_relaciones,lista_aristas);
            grafo.lista_relaciones.vaciar();
            grafo.lista_aristas.vaciar();
        }
        nombre.setText("");
        ID.setText("");
        ID2.setText("");
        tiempo.setText("");
        Usuarios.setText("");
        grafo.getLista_usuarios().ImprimirLista(Usuarios);
        grafo.getLista_relaciones().ImprimirLista(Usuarios);
        JOptionPane.showMessageDialog(null, "Usuario agregado con éxito");
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        new VentanaInicio(grafo).setVisible(true);
        dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void ID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID2ActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (grafo.lista_usuarios.estaVacia()) {
            JOptionPane.showMessageDialog(null, "El grafo se encuentra vacío, no se puede eliminar");
            return;
        }
        boolean flag_id_1= func.Validar_ID(IDelim.getText());
        if (flag_id_1==false) {
            return;
        }
        int elimid = Integer.parseInt(IDelim.getText());
        grafo.eliminarNodo(elimid);
        Archivotxt txt = new Archivotxt();
        grafo=txt.cargarMatrizGrafo(grafo.getLista_usuarios(),grafo.getLista_relaciones(),grafo.getLista_aristas());
        Usuarios.setText("");
        IDelim.setText("");
        grafo.getLista_usuarios().ImprimirLista(Usuarios);
        grafo.getLista_relaciones().ImprimirLista(Usuarios);
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaModificarGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificarGrafo(grafo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField ID2;
    private javax.swing.JTextField IDelim;
    private javax.swing.JTextArea Usuarios;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField nombre;
    private javax.swing.JScrollPane pantalla;
    private javax.swing.JTextField tiempo;
    // End of variables declaration//GEN-END:variables
}

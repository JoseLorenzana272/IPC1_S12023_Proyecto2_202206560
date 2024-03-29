/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.biblioteca;
import com.listasSimples.Categorias;
import com.listasSimples.Imagenes;
import com.listasSimples.NodoUsuario;
import static com.listasSimples.listaDoble.contador1;
import com.listasSimples.listaEnlazada;
import static com.listasSimples.listaEnlazada.*;
import com.menu.menu;
import java.awt.Image;
import java.awt.List;
import java.awt.PopupMenu;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerListModel;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author PERSONAL
 */
public class Biblioteca extends javax.swing.JFrame {
    
    private int imagenActual = 0;
    
    public Biblioteca() {
        initComponents();
        setLocationRelativeTo(null);
        com.menu.menu.lista.Mostrar2(com.menu.menu.usuario);
        lblUsuario.setText(com.menu.menu.lista.Mostrar(com.menu.menu.usuario));
        
        DefaultListModel<String> modelo=new DefaultListModel<>();
        String[] parts = com.menu.menu.lista.Mostrar(com.menu.menu.usuario).split("\n");
        for(int i = 0; i<contador; i++){
            modelo.addElement(parts[i]);
        }
        
        listaCat.setModel(modelo);
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCatnew = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        panelImg = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnsiguiente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnanterior = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnAgImg = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        panelCat = new javax.swing.JScrollPane();
        listaCat = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        cbImagen1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Categorías:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButton1.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jButton1.setText("Salir");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 80, 50));
        jPanel1.add(txtCatnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 100, -1));

        btnEliminar.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar Categoría");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 130, 30));

        panelImg.setBackground(new java.awt.Color(255, 255, 255));
        panelImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelImg.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 330));

        jPanel1.add(panelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 510, 330));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btnsiguiente.setBackground(new java.awt.Color(102, 102, 102));
        btnsiguiente.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnsiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsiguiente.setText(">");
        btnsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsiguienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnsiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnsiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 60, 330));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        btnanterior.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnanterior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnanterior.setText("<");
        btnanterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnanteriorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnanterior, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnanterior, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 60, 330));

        jButton3.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jButton3.setText("Eliminar Imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, 30));

        btnAgImg.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnAgImg.setText("Agregar Imagen");
        btnAgImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgImgActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, 30));

        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 90, -1));

        btnAgregar.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar Categoría");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 445, 130, 30));

        panelCat.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panelCat.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        listaCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCatMouseClicked(evt);
            }
        });
        panelCat.setViewportView(listaCat);

        jPanel1.add(panelCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 320));

        cbImagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbImagen1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cbImagen1);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 380, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu form1 = new menu();
        this.dispose();
        form1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String categoriaNew = txtCatnew.getText();
        com.menu.menu.lista.insertar(new Categorias(com.menu.menu.usuario, categoriaNew));
        
        //txtCat.setText(com.menu.menu.lista.Mostrar2(com.menu.menu.usuario));
        DefaultListModel<String> modelo=new DefaultListModel<>();
        String[] parts = com.menu.menu.lista.Mostrar(com.menu.menu.usuario).split("\n");
        for(int i = 0; i<contador; i++){
            modelo.addElement(parts[i]);
        }
        
        listaCat.setModel(modelo);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        try {
    
            String categoria2 = listaCat.getSelectedValue();
            com.menu.menu.lista.eliminar(com.menu.menu.usuario, categoria2);
            System.out.println(com.menu.menu.lista.Mostrar(com.menu.menu.usuario));
            DefaultListModel<String> modelo = new DefaultListModel<>();
            String[] parts = com.menu.menu.lista.Mostrar(com.menu.menu.usuario).split("\n");
            for (int i = 0; i < contador; i++) {
                modelo.addElement(parts[i]);
        }
        listaCat.setModel(modelo);
            
           String categoria3 = cbImagen1.getSelectedValue();
            com.menu.menu.listaD.Eliminar2(com.menu.menu.usuario, categoria3);
            DefaultListModel<String> modelo1 = new DefaultListModel<>();
            String[] parts2 = com.menu.menu.listaD.actComboBox(com.menu.menu.usuario, categoria2).split("\n");
            for (int i = 0; i < contador1; i++) {
                modelo1.addElement(parts2[i]);
            }
            cbImagen1.setModel(modelo1);
            lblImagen.setIcon(null);
            while (cbImagen1.getModel().getSize() > 0) {
                modelo1.removeElementAt(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione para Eliminar");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgImgActionPerformed
         
        
      // Crea una instancia del ImageIcon
        /*String ruta = "";
        String name = "";
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jFileChooser.setFileFilter(filtrado);
        
        int respuesta = jFileChooser.showOpenDialog(this);
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
            ruta = jFileChooser.getSelectedFile().getPath();
            name = jFileChooser.getSelectedFile().getName();
            Image mImagen = new ImageIcon(ruta).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(mIcono);
        }
        String categoria2 = listaCat.getSelectedValue();
        com.menu.menu.listaD.insertarFin(new Imagenes(com.menu.menu.usuario, categoria2, ruta, name));
        
        
        DefaultListModel<String> modelo1=new DefaultListModel<>();
        String[] parts2 = com.menu.menu.listaD.actComboBox(com.menu.menu.usuario, listaCat.getSelectedValue()).split("\n");
        for(int i = 0; i<contador1; i++){
            modelo1.addElement(parts2[i]);
        }
        
        cbImagen1.setModel(modelo1);*/

        // Crea una instancia del ImageIcon
        String[] rutas = null;
        String[] names = null;
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jFileChooser.setFileFilter(filtrado);
        jFileChooser.setMultiSelectionEnabled(true);
        
        int respuesta = jFileChooser.showOpenDialog(this);
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
            File[] files = jFileChooser.getSelectedFiles();
            int numFiles = files.length;
            rutas = new String[numFiles];
            names = new String[numFiles];
            for(int i = 0; i < numFiles; i++) {
                rutas[i] = files[i].getPath();
                names[i] = files[i].getName();
            }
            
            Image mImagen = new ImageIcon(rutas[0]).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(mIcono);
        }
        String categoria2 = listaCat.getSelectedValue();
        for(int i = 0; i < rutas.length; i++) {
            com.menu.menu.listaD.insertarFin(new Imagenes(com.menu.menu.usuario, categoria2, rutas[i], names[i]));
        }
        
        DefaultListModel<String> modelo1=new DefaultListModel<>();
        String[] parts2 = com.menu.menu.listaD.actComboBox(com.menu.menu.usuario, listaCat.getSelectedValue()).split("\n");
        for(int i = 0; i < contador1; i++){
            modelo1.addElement(parts2[i]);
        }
        
        cbImagen1.setModel(modelo1);
        
    }//GEN-LAST:event_btnAgImgActionPerformed

    private void listaCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCatMouseClicked
        
            
            lblImagen.setIcon(null);
            /*cbImagen.removeAllItems();
            String[] parts = com.menu.menu.listaD.actComboBox(com.menu.menu.usuario, listaCat.getSelectedValue()).split("\n");
            for (int i = 0; i < contador1; i++) {
                cbImagen.addItem(parts[i]);
            }*/
        DefaultListModel<String> modelo1 = new DefaultListModel<>();
        String[] parts2 = com.menu.menu.listaD.actComboBox(com.menu.menu.usuario, listaCat.getSelectedValue()).split("\n");
        for (int i = 0; i < contador1; i++) {
            modelo1.addElement(parts2[i]);
        }

        cbImagen1.setModel(modelo1);

      
    }//GEN-LAST:event_listaCatMouseClicked

    private void cbImagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbImagen1MouseClicked
       
        String categoria3 = cbImagen1.getSelectedValue();
        String rutaRana = com.menu.menu.listaD.MostrarCombo(com.menu.menu.usuario, listaCat.getSelectedValue(), categoria3);
        Image mImagen = new ImageIcon(rutaRana).getImage();
        ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
        lblImagen.setIcon(mIcono);
    }//GEN-LAST:event_cbImagen1MouseClicked

    private void btnanteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnanteriorMouseClicked
        imagenActual--;
        if (imagenActual < 0) {
            imagenActual = cbImagen1.getModel().getSize() - 1; // si se llega al inicio de la lista, se muestra la última imagen
        }
        mostrarImagenActual();
    }//GEN-LAST:event_btnanteriorMouseClicked

    private void btnsiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguienteMouseClicked
        imagenActual++;
        if (imagenActual >= cbImagen1.getModel().getSize()) {
            imagenActual = 0; // si se llega al final de la lista, se muestra la primera imagen
        }
        mostrarImagenActual();
    }//GEN-LAST:event_btnsiguienteMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String categoria3 = cbImagen1.getSelectedValue();
        com.menu.menu.listaD.Eliminar(com.menu.menu.usuario, listaCat.getSelectedValue(), categoria3);
        DefaultListModel<String> modelo1 = new DefaultListModel<>();
        String[] parts2 = com.menu.menu.listaD.actComboBox(com.menu.menu.usuario, listaCat.getSelectedValue()).split("\n");
        for (int i = 0; i < contador1; i++) {
            modelo1.addElement(parts2[i]);
        }

        cbImagen1.setModel(modelo1);
        lblImagen.setIcon(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void mostrarImagenActual() {
        if (cbImagen1.getModel().getSize() > 0) {
            String nombreImagen = cbImagen1.getModel().getElementAt(imagenActual);
            String rutaImagen = com.menu.menu.listaD.MostrarCombo(com.menu.menu.usuario, listaCat.getSelectedValue(), nombreImagen);
            Image imagen = new ImageIcon(rutaImagen).getImage();
            ImageIcon icono = new ImageIcon(imagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
            lblImagen.setIcon(icono);
        }
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
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgImg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel btnanterior;
    private javax.swing.JLabel btnsiguiente;
    private javax.swing.JList<String> cbImagen1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList<String> listaCat;
    private javax.swing.JScrollPane panelCat;
    private javax.swing.JPanel panelImg;
    private javax.swing.JTextField txtCatnew;
    // End of variables declaration//GEN-END:variables
}

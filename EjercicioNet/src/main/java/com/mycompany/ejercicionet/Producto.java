/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejercicionet;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author at10DAM2
 */
public class Producto extends javax.swing.JFrame {

    /**
     * Creates new form java
     */
    public Producto() {
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

        menuBarra = new javax.swing.JMenuBar();
        menuBarraArchivo = new javax.swing.JMenu();
        menuBarraVehiculos = new javax.swing.JMenuItem();
        menuBarraSalir = new javax.swing.JMenuItem();
        menuBarraArchivos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBarra.setBorderPainted(false);

        menuBarraArchivo.setText("File");

        menuBarraVehiculos.setText("Vehiculos");
        menuBarraVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarraVehiculosActionPerformed(evt);
            }
        });
        menuBarraArchivo.add(menuBarraVehiculos);

        menuBarraSalir.setText("Salir");
        menuBarraSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarraSalirActionPerformed(evt);
            }
        });
        menuBarraArchivo.add(menuBarraSalir);

        menuBarraArchivos.setText("Abrir");
        menuBarraArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarraArchivosActionPerformed(evt);
            }
        });
        menuBarraArchivo.add(menuBarraArchivos);

        menuBarra.add(menuBarraArchivo);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBarraVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarraVehiculosActionPerformed
        Vehiculos vehiculo = new Vehiculos() ;
        vehiculo.setVisible (true);
    }//GEN-LAST:event_menuBarraVehiculosActionPerformed

    private void menuBarraSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarraSalirActionPerformed
        dispose();
    }//GEN-LAST:event_menuBarraSalirActionPerformed

    private void menuBarraArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarraArchivosActionPerformed
        JFileChooser fc = new JFileChooser() ;
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("bla", "txt");
        
        fc.setFileFilter(filtro);
        int option = fc.showOpenDialog(menuBarraArchivos);
        
        if (option == JFileChooser.APPROVE_OPTION){
        File file = fc.getSelectedFile();
        System.out.println(file.getAbsolutePath());
        }
    }//GEN-LAST:event_menuBarraArchivosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuBarraArchivo;
    private javax.swing.JMenuItem menuBarraArchivos;
    private javax.swing.JMenuItem menuBarraSalir;
    private javax.swing.JMenuItem menuBarraVehiculos;
    // End of variables declaration//GEN-END:variables
}
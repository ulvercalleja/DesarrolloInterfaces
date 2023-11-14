/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenjavaswing;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author at10DAM2
 */
public class ExamenJavaSwing {

    public static void main(String[] args) {
        // 1. Declarar
        JFrame frameExamen = new JFrame("Examen Java Swing");
        frameExamen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameExamen.setSize(500, 600);
        frameExamen.setResizable(true);
        
        JPanel panelExamen = new JPanel();
        
        JLabel escribeTituloLabel = new JLabel("Escribe tu titulo: ");
        panelExamen.add(escribeTituloLabel);
        
        JTextField campoTexto = new JTextField(15);
        panelExamen.add(campoTexto);
        
        JButton cambiaBoton = new JButton("Cambia!");
        panelExamen.add(cambiaBoton);
        JButton minimizarBoton = new JButton("Minimizar!");
        panelExamen.add(minimizarBoton);
        JButton cerrarBoton = new JButton("Cerrar");
        panelExamen.add(cerrarBoton);
        
        JLabel colorFondoLabel = new JLabel("Selecciona el color de fondo: ");
        panelExamen.add(colorFondoLabel);
        JComboBox coloresCombo = new JComboBox();
        coloresCombo.addItem("");
        coloresCombo.addItem("Rojo");
        coloresCombo.addItem("Azul");
        coloresCombo.addItem("Verde");
        coloresCombo.addItem("Amarillo");
        panelExamen.add(coloresCombo);
        
        JButton mensajeBoton = new JButton("Mensaje");
        panelExamen.add(mensajeBoton);
        
        frameExamen.add(panelExamen);
        
        //2. Lógica
        cambiaBoton.addActionListener((ActionEvent e) -> {
            String tituloStr = campoTexto.getText();
            if (tituloStr.isEmpty()){
                JOptionPane.showMessageDialog(frameExamen, "No ha introducido ningun titulo.");
            }else {
                frameExamen.setTitle(tituloStr);
            }
        });
        
        minimizarBoton.addActionListener((ActionEvent e) -> {
            frameExamen.setExtendedState(JFrame.ICONIFIED);
            cambiaBoton.setEnabled(false);
        });
        
        coloresCombo.addActionListener((ActionEvent e) -> {
            panelExamen.setBackground(Color.RED);
        });
        
        mensajeBoton.addActionListener((ActionEvent e) -> {
            int opcion = JOptionPane.showConfirmDialog(frameExamen, "Este examen es demasiado sencillo","TITULO OPCION",JOptionPane.YES_NO_CANCEL_OPTION);
            /*if (opcion == 0){
                
            }
            if (opcion == 1){
                
            }
            if (opcion == 2){
                
            }*/
        });
        frameExamen.setVisible(true);
    }
}

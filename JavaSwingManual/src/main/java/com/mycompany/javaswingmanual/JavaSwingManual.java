/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaswingmanual;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author at10DAM2
 */
public class JavaSwingManual {

    public static void main(String[] args) {
        
        //1. Inicializacion de elementos por pantalla
        
        JFrame frame = new JFrame("Prueba Java Swing");
        // Hacer visible la ventana
        frame.setVisible(true);
        // Configurar la operación de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Configurar el tamaño de la ventana
        frame.setSize(600, 600);
        frame.setResizable(true);
        
        JPanel panel = new JPanel();
        
        // Crear componentes de la interfaz y Agregar los componentes a la ventana
        JLabel textoMarca = new JLabel("Marca");
        panel.add(textoMarca);
        
        JTextField tfMarca = new JTextField(15);
        panel.add(tfMarca);
        
        JLabel textoModelo = new JLabel("Modelo");
        panel.add(textoModelo);
        
        JTextField tfModelo = new JTextField(15);
        panel.add(tfModelo);
        
        JComboBox comboColor = new JComboBox();
        comboColor.addItem("Rojo");
        comboColor.addItem("Verde");
        comboColor.addItem("Azul");
        comboColor.addItem("Amarillo");
        comboColor.addItem("Naranja");
        comboColor.addItem("Negro");
        comboColor.addItem("Blanco");
        comboColor.addItem("Gris");
        panel.add(comboColor);
         
        JCheckBox chkCoche = new JCheckBox("Coche");
        JCheckBox chkMoto = new JCheckBox("Moto");
        JCheckBox chkCamion = new JCheckBox("Camion");
        
        ButtonGroup grupoVehiculos = new ButtonGroup();
        grupoVehiculos.add(chkCoche);
        grupoVehiculos.add(chkMoto);
        grupoVehiculos.add(chkCamion);
        
        panel.add(chkCoche);
        panel.add(chkMoto);
        panel.add(chkCamion);
        
        JCheckBox chkRemolque = new JCheckBox("Remolque");
        JCheckBox chkCapota = new JCheckBox("Capota");
        JCheckBox chkSidecar = new JCheckBox("Sidecar");
        
        ButtonGroup grupoExtras = new ButtonGroup();
        grupoExtras.add(chkRemolque);
        grupoExtras.add(chkCapota);
        grupoExtras.add(chkSidecar);
        
        panel.add(chkRemolque);
        panel.add(chkCapota);
        panel.add(chkSidecar);
        
        JRadioButton rdbGasolina = new JRadioButton("Gasolina");
        JRadioButton rdbElectrico = new JRadioButton("Electrico");
        JRadioButton rdbDiesel = new JRadioButton("Diesel");
        
        ButtonGroup grupoCarburante = new ButtonGroup();
        grupoCarburante.add(rdbGasolina);
        grupoCarburante.add(rdbElectrico);
        grupoCarburante.add(rdbDiesel);
        
        panel.add(rdbGasolina);
        panel.add(rdbElectrico);
        panel.add(rdbDiesel);
        
        JButton btSacarInfo = new JButton("Sacar Info");
        panel.add(btSacarInfo);
        
        JButton btReset = new JButton("Reset");
        panel.add(btReset);
        
        frame.add(panel);
        
        //3. Añadir a los elementos que sea necesario, los escuchadores.
        btSacarInfo.addActionListener(){
            public void actionPerformed (ActionEvent e){
            switch (comboColor.getSelectedIndex()) {
                case 0:
                    break;
                case 1:
                    break;
                default:
            }
            }
        };
    }
}

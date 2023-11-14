/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaswingmanual;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author at10DAM2
 */
public class JavaSwingManual {

    public static void main(String[] args) {
        
        //1. Inicializacion de elementos por pantalla
        
        JFrame frame = new JFrame("Prueba Java Swing");
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
        
        JButton btActualizar = new JButton("Actualizar");
        panel.add(btActualizar);
        
        JButton btBorrarLineas = new JButton("Borrar Lineas");
        panel.add(btBorrarLineas);
        
        DefaultTableModel modeloDatos = new DefaultTableModel();
        modeloDatos.addColumn("Marca");
        modeloDatos.addColumn("Modelo");
        modeloDatos.addColumn("Vehiculo");
        modeloDatos.addColumn("Extra");
        modeloDatos.addColumn("Carburante");
        JTable tabla = new JTable(modeloDatos);
        JScrollPane scrollPane = new JScrollPane(tabla);
        panel.add(scrollPane);
        
        frame.add(panel);
        //3. Añadir a los elementos que sea necesario, los escuchadores.
        chkCoche.addActionListener((ActionEvent e) -> {
            if (chkCoche.isSelected()) {
                chkCapota.setEnabled(true);
                chkRemolque.setEnabled(true);
                chkSidecar.setSelected(false);
                chkSidecar.setEnabled(false);
            }
        });

        chkMoto.addActionListener((ActionEvent e) -> {
            if (chkMoto.isSelected()) {
                chkSidecar.setEnabled(true);
                chkCapota.setSelected(false);
                chkCapota.setEnabled(false);
                chkRemolque.setSelected(false);
                chkRemolque.setEnabled(false);
            }
        });

        chkCamion.addActionListener((ActionEvent e) -> {
            if (chkCamion.isSelected()) {
                chkRemolque.setEnabled(true);
                chkCapota.setSelected(false);
                chkCapota.setEnabled(false);
                chkSidecar.setSelected(false);
                chkSidecar.setEnabled(false);
            }
        });
        
        btSacarInfo.addActionListener((ActionEvent e) -> {
            
            String vehiculo = "";
            if (chkCoche.isSelected()){
                vehiculo = "Coche"; 
            } else if (chkMoto.isSelected()){
                vehiculo = "Moto"; 
            } else if (chkCamion.isSelected()){
                vehiculo = "Camion"; 
            };
            String extra = "";
            if (chkRemolque.isSelected()){
                extra = "Remolque"; 
            } else if (chkCapota.isSelected()){
                extra = "Capota"; 
            } else if (chkSidecar.isSelected()){
                extra = "Sidecar"; 
            };
            String carburante = "";
            if (rdbGasolina.isSelected()){
                carburante = "Gasolina"; 
            } else if (rdbElectrico.isSelected()){
                carburante = "Electrico"; 
            } else if (rdbDiesel.isSelected()){
                carburante = "Diesel"; 
            };
        
            modeloDatos.addRow(new Object[]{tfMarca.getText(),tfModelo.getText(),vehiculo,extra,carburante});
            
             switch (comboColor.getSelectedIndex()) {
                    case 0:
                        panel.setBackground(Color.RED);
                        break;
                    case 1:
                        panel.setBackground(Color.GREEN);
                        break;
                    case 2:
                        panel.setBackground(Color.BLUE);
                        break;
                    case 3:
                        panel.setBackground(Color.YELLOW);
                        break;
                    case 4:
                        panel.setBackground(Color.ORANGE);
                        break;
                    case 5:
                        panel.setBackground(Color.BLACK);
                        break;
                    case 6:
                        panel.setBackground(Color.WHITE);
                        break;
                    case 7:
                        panel.setBackground(Color.GRAY);
                        break;
                    default:
                        break;
                }
        });
        
        btReset.addActionListener((ActionEvent e) -> {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea RESETEAR?",
                "OK_CANCEL_OPTION", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
            
                if (respuesta == 0){
                    tfMarca.setText("");
                    tfModelo.setText("");
                    grupoVehiculos.clearSelection();
                    grupoExtras.clearSelection();
                    chkSidecar.setEnabled(true);
                    chkCapota.setEnabled(true);
                    chkRemolque.setEnabled(true);
                    grupoCarburante.clearSelection();
                    
                    JOptionPane.showMessageDialog(null, "Usted ha decidido resetear",
                            "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                }
        });
        
        btActualizar.addActionListener((ActionEvent e) -> {
                String vehiculo = "";
                if (chkCoche.isSelected()) {
                    vehiculo = "Coche";
                } else if (chkMoto.isSelected()) {
                    vehiculo = "Moto";
                } else if (chkCamion.isSelected()) {
                    vehiculo = "Camion";
                }
                
                String extra = "";
                if (chkRemolque.isSelected()) {
                    extra = "Remolque";
                } else if (chkCapota.isSelected()) {
                    extra = "Capota";
                } else if (chkSidecar.isSelected()) {
                    extra = "Sidecar";
                }
                
                String carburante = "";
                if (rdbGasolina.isSelected()) {
                    carburante = "Gasolina";
                } else if (rdbElectrico.isSelected()) {
                    carburante = "Electrico";
                } else if (rdbDiesel.isSelected()) {
                    carburante = "Diesel";
                }

                int filaSeleccionada = tabla.getSelectedRow();
                if (filaSeleccionada != -1) {
                    // Actualizar los datos en la fila seleccionada
                    modeloDatos.setValueAt(tfMarca.getText(), filaSeleccionada, 0);
                    modeloDatos.setValueAt(tfModelo.getText(), filaSeleccionada, 1);
                    modeloDatos.setValueAt(vehiculo, filaSeleccionada, 2);
                    modeloDatos.setValueAt(extra, filaSeleccionada, 3);
                    modeloDatos.setValueAt(carburante, filaSeleccionada, 4);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR intenado actualizar linea, por favor seleccione una linea.");
                }
        });
        
        btBorrarLineas.addActionListener((ActionEvent e) -> {
            try {
                int filaSeleccionada = tabla.getSelectedRow();
                modeloDatos.removeRow(filaSeleccionada);
            } catch (ArrayIndexOutOfBoundsException error) {
                if (tabla.getRowCount() == 0){
                    JOptionPane.showMessageDialog(null, "ERROR intenado borrar linea: " + error.getMessage());
                }
            }
        });
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}

package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaModificarInformacion {
    private JButton nombreCafeteriaButton;
    private JButton stockButton;
    private JButton preciosButton;
    private JButton modificarButton;
    private JButton regresarButton;

    public VentanaModificarInformacion() {
        nombreCafeteriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        stockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        preciosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void ModificarNombreCafeteria(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la cafeteria");
        JOptionPane.showMessageDialog(null, "Nombre de la cafeteria modificado exitosamente");
    }



}

package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDescontinuarCafe {
    private JButton descontinuarCafeButton;
    private JPanel panel1;
    private JButton regresarButton;

    public void mostrar() {
        JFrame frame = new JFrame("VentanaDescontinuarCafe");
        frame.setContentPane(new VentanaDescontinuarCafe().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void setDescontinuarCafeButton(JButton descontinuarCafeButton) {
        this.descontinuarCafeButton = descontinuarCafeButton;
    }

    public void setRegresarButton(JButton regresarButton) {
        this.regresarButton = regresarButton;
    }
    public void descontinuarCafe(){
        JOptionPane.showMessageDialog(null, "Cafe descontinuado exitosamente");
    }
    public void regresar(){
        VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
        ventanaBienvenida.mostrar();
    }
}

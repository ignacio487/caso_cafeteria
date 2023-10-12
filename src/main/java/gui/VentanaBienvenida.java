package gui;

import javax.swing.*;

public class VentanaBienvenida {
    private JButton busquedaDeCafeButton;
    private JButton registroDeCafeButton;

    public void mostrar() {
        JFrame frame = new JFrame("VentanaBienvenida");
        frame.setContentPane(new VentanaBienvenida().busquedaDeCafeButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
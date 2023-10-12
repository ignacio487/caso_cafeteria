package gui;

import javax.swing.*;

public class VentanaBusquedaCafe {
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton buscarButton;
    private JButton regresarButton;

    public void mostrar() {
        JFrame frame = new JFrame("VentanaBusquedaCafe");
        frame.setContentPane(new VentanaBusquedaCafe().buscarButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
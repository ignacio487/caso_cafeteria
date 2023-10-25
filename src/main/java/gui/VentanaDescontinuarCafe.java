package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDescontinuarCafe {
    private JButton descontinuarCafeButton;
    private JPanel panel1;
    private JButton regresarButton;

    public VentanaDescontinuarCafe() {
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        descontinuarCafeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

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
}

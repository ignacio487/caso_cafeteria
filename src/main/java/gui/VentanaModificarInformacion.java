package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class VentanaModificarInformacion {
    private JButton nombreCafeteriaButton;
    private JButton stockButton;
    private JButton preciosButton;
    private JButton modificarButton;
    private JButton regresarButton;
    Connection con;
    public void ModificarNombreCafeteria(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la cafeteria");
        JOptionPane.showMessageDialog(null, "Nombre de la cafeteria modificado exitosamente");
    }
public void ModificarStock(){
        String stock = JOptionPane.showInputDialog("Ingrese el nuevo stock de la cafeteria");
        JOptionPane.showMessageDialog(null, "Stock de la cafeteria modificado exitosamente");
    }
    public void ModificarPrecios(){
        String precios = JOptionPane.showInputDialog("Ingrese el nuevo precio de la cafeteria");
        JOptionPane.showMessageDialog(null, "Precio de la cafeteria modificado exitosamente");
    }
    public void mostrar() {
        JFrame frame = new JFrame("VentanaModificarInformacion");
        frame.setContentPane(new VentanaModificarInformacion().regresarButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public void setNombreCafeteriaButton(JButton nombreCafeteriaButton) {
        this.nombreCafeteriaButton = nombreCafeteriaButton;
    }
    public void setStockButton(JButton stockButton) {
        this.stockButton = stockButton;
    }
    public void setPreciosButton(JButton preciosButton) {
        this.preciosButton = preciosButton;
    }
    public void setModificarButton(JButton modificarButton) {
        this.modificarButton = modificarButton;
    }
    public void setRegresarButton(JButton regresarButton) {
        this.regresarButton = regresarButton;
    }
    public void setCon(Connection con) {
        this.con = con;
    }
    public void regresar(){
        VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
        ventanaBienvenida.mostrar();
    }
}

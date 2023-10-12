package gui;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VentanaRegistroCafe {
    Connection con;
    DefaultListModel mod = new DefaultListModel();
    Statement statement;
    ResultSet resultSet;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton regresarButton;
    private JButton registrarButton;
    private Container panel;

    public void VentanaRegistroCafe() {
        JFrame frame = new JFrame("VentanaRegistroCafe");
        frame.setContentPane(new VentanaRegistroCafe().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void registrarCafe(){
        conectar();
        String nombre = textField1.getText();
        String tipo = comboBox1.getSelectedItem().toString();
        String origen = textField2.getText();
        String precio = comboBox2.getSelectedItem().toString();
        String sql = "INSERT INTO cafe (nombre, tipo, origen, precio) VALUES ('"+nombre+"','"+tipo+"','"+origen+"','"+precio+"')";
        try{
            con.createStatement().execute(sql);
            JOptionPane.showMessageDialog(null, "Cafe ingresado exitosamente");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al ingresar cafe");
        }
    }

    private void conectar() {
    }
}
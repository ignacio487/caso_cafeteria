package gui;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VentanaBusquedaCafe {
    Connection con;
    DefaultListModel mod = new DefaultListModel();
    Statement statement;
    ResultSet resultSet;
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

    public void buscarCafe(){
        conectar();
        String tipo = comboBox1.getSelectedItem().toString();
        String precio = comboBox2.getSelectedItem().toString();
        String sql = "SELECT * FROM cafe WHERE tipo = '"+tipo+"' AND precio = '"+precio+"'";
        try{
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                mod.addElement(resultSet.getString(2));
            }
            JOptionPane.showMessageDialog(null, "Cafe encontrado");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al buscar cafe");
        }
    }

    private void conectar() {
    }
}
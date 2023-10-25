package org.example;

import controlador.CafeteriaControlador;
import modelo.Cafe;
import modelo.Cafeteria;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Cafeteria
        Cafeteria cafeteria = new Cafeteria();

        // Crear una instancia de CafeteriaControlador
        CafeteriaControlador controlador = new CafeteriaControlador(cafeteria);

        // Agregar algunos cafés a la cafetería
        Cafe cafe1 = new Cafe("Cafe1", "Grande", "Información Café 1");
        Cafe cafe2 = new Cafe("Cafe2", "Mediano", "Información Café 2");
        cafeteria.agregarCafe(cafe1);
        cafeteria.agregarCafe(cafe2);

        // Obtener un café por nombre
        Cafe cafeObtenido = controlador.obtenerCafe("Cafe1");

        if (cafeObtenido != null) {
            System.out.println("Café encontrado: " + cafeObtenido.getNombre());
        } else {
            System.out.println("Café no encontrado");
        }

        // Modificar la información de un café
        if (cafeObtenido != null) {
            controlador.modificarInformacion(cafeObtenido, "Nueva información del café");
            System.out.println("Información del café modificada.");
        }

        // Obtener cafés por tamaño
        ArrayList<Cafe> cafesGrandes = controlador.obtenerCafesPorTamaño("Grande");
        System.out.println("Cafés Grandes:");
        for (Cafe cafe : cafesGrandes) {
            System.out.println("Nombre: " + cafe.getNombre());
        }
    }
}
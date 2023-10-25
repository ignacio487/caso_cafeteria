package org.example;

import controlador.CafeteriaControlador;
import modelo.Cafe;
import modelo.Cafeteria;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();

        CafeteriaControlador controlador = new CafeteriaControlador(cafeteria);

        Cafe cafe1 = new Cafe("Cafe1", "Grande", "Información Café 1");
        Cafe cafe2 = new Cafe("Cafe2", "Mediano", "Información Café 2");
        cafeteria.agregarCafe(cafe1);
        cafeteria.agregarCafe(cafe2);

        Cafe cafeObtenido = controlador.obtenerCafe("Cafe1");

        if (cafeObtenido != null) {
            System.out.println("Café encontrado: " + cafeObtenido.getNombre());
        } else {
            System.out.println("Café no encontrado");
        }

        if (cafeObtenido != null) {
            controlador.modificarInformacion(cafeObtenido, "Nueva información de la cafeteria");
            System.out.println("Información de la cafeteria modificada.");
        }

        ArrayList<Cafe> cafesGrandes = controlador.obtenerCafesPorTamaño("Grande");
        System.out.println("Cafés Grandes:");
        for (Cafe cafe : cafesGrandes) {
            System.out.println("Nombre: " + cafe.getNombre());
        }
    }
}
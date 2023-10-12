package controlador;

import modelo.Cafe;

import java.util.ArrayList;
import modelo.Cafeteria;

public class CafeteriaControlador {

	public Cafe obtenerCafe() {
		for (Cafe cafe : cafeteria.getListaDeCafés()) {
			if (cafe.getNombre().equals(nombre)) {
				return cafe;
			}
		}
		return null;
	}

	public ArrayList<Cafe> obtenerCafes(String tamaño) {
		ArrayList<Cafe> cafésPorTamaño = new ArrayList<>();
		for (Cafe cafe : cafeteria.getListaDeCafés()) {
			if (cafe.getTamaño().equals(tamaño)) {
				cafésPorTamaño.add(cafe);
			}
		}
		return cafésPorTamaño;
	}


	public void descontinuarCafe() {
		Cafe cafeADescontinuar = obtenerCafe(nombre);
		if (cafeADescontinuar != null) {
			cafeteria.getListaDeCafés().remove(cafeADescontinuar);
		}
	}

	public void modificarInformacion() {

	}
}
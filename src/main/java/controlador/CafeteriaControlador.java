package controlador;

import modelo.Cafe;

import java.util.ArrayList;

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
		Cafe caféADescontinuar = obtenerCafe(nombre);
		if (caféADescontinuar != null) {
			cafeteria.getListaDeCafés().remove(caféADescontinuar);
		}
	}

	public void modificarInformacion() {

	}
}
package controlador;

import modelo.Cafe;
import modelo.Cafeteria;

import java.util.ArrayList;

public class CafeteriaControlador {

	private Cafeteria cafeteria;

	public CafeteriaControlador(Cafeteria cafeteria) {
		this.cafeteria = cafeteria;
	}

	public Cafe agregarCafe(String nombre, String tamaño, String ingredientesOpcionales) {
		Cafe cafe = new Cafe(nombre, tamaño, ingredientesOpcionales);
		cafeteria.agregarCafe(cafe);
		return cafe;
	}

	public Cafe obtenerCafe(String nombre) {
		for (Cafe cafe : cafeteria.getListaDeCafes()) {
			if (cafe.getNombre().equals(nombre)) {
				return cafe;
			}
		}
		return null;
	}

	public ArrayList<Cafe> obtenerCafesPorTamaño(String tamaño) {
		ArrayList<Cafe> cafésPorTamaño = new ArrayList<>();
		for (Cafe cafe : cafeteria.getListaDeCafes()) {
			if (cafe.getTamaño().equals(tamaño)) {
				cafésPorTamaño.add(cafe);
			}
		}
		return cafésPorTamaño;
	}

	public void descontinuarCafe(String nombre) {
		Cafe cafeADescontinuar = obtenerCafe(nombre);
		if (cafeADescontinuar != null) {
			cafeteria.getListaDeCafes().remove(cafeADescontinuar);
		} else {
			System.out.println("No existe el café");
		}
	}

	public void modificarInformacion(Cafe cafe, String nuevaInformacion) {
		cafe.setNombre(nuevaInformacion);
	}

	public static void main(String[] args) {
		Cafeteria cafeteria = new Cafeteria();
		CafeteriaControlador controlador = new CafeteriaControlador(cafeteria);
		Cafe cafeObtenido = controlador.obtenerCafe("Cafe1");

		if (cafeObtenido != null) {
			System.out.println("Café encontrado: " + cafeObtenido.getNombre());
		} else {
			System.out.println("Café no encontrado");
		}

		if (cafeObtenido != null) {
			controlador.modificarInformacion(cafeObtenido, "Nueva información del café");
			System.out.println("Información del café modificada.");
		}
	}
}
package modelo;

import java.util.ArrayList;
import java.util.Vector;
import modelo.Cafe;

public class Cafeteria {
	private String nombre;
	private String direccion;
	private String redSocial;
	private ArrayList<Cafe> listaDeCafes;
	private Vector<Cafe> cafe = new Vector<Cafe>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRedSocial() {
		return this.redSocial;
	}

	public void setRedSocial(String redSocial) {
		this.redSocial = redSocial;
	}

	public Cafeteria(String nombre, String direccion, String redSocial) {
		throw new UnsupportedOperationException();
	}
}
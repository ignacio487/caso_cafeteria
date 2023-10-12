package modelo;

public class Cafe {
	private int gramosDeCafe;
	private int mililitrosDeAgua;
	private String tamaño;
	private String ingredientesOpcionales;

	public int getGramosDeCafe() {
		return this.gramosDeCafe;
	}

	public void setGramosDeCafe(int gramosDeCafe) {
		this.gramosDeCafe = gramosDeCafe;
	}

	public int getMililitrosDeAgua() {
		return this.mililitrosDeAgua;
	}

	public void setMililitrosDeAgua(int mililitrosDeAgua) {
		this.mililitrosDeAgua = mililitrosDeAgua;
	}

	public String getTamaño() {
		return this.tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getIngredientesOpcionales() {
		return this.ingredientesOpcionales;
	}

	public void setIngredientesOpcionales(String ingredientesOpcionales) {
		this.ingredientesOpcionales = ingredientesOpcionales;
	}

	public Cafe(int gramosDeCafe, int mililitrosDeAgua, String tamaño, String ingredientesOpcionales) {
		throw new UnsupportedOperationException();
	}
}
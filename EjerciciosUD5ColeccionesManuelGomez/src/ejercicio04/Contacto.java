package ejercicio04;

public class Contacto {

	private String nombre;
	private String numTelf;

	public Contacto(String nombre, String numTelf) {
		super();
		this.nombre = nombre;
		this.numTelf = numTelf;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumTelf() {
		return numTelf;
	}

	public void setNumTelf(String numTelf) {
		this.numTelf = numTelf;
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre + " Número de Teléfono:" + numTelf;
	}

}

package ejmap;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(nombre, numTelf);
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", numTelf=" + numTelf + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(numTelf, other.numTelf);
	}

}

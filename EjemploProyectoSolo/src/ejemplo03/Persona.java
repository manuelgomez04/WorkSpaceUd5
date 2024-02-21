package ejemplo03;

import java.util.List;

public class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	private List<Viaje> listaV;

	public Persona(String nombre, String apellidos, String dni, int edad, List<Viaje> listaV) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.listaV = listaV;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<Viaje> getListaV() {
		return listaV;
	}

	public void setListaV(List<Viaje> listaV) {
		this.listaV = listaV;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", edad=" + edad
				+ ", listaV=" + listaV + "]";
	}

	public void addViaje(Viaje v) {
		listaV.add(v);
	}
}

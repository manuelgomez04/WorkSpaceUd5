package ejercicio05;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String apellidos;
	private String DNI;
	private int edad;

	public Persona(String nombre, String apellidos, String dNI, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.edad = edad;
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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Persona p) {
		return (this.getNombre().toLowerCase().compareTo(p.getNombre().toLowerCase()));
	}

}
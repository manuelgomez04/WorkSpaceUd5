package ejercicio03;

public class Alumno {

	private String nombre;
	private double notaMedia;
	private String dni;

	public Alumno(String nombre, double notaMedia, String dni) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + ", dni=" + dni + "]";
	}

}

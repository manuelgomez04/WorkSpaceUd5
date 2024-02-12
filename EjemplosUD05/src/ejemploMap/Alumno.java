package ejemploMap;

public class Alumno {

	private int id;
	private String nombre;
	private double NotaMedia;

	public Alumno(int id, String nombre, double notaMedia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.NotaMedia = notaMedia;

	}

	public double getNotaMedia() {
		return NotaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		NotaMedia = notaMedia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", NotaMedia=" + NotaMedia + "]";
	}
}

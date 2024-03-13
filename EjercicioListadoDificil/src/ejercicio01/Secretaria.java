package ejercicio01;

import java.util.Comparator;
import java.util.List;

public class Secretaria {
	private List<Alumno> listaAlumno;

	public Secretaria(List<Alumno> listaAlumnos) {
		super();
		this.listaAlumno = listaAlumnos;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumno;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumno = listaAlumnos;
	}

	@Override
	public String toString() {
		return "Secretaria [listaAlumnos=" + listaAlumno + "]";
	}

	public List<Alumno> filterPorCurso(String nombre) {
		return listaAlumno.stream().filter(alumno -> alumno.getNombreCurso().equalsIgnoreCase(nombre)).toList();
	}

	public void mostrarAlumnos() {

		listaAlumno.stream().forEach(System.out::println);
	}

	public List<Alumno> alumnosNombreEmpiezaIgual(String inicio) {

		return listaAlumno.stream().filter(alumno -> alumno.getNombre().startsWith(inicio)).toList();
	}

	public double contarTamañoLista() {
		return listaAlumno.stream().count();
	}

	public void imprimirLista(List<Alumno> lista) {
		lista.stream().forEach(System.out::println);
	}

	public List<Alumno> filtrarMediaMayorNueve() {
		return listaAlumno.stream().filter(a -> a.getNotaMedia() > 9 && a.getNombreCurso().equalsIgnoreCase("1DAM"))
				.toList();
	}

	public List<Alumno> AlumnosLimit(int limite) {
		return listaAlumno.stream().limit(limite).toList();
	}

	public Alumno alumnoMenor() {

		Comparator<Alumno> compararEdades = Comparator.comparing(Alumno::getEdad)
				.thenComparing(Comparator.comparing(Alumno::getNombre));
		return listaAlumno.stream().min(compararEdades).get();
	}

	public Alumno primerAlumno() {
		return listaAlumno.stream().findFirst().get();
	}

	public List<Alumno> nombreMayorDiez() {

		return listaAlumno.stream().filter(a -> a.getNombre().length() > 10).toList();
	}

	public List<Alumno> nombreAYMenorSeis() {
		return listaAlumno.stream().filter(a -> a.getNombre().startsWith("A") && a.getNombre().length() < 6).toList();
	}

	public void eliminar(Alumno a) {
		listaAlumno.remove(a);
	}

}

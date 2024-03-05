package ejercicioSet;

import java.util.HashSet;
import java.util.Set;

public class CrudAlumno {

	private Set<Alumno> listaAlumno;

	public CrudAlumno(Set<Alumno> listaAlumno) {
		super();
		this.listaAlumno = listaAlumno;
	}

	public Set<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(Set<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	@Override
	public String toString() {
		return "CrudAlumno [listaAlumno=" + listaAlumno + "]";
	}

	public void addAlumno(Alumno a) {
		listaAlumno.add(a);
	}

	public Alumno findAlumno(String dni) {
		for (Alumno alumno : listaAlumno) {
			if (alumno.getDni().equalsIgnoreCase(dni)) {
				return alumno;
			}
		}
		return null;
	}

	public Set<Alumno> findAlumnoNombre(String nombre) {

		Set<Alumno> listaBuscada = new HashSet<Alumno>();
		for (Alumno alumno : listaAlumno) {
			if (alumno.getNombre().equalsIgnoreCase(nombre)) {
				listaBuscada.add(alumno);
			}
		}
		return listaBuscada;
	}
}

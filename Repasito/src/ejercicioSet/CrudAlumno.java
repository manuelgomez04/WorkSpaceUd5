package ejercicioSet;

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

	public void findAlumnoIt(String dni) {

	}
}

package ejercicio03;

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

	public String toString() {
		return "CrudAlumno [listaAlumno=" + listaAlumno + "]";
	}

	public void addAlumno(Alumno a) {
		listaAlumno.add(a);
	}

	public Alumno buscarAlumnoDni(String dni) {

		if (listaAlumno.size() != 0) {

			for (Alumno alumno : listaAlumno) {
				if (alumno.getDni().equalsIgnoreCase(dni)) {
					return alumno;
				}
			}
		}
		return null;
	}

	public void mostrarAlumnoBuscado(String dni) {

		if (buscarAlumnoDni(dni) != null) {
			System.out.println(buscarAlumnoDni(dni));
		}
		System.out.println("Alumno no encontrado");
	}

	public void borrarAlumno(String dni) {

		listaAlumno.remove(buscarAlumnoDni(dni));
	}

}

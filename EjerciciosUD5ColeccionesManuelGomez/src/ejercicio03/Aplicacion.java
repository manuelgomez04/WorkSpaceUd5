package ejercicio03;

public class Aplicacion {

	private CrudAlumno cA;

	public CrudAlumno getcA() {
		return cA;
	}

	public void setcA(CrudAlumno cA) {
		this.cA = cA;
	}

	@Override
	public String toString() {
		return "Aplicacion [cA=" + cA + "]";
	}

	public double calcularNotaMediaTotal() {

		double notaMediaMedia = 0.0;

		for (Alumno alumno : cA.getListaAlumno()) {
			notaMediaMedia += alumno.getNotaMedia();
		}
		return notaMediaMedia / cA.getListaAlumno().size();
	}

	public int calcularNumSuspensos() {
		int contador = 0;

		for (Alumno al : cA.getListaAlumno()) {
			if (al.getNotaMedia() < 5) {
				contador++;
			}
		}
		return contador;
	}

	// public double calcularMedia
}

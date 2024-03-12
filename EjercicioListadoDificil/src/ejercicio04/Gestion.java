package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;

public class Gestion {

	private ConciertoEladio ce;

	public Gestion(ConciertoEladio ce) {
		super();
		this.ce = ce;
	}

	public ConciertoEladio getCe() {
		return ce;
	}

	public void setCe(ConciertoEladio ce) {
		this.ce = ce;
	}

	@Override
	public String toString() {
		return "Gestion [ce=" + ce + "]";
	}

	public int calcularTiempoParaLaFinal() {
		LocalDate hoy = LocalDate.now();
		LocalDate diaDeLaFinal = ce.getDia();

		return diaDeLaFinal.getDayOfYear() - hoy.getDayOfYear();
	}

	public int calcularTiempoDesdeLaUltimaFinal(int ultimaFinal) {
		return ce.getDia().getYear() - ultimaFinal;
	}

	public LocalTime calcularHoraApertura(int horas) {
		return ce.getHora().minusHours(horas);
	}

}

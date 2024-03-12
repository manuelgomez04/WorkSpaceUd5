package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ConciertoEladio ce = new ConciertoEladio(LocalDate.of(2024, 6, 1), LocalTime.of(21, 0));
		Gestion g = new Gestion(ce);

		int horas, anio;
		String aux;

		System.out.println("¿Cuántas horas antes se van a abrir las puertas?");
		aux = sc.nextLine();
		horas = Integer.parseInt(aux);

		System.out.println("Las puertas se abren a las " + g.calcularHoraApertura(horas));

		System.out.println("¿En qué año fue el último concierto?");
		aux = sc.nextLine();
		anio = Integer.parseInt(aux);

		System.out.println("Han pasado " + g.calcularTiempoDesdeLaUltimaFinal(anio) + "años");

		System.out.println("Quedan " + g.calcularTiempoParaLaFinal() + " días para el concierto");
	}

}

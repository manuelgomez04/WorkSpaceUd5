package ejemplo;

import java.time.LocalDate;
import java.time.Period;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Para tener la fecha de hoy, formato guiri
		LocalDate fechaHoy = LocalDate.now();
		System.out.println(fechaHoy);
		System.out.println();

//		Pasas unos datos concretos y si la fecha es correcta la acepta, si no da error
		LocalDate fecha1 = LocalDate.of(2004, 2, 28);
		System.out.println(fecha1);
		System.out.println();

//		Pasas un string con formato 0000-00-00 (Año mes y día)
		LocalDate fechaParse = LocalDate.parse("2010-06-09");
		System.out.println(fechaParse);
		System.out.println();

//		Sumar y restar fechas

		System.out.println(fechaHoy.minusDays(150));
		System.out.println();

//		Sumar y restar fechas

		Period p = Period.between(fechaHoy, fecha1);
		System.out.println(p);
		System.out.println();

		if (p.getYears() < 18) {
			System.out.println("Mayor de edad");
		} else {
			System.out.println("Menor de edad");
		}

	}

}

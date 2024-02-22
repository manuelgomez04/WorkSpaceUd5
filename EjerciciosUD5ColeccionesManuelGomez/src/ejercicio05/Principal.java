package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Persona p = new Persona("Victor", "Ramirez", "2804938z", 19);
		Persona p2 = new Persona("Carlos", "Roman", "234234", 19);
		Persona p3 = new Persona("Bruno", "Yow", "q89q585", 18);
		Persona p4 = new Persona("Manuel", "Gómez", "235893", 20);

		List<Persona> listPersona = new ArrayList<>();

		listPersona.add(p);
		listPersona.add(p2);
		listPersona.add(p3);
		listPersona.add(p4);

		System.out.println("Sin ordenar \n");

		for (Persona persona : listPersona) {
			System.out.println(persona);
		}
		System.out.println("\n\nOrdenar por nombre\n");
		Collections.sort(listPersona);
		for (Persona persona : listPersona) {
			System.out.println(persona);
		}

		System.out.println("\n\nOrdenar por edad\n");
		Collections.sort(listPersona, new CompararEdad());
		for (Persona persona : listPersona) {
			System.out.println(persona);
		}

	}

}

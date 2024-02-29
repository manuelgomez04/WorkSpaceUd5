package ejercicio06;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Trabajador> listaTrabajadores = new ArrayList<>();

		listaTrabajadores.add(new Trabajador("Vihto", "123456789v", 250, 2596));
		listaTrabajadores.add(new Trabajador("Br1", "293283c", 129, 1520));
		listaTrabajadores.add(new Trabajador("Moisex", "23234556v", 196, 3));
		listaTrabajadores.add(new Trabajador("Vihto", "123244543v", 195, 2));

	}

}

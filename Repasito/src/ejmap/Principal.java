package ejmap;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
//	 Realizar, usando la clase HashMap, una agenda de teléfonos (un Contacto como clave y el número de
//			teléfono como valor). Crear aquellos métodos que se utilizan normalmente en una agenda, como
//			agregar, borrar, mostrar, buscar por algún criterio (por ejemplo, por nombre), modificar algún dato,
//			etc. Y un main para probar todo

		Contacto c = new Contacto("Manuel", "sdas");
		Contacto c2 = new Contacto("Manuela", "sdas");
		Contacto c3 = new Contacto("Manuelo", "sdas");

		Map<Contacto, String> hol = new HashMap<>();
		hol.put(c, c.getNumTelf());
		hol.put(c3, c3.getNumTelf());
		hol.put(c2, c2.getNumTelf());
		Agenda a = new Agenda(hol);

		a.dfsfd();

		a.mostrarMap();

		a.kddk();
	}

}

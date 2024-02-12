package ejemploMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		Map<String, String> lista = new HashMap<>();

		// Clave y valor. La clave no se puede repetir, el valor sí. La clave es la
		// primera, el valor la segunda. La clave puede ser de un tipo y el valor de
		// otro sin problema.

		// Al la clave no poder ser un elemento repetido, en caso de que escribamos dos
		// claves iguales, almacenará el último valor que le hayamos asignado.

		Set<String> listaClave = lista.keySet();
		// Este set almacena en una lista las claves.

		// Para almacenar los valores, lo siguiente será crear una collection

		Collection<String> listaValores = lista.values();

		lista.put("Uno", "One");
		lista.put("Dos", "Two");
		lista.put("Uno", "Yoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooow");
		lista.put("Three", "One");

		System.out.println(
				"***********************************************************************************************");
		Set<Entry<String, String>> set2 = lista.entrySet();
		System.out.println(lista + "\n" + listaValores + "\n" + set2);
		System.out.println(
				"***********************************************************************************************");

		System.out.println(lista);
		System.out.println(listaClave);
		System.out.println(listaValores);

		System.out.println("EJEMPLO 2, CON UN OBJETO");

		Map<Integer, Alumno> lista2 = new HashMap<>();

		Alumno a = new Alumno(2, "Vihto", 6.0);
		// lista2.put(6, new Alumno(1, "Ángel", 3.2));

		lista2.put(5, a);
		System.out.println(lista2);
		a.setNombre("Rafa");
		System.out.println(lista2);
	}

}

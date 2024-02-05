package ejemploLiist;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Persona> listado = new ArrayList<>();
		CrudPersona c = new CrudPersona(listado);

		Persona p = new Persona("Pet", 19, "29567983z");
		Persona p2 = new Persona("Víctor", 22, "34956345c");
		Persona p3 = new Persona("Carlos", 18, "12039345v");

		listado.add(new Persona("Pet", 19, "29567983z")); // Se puede añadir con listado.add (p) o con listado.add (new
															// Persona)

		listado.add(new Persona("Víctor", 22, "34956345c"));

		System.out.println(listado);

		System.out.println(listado.contains(new Persona("Carlos", 18, "12039345v")));

		listado.remove(0); // Como son "array" dinámicos, el tamaño se ajusta. En este caso borro el índice
							// 0 (pet) y el 0 pasa aser Víctor

		System.out.println(listado.get(0));

		System.out.println(listado);

		System.out.println();

		c.agregarPersona(p);
		System.out.println(c.buscarDni("34956345c"));

		System.out.println("Mostrar");
		c.mostrarLista();

		c.eliminarPersona("34956345c");

		System.out.println("mostrar");
		c.mostrarLista();

	}

}

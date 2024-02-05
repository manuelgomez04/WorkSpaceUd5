package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String aux;
		int id, opcion;

		Scanner sc = new Scanner(System.in);
		/*
		 * Realizar un programa que permita gestionar notas de texto (como las de un
		 * móvil, no son calificaciones de clase).
		 * 
		 * Usaremos la clase ArrayList y el listado debe guardar objetos tipo Nota (tú
		 * decides los atributos que debe tener una nota). Se podrán mostrar de manera
		 * individual (sin necesidad de buscar, solo diciendo cuál de la lista
		 * mostrada), dar información del número de notas guardadas, agregar una nueva
		 * nota, un método que borre una de las notas guardadas comprobando antes que la
		 * lista no está vacía. Se borrará por número (la nota 1, la 2...), por lo que
		 * habrá que mostrarle al usuario la lista con todas las notas (en un método) y
		 * su número correspondiente, el usuario introducirá el número de la que quiera
		 * borrar (esto no es lo ideal puesto que así habría que mostrar todas las notas
		 * ¿y si hay miles de ellas?).
		 */

		List<Nota> lista = new ArrayList<>();
		CrudNotas cr = new CrudNotas(lista);

		cr.agregarNota(new Nota("kasdfjgjklsfdgklsdhlfklg", 1, "Hola"));
		cr.agregarNota(new Nota("gfsdghskljdfghlskjdfsdfhlglkjsdfhlkgjhsdfl", 2, "YOOOOOOOOOOOOW"));
		cr.agregarNota(new Nota("ksadfyiguosdfgjklfsdghlkdf", 3, "Víctor tonto"));

		do {

			System.out.println("""
					0 ---> Salir
					1 ---> Mostrar todas las notas
					2 ---> Borrar una nota
					3 ---> Mostrar una nota
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				cr.mostrarNotas();
				break;

			case 2:
				System.out.println("Diga Id de la nota a borrar");
				aux = sc.nextLine();
				id = Integer.parseInt(aux);
				cr.borrarNota(id);
				break;
			case 3:
				System.out.println("Diga el id de la nota a mostrar");
				aux = sc.nextLine();
				id = Integer.parseInt(aux);
				cr.mostrarNota(id);
				// Carlos feo
				break;

			case 0:
				System.out.println("Gracias por usar el programa");
				break;
			default:
				System.out.println("Diga un número válido");
				break;

			}

		} while (opcion != 0);

	}

}

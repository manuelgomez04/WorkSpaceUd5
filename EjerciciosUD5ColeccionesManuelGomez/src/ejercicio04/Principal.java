package ejercicio04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, numTelf, nuevoNombre, aux;
		int opcion;
		Map<Contacto, String> listaContacto = new HashMap<Contacto, String>();
		Agenda ag = new Agenda(listaContacto);

		do {
			System.out.println("""
					0 ---> Salir
					1 ---> Añadir un nuevo contacto
					2 ---> Mostrar todos los contactos
					3 ---> Buscar un contacto
					4 ---> Borrar un contacto
					5 ---> Modificar un contacto
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				System.out.println("Diga nombre y apellidos");
				nombre = sc.nextLine();
				System.out.println("Diga número de teléfono");
				numTelf = sc.nextLine();
				ag.addContacto(new Contacto(nombre, numTelf));
				break;
			case 2:
				ag.mostrarContactos();
				break;
			case 3:
				System.out.println("Diga el nombre del contacto que desea buscar");
				nombre = sc.nextLine();
				System.out.println(ag.buscarContacto(nombre));
				break;
			case 4:
				System.out.println("Diga el nombre del contacto que desea borrar");
				nombre = sc.nextLine();
				ag.deleteContacto(nombre);
				break;
			case 5:
				System.out.println("Diga el nombre del contacto que desea buscar");
				nombre = sc.nextLine();
				System.out.println("Diga el nuevo nombre");
				nuevoNombre = sc.nextLine();
				ag.modificarDatosContacto(nombre, nuevoNombre);
				break;

			default:
				break;
			}
		} while (opcion != 0);

	}

}

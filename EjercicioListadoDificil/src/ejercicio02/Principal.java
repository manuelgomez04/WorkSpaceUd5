package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcion;
		String aux, cadena;

		List<String> lista = new ArrayList<>();
		GestionCadenas gc = new GestionCadenas(lista);
		lista.add("Hola");
		lista.add("Me");
		lista.add("Llamo");
		lista.add("Antonio");

		do {

			System.out.println("""
					1 ---> Ordenar por orden alfabético
					2 ---> Buscar una cadena en concreto
					3 ---> Crear nuevo String formado por las primeras letras de cada cadena
					4 ---> Borrar palabras longitud impar
					5 ---> Pasar palabras a mayúscula
					""");

			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				gc.mostrarLista(gc.ordenarAlfabetico());
				break;

			case 2:
				System.out.println("Diga cadena a buscar");
				cadena = sc.nextLine();
				System.out.println(gc.findCadena(cadena));
				break;

			case 3:

				break;

			case 4:
				gc.borrarPalabrasImpares();
				break;

			case 5:
				gc.setLista(gc.aMayuscula());
				break;

			default:
				break;
			}

		} while (opcion != 0);

	}

}

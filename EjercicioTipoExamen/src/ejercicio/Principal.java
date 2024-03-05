package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

//		Gestionaremos una empresa de alquileres de trasteros. Tendremos la clase Trastero cuyas características son la capacidad
//		en metros cuadrados, dirección (String con la calle), número de trastero, precio y si está ocupado o no.
//		Crear también una clase Oficina donde tendremos como atributo una lista de trasteros de tipo List y donde se tendrá
//		métodos para hacer realizar las siguientes funcionalidades (no todas tienen que coincidir con un método):
//		 Añadir un nuevo trastero al final de la lista con los datos leídos por teclado.
//		 Buscar un trastero por precio.
//		 Buscar un trastero por número devolviendo el trastero en cuestión.
//		 Buscar al trastero más caro, es decir, el de precio mayor.
//		 Eliminar un trastero.
//		 Modificar un trastero elegido por el usuario, modificando únicamente su precio.
//		 Ordenar la lista de trasteros por número (orden natural) y por precio (orden no natural) de mayor a menor.
//		 Mostrar usando for each solo los trasteros no ocupados.

		Scanner sc = new Scanner(System.in);

		String aux, calle;
		double capacidad, precio;
		int num, opcion, opcionOcupado, numBuscar;
		boolean ocupado;

		List<Trastero> listaTrasteros = new ArrayList<>();
		Oficina of = new Oficina(listaTrasteros);

		Trastero t = new Trastero(250, "sdf", 1, 1500, true);
		Trastero t2 = new Trastero(100, "KHG", 2, 1000, false);
		Trastero t3 = new Trastero(250, "LLHJKH", 3, 1000, true);
		Trastero t4 = new Trastero(196, "sdfgdf", 4, 1750, true);
		num = 5;

		of.addTrastero(t2);
		of.addTrastero(t);
		of.addTrastero(t3);
		of.addTrastero(t4);

		do {
			System.out.println("""
					1 ---> Añadir trastero
					2 ---> Buscar un trastero por su precio
					3 ---> Buscar el trastero más caro
					4 ---> Eliminar un trastero
					5 ---> Modificar el precio de un trastero
					6 ---> Mostrar lista de trasteros
					7 ---> Ordenar los trasteros por precio
					8 ---> Mostrar los trasteros no ocupados

					0 ---> Salir
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				System.out.println("Diga la capacidad en m2");
				aux = sc.nextLine();
				capacidad = Double.parseDouble(aux);
				System.out.println("Diga la dirección del trastero");
				calle = sc.nextLine();
				System.out.println("Diga el precio del trastero");
				aux = sc.nextLine();
				precio = Double.parseDouble(aux);
				System.out.println("¿Está ocupado? 1 --> Sí, 2 --> No");
				aux = sc.nextLine();
				opcionOcupado = Integer.parseInt(aux);
				while (opcionOcupado != 1 && opcionOcupado != 2) {
					System.out.println("Diga dato válido");
					aux = sc.nextLine();
					opcionOcupado = Integer.parseInt(aux);
				}

				if (opcionOcupado != 1) {
					ocupado = true;
				} else {
					ocupado = false;
				}

				of.addTrastero(new Trastero(capacidad, calle, num, precio, ocupado));
				num++;

				break;
			case 2:
				System.out.println("Diga el precio de los trasteros");
				aux = sc.nextLine();
				precio = Double.parseDouble(aux);
				of.mostrarBuscadosPrecio(precio);
				break;

			case 3:
				System.out.println(of.findMasCaro());
				break;
			case 4:
				System.out.println("Diga el número del trastero a borrar");
				aux = sc.nextLine();
				numBuscar = Integer.parseInt(aux);
				of.borrarTrastero(numBuscar);
				break;
			case 5:
				System.out.println("Diga el número del trastero a modificar");
				aux = sc.nextLine();
				numBuscar = Integer.parseInt(aux);
				if (of.findPorNum(numBuscar) == null) {
					System.out.println("Este objeto no existe");

				} else {

					System.out.println("Diga nuevo precio");
					aux = sc.nextLine();
					precio = Double.parseDouble(aux);

					of.modificarPrecio(numBuscar, precio);
				}
				break;
			case 6:
				of.ordenarListaNatural();
				of.mostrarLista();
				break;
			case 7:
				Collections.sort(listaTrasteros, new OrdenaPorPrecio());
				of.mostrarLista();

			case 8:
				of.mostrarListaNoOcupados();
				break;
			case 0:
				System.out.println("Gracias por usar el programa");
				break;
			default:
				System.out.println("Inserte dato válido");
				break;
			}

		} while (opcion != 0);
	}

}

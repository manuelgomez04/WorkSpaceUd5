package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion, numGoles, dorsal, opTitular;
		String aux, nombre, posicion;
		boolean esTitular;

		List<Jugador> listaJugadores = new ArrayList<Jugador>();
		Equipo e = new Equipo(listaJugadores, "Chanquete Fc");

		Jugador j = new Jugador("Carlos", "Defensa", 3, 1, true);
		Jugador j5 = new Jugador("Carlos", "Defensa", 3, 1, true);
		Jugador j2 = new Jugador("Juan", "Portero", 1, 0, true);
		Jugador j6 = new Jugador("Juan", "Portero", 1, 0, true);
		Jugador j3 = new Jugador("Garfia", "Medio", 8, 2, false);
		Jugador j4 = new Jugador("Bruno", "Delantero", 9, 8, true);

		e.addJugador(j);
		e.addJugador(j2);
		e.addJugador(j4);
		e.addJugador(j3);
		e.addJugador(j5);
		e.addJugador(j6);

		do {
			System.out.println("""
					1 ----> Añadir un jugador al equipo
					2 ----> Mostrar jugadores que no han marcado gol
					3 ----> Calcular media de goles entre todos los jugadores
					4 ----> Modificar la posición del jugador
					5 ----> Mostrar toda la plantilla
					6 ----> Ordenar jugadores por posición
					7 ----> Ordenar jugadores por goles marcados

					0 ----> Salir

					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
				case 1:
					System.out.println("Diga nombre del jugador");
					nombre = sc.nextLine();

					System.out.println("""
							Diga posición
							"Portero"
							"Defensa"
							"Medio"
							"Delantero"
							""");
					posicion = sc.nextLine();
					System.out.println("Diga dorsal");
					aux = sc.nextLine();
					dorsal = Integer.parseInt(aux);
	
					System.out.println("Diga número de goles marcados");
					aux = sc.nextLine();
					numGoles = Integer.parseInt(aux);
	
					System.out.println("""
							¿Es titular?
							1 ---> Sí
							2 ---> No
							""");
					aux = sc.nextLine();
					opTitular = Integer.parseInt(aux);
					while (opTitular != 1 && opTitular != 2) {
						System.out.println("Escriba opción correcta");
						aux = sc.nextLine();
						opTitular = Integer.parseInt(aux);
					}
					if (opTitular == 1) {
						esTitular = true;
					} else {
						esTitular = false;
					}
	
					e.addJugador(new Jugador(nombre, posicion, dorsal, numGoles, esTitular));
	
					break;
	
				case 2:
					e.mostrarNoGoles();
					break;
	
				case 3:
					System.out.printf("La media de goles por jugador es %.2f goles\n", e.calcularMediaGoles());
	
					break;
	
				case 4:
					System.out.println("Diga el dorsal del jugador cuya posición desea modificar");
					aux = sc.nextLine();
					dorsal = Integer.parseInt(aux);
	
					System.out.println("""
							Diga nueva posición
							"Portero"
							"Defensa"
							"Medio"
							"Delantero"
							""");
					posicion = sc.nextLine();
	
					e.modificarPosicion(dorsal, posicion);
					break;
	
				case 5:
					e.mostrarLista();
					break;
	
				case 6:
					e.ordenarNatural();
					e.mostrarLista();
					break;
				case 7:
					e.ordenarNumGoles();
					e.mostrarLista();
					break;
	
				case 0:
					System.out.println("Saliendo...");

			default:
				System.out.println("Inserte dato válido");
				break;
			}

		} while (opcion != 0);

	}

}

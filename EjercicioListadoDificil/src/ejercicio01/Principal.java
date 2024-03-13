package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux, letra;
		int opcion;

		List<Alumno> listaAlum = new ArrayList<>();

		Secretaria s = new Secretaria(listaAlum);

		listaAlum.add(new Alumno("Juan", "Pérez", "2DAM", 9.5, 22));
		listaAlum.add(new Alumno("Bruno", "López", "1DAM", 5, 18));
		listaAlum.add(new Alumno("Víctor", "Medina", "1DAM", 9.2, 17));
		listaAlum.add(new Alumno("Pepe", "Medina", "1DAM", 9.2, 17));
		listaAlum.add(new Alumno("Moisés", "Dorado", "1AYF", 4, 19));
		listaAlum.add(new Alumno("Carlos", "Román", "1DAM", 10, 20));
		listaAlum.add(new Alumno("Pedro", "Sánchez", "2AYF", 5, 25));
		listaAlum.add(new Alumno("Pablo", "Tey", "1DAM", 0.2, 24));
		listaAlum.add(new Alumno("Manuel", "Gómez", "2DAM", 10, 23));
		listaAlum.add(new Alumno("Víctor Fernando", "Medina", "1DAM", 9.2, 27));
		listaAlum.add(new Alumno("Ana", "Medina", "1DAM", 9.2, 25));

		do {
			System.out.println("""
					1 ---> Mostrar todos los alumnos
					2 ---> Imprimir Alumnos cuyo nombre empiece por una letra concreta
					3 ---> Cantidad de alumnos
					4 ---> Obtener alumnos con nota media >9 en 1 DAM
					5 ---> Imprimir 3 primeros alumnos
					6 ---> Obtener el alumno menor
					7 ---> Obtener primer alumno de la lista
					8 ---> Alumnos con nombre mayor a 10
					9 ---> Alumnos nombre empieza por "a" y menor a 6
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:

				s.mostrarAlumnos();
				System.out.println();

				break;

			case 2:
				System.out.println("Diga letra");
				letra = sc.nextLine();
				s.imprimirLista(s.alumnosNombreEmpiezaIgual(letra));
				break;

			case 3:
				System.out.println("La cantidad de alumnos es " + s.contarTamañoLista());
				break;

			case 4:
				s.imprimirLista(s.filtrarMediaMayorNueve());
				break;

			case 5:
				s.imprimirLista(s.AlumnosLimit(3));
				break;

			case 6:
				System.out.println("El alumno menor es " + s.alumnoMenor());
				break;

			case 7:
				System.out.println("El primer alumno matriculado es " + s.primerAlumno());
				break;

			case 8:
				s.imprimirLista(s.nombreMayorDiez());
				break;

			case 9:
				s.imprimirLista(s.nombreAYMenorSeis());
			default:
				break;
			}

		} while (opcion != 0);

	}

}

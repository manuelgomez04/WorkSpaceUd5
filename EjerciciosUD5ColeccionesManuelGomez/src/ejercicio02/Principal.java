package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		List<Socio> listaSocios = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		String aux, dni;
		int opcion;
		double cuotaBase;

		Socio s = new Socio("Juan", "Pérez", "123456789z", 150);
		Socio s2 = new Socio("Juan", "Pérez", "123456789y", 150);
		Socio s3 = new Socio("Juan", "Pérez", "123456789x", 150);
		Socio s4 = new Socio("Juan", "Pérez", "123456789w", 150);

		CrudSocio cs = new CrudSocio(listaSocios);
		cs.agregarSocio(s);
		cs.agregarSocio(s2);
		cs.agregarSocio(s3);
		cs.agregarSocio(s4);

		ClubCampo cc = new ClubCampo(cs);

		do {

			System.out.println("""
					0 ---> Salir
					1 ---> Borrar Socio
					2 ---> Modificar cuota de socio
					3 ---> Calcular Ganancias totales
					4 ---> Mostrar socios
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				System.out.println("Diga el DNI del socio a borrar");
				dni = sc.nextLine();

				cs.borrarSocio(dni);
				break;
			case 2:
				System.out.println("Diga el DNI del socio a modificar");
				dni = sc.nextLine();
				System.out.println("Diga nueva cuota");
				aux = sc.nextLine();
				cuotaBase = Double.parseDouble(aux);

				cs.moodificarCuotaBase(dni, cuotaBase);
				break;
			case 3:
				System.out.println(cc.calcularTotal());
				break;

			case 4:
				cs.mostrarSocios();
				break;
			case 0:
				System.out.println("Gracias por usar el programa");
				break;
			default:
				System.out.println("Diga dato válido");
				break;
			}
		} while (opcion != 0);

	}

}

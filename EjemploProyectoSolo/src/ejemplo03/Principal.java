package ejemplo03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Set<Persona> listaPersonas = new HashSet<Persona>();
		List<Persona> lista2 = new ArrayList<>();
		CrudPersona cp = new CrudPersona(listaPersonas, lista2);

		String nombre = "Juan";
		listaPersonas.add(new Persona("Juan", "Lopez", "1234", 12));
		listaPersonas.add(new Persona("Juan", "Jesús", "1234", 15));
		listaPersonas.add(new Persona("Pedro", "Lopez", "1234", 19));
		listaPersonas.add(new Persona("Lucas", "Lopez", "1234", 19));
		listaPersonas.add(new Persona("Víctor", "Lopez", "1234", 17));
		listaPersonas.add(new Persona("Manuel", "Lopez", "1234", 18));
		listaPersonas.add(new Persona("Carlos", "Lopez", "1234", 15));
		lista2.add(new Persona("Juan", "Lopez", "1234", 12));
		lista2.add(new Persona("Juan", "Jesús", "1234", 15));
		lista2.add(new Persona("Pedro", "Lopez", "1234", 19));
		lista2.add(new Persona("Lucas", "Lopez", "1234", 19));
		lista2.add(new Persona("Víctor", "Lopez", "1234", 17));
		lista2.add(new Persona("Manuel", "Lopez", "1234", 18));
		lista2.add(new Persona("Carlos", "Lopez", "1234", 15));

//		cp.getLista().stream().filter(Persona -> Persona.getNombre().equalsIgnoreCase("juan"))
//				.forEach(System.out::println);

		System.out.println(cp.buscarPersonasMismoNombre(nombre));
		System.out.println();
		System.out.println(cp.calcularEdadMedia(nombre));
		System.out.println();
		System.out.println(cp.masJovenque(17));
		System.out.println();
		System.out.println(cp.skip());
		System.out.println();
		System.out.println(cp.listaOrdenada());

	}

}

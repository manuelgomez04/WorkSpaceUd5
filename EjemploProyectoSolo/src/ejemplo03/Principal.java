package ejemplo03;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Set<Persona> listaPersonas = new HashSet<Persona>();
		CrudPersona cp = new CrudPersona(listaPersonas);

		String nombre = "Juan";
		listaPersonas.add(new Persona("Juan", "Lopez", "1234", 12));
		listaPersonas.add(new Persona("Juan", "Jesús", "1234", 15));
		listaPersonas.add(new Persona("Pedro", "Lopez", "1234", 19));
		listaPersonas.add(new Persona("Lucas", "Lopez", "1234", 19));
		listaPersonas.add(new Persona("Víctor", "Lopez", "1234", 17));
		listaPersonas.add(new Persona("Manuel", "Lopez", "1234", 18));
		listaPersonas.add(new Persona("Carlos", "Lopez", "1234", 15));

		cp.getLista().stream().filter(Persona -> Persona.getNombre().equalsIgnoreCase("juan"));

		cp.calcularEdadMedia(nombre);

	}

}

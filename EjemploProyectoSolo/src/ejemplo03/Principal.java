package ejemplo03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Set<Persona> listaPersonas = new HashSet<Persona>();
		List<Persona> lista2 = new ArrayList<>();
		List<Viaje> listaV = new ArrayList<Viaje>();
		CrudPersona cp = new CrudPersona(listaPersonas, lista2);
		Persona p = new Persona("Juan", "Lopez", "1234", 12, listaV);
		Persona p2 = new Persona("Lucas", "Lopez", "1234", 19, listaV);
		p.addViaje(new Viaje("Inglaterra"));
		p.addViaje(new Viaje("Francia"));
		p2.addViaje(new Viaje("Estonia"));
		p2.addViaje(new Viaje("Lituania"));

		String nombre = "Juan";
		listaPersonas.add(new Persona("Juan", "Lopez", "1234", 12, listaV));
		listaPersonas.add(new Persona("Juan", "Jesús", "1234", 15, listaV));
		listaPersonas.add(new Persona("Pedro", "Lopez", "1234", 19, listaV));
		listaPersonas.add(new Persona("Lucas", "Lopez", "1234", 19, listaV));
		listaPersonas.add(new Persona("Víctor", "Lopez", "1234", 17, listaV));
		listaPersonas.add(new Persona("Manuel", "Lopez", "1234", 18, listaV));
		listaPersonas.add(new Persona("Carlos", "Lopez", "1234", 15, listaV));
		lista2.add(new Persona("Juan", "Lopez", "1234", 12, listaV));
		lista2.add(new Persona("Juan", "Jesús", "1234", 15, listaV));
		lista2.add(new Persona("Pedro", "Lopez", "1234", 19, listaV));
		lista2.add(new Persona("Lucas", "Lopez", "1234", 19, listaV));
		lista2.add(new Persona("Víctor", "Lopez", "1234", 17, listaV));
		lista2.add(new Persona("Manuel", "Lopez", "1234", 18, listaV));
		lista2.add(new Persona("Carlos", "Lopez", "1234", 15, listaV));

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
		System.out.println(cp.listaOrdenadaNombre());
		System.out.println();
		System.out.println(cp.ordenarEdades());

//		lista2.stream().map(persona -> persona.getListaV()).flatMap(vi -> vi.stream()).forEach(new Consumer<Viaje>() {
//			public void accept(Viaje v) {
//				System.out.println(v.getPais());
//			}
//		});

	}

}

package ejemplo03;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CrudPersona {

	private Set<Persona> lista;

	public CrudPersona(Set<Persona> lista) {
		super();
		this.lista = lista;
	}

	public Set<Persona> getLista() {
		return lista;
	}

	public void setLista(Set<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}

	public List<Persona> buscarPersonasMismoNombre(String nombre) {

		return lista.stream().filter(Persona -> Persona.getNombre().equalsIgnoreCase(nombre)).toList();

		Stream<Persona> yow;
		yow.empty();

	}

	public int calcularEdadMedia(String nombre) {

//		return lista.stream().filter(p -> p.getNombre().equalsIgnoreCase(nombre)).map(p -> p.getEdad() + edad);
//		lista.stream().filter(p -> p.getNombre().equalsIgnoreCase(nombre)).map(p -> p.getEdad() + edad.)
//				.forEach(System.out::println);

//		edad = lista.stream().filter(p -> p.getNombre().equalsIgnoreCase(nombre));

//		lista.stream().average().filter(Persona -> Persona.getNombre().equalsIgnoreCase(nombre));

		int total = 0;
		for (int j = 0; j < buscarPersonasMismoNombre(nombre).size(); j++) {

			total += buscarPersonasMismoNombre(nombre).get(j).getEdad();
		}
		return total / buscarPersonasMismoNombre(nombre).size();
	}

	public double calcMedia() {
		return 0;
	}
}

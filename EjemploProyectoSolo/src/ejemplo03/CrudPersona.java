package ejemplo03;

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

	public Stream<Persona> buscarPersonasMismoNombre(String nombre) {

		return lista.stream().filter(Persona -> Persona.getNombre().equalsIgnoreCase(nombre));
	}

	public void calcularEdadMedia(String nombre) {

		int edad = 0;

		/*
		 * lista.stream().filter(Persona ->
		 * Persona.getNombre().equalsIgnoreCase(nombre)) .map(Persona ->
		 * Integer.parseInt(Persona.getEdad() + edad));
		 */

		// lista.stream().filter(p -> p.getNombre().equalsIgnoreCase(nombre)).map(p ->
		// p.getEdad() + edad);

		lista.stream().filter(p -> p.getNombre().equalsIgnoreCase(nombre)).map(p -> p.getEdad() + edad)
				.forEach(System.out::println);

	}

}

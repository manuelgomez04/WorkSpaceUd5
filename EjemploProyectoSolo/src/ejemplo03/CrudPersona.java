package ejemplo03;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class CrudPersona {

	private Set<Persona> lista;
	private List<Persona> lista2;

	public CrudPersona(Set<Persona> lista, List<Persona> lista2) {
		super();
		this.lista = lista;
		this.lista2 = lista2;
	}

	public Set<Persona> getLista() {
		return lista;
	}

	public void setLista(Set<Persona> lista) {
		this.lista = lista;
	}

	public List<Persona> getLista2() {
		return lista2;
	}

	public void setLista2(List<Persona> lista2) {
		this.lista2 = lista2;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + ", lista2=" + lista2 + "]";
	}

	public List<Persona> buscarPersonasMismoNombre(String nombre) {

		return lista2.stream().filter(Persona -> Persona.getNombre().equalsIgnoreCase(nombre)).toList();

//		Stream<Persona> yow;
//		yow.empty();

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

	public List<Persona> masJovenque(int edad) {

		return lista2.stream().filter(p -> p.getEdad() <= edad).limit(3).toList();
	}

	public List<Persona> skip() {

		return lista2.stream().skip(2).toList();
	}

	public List<Persona> listaOrdenadaNombre() {

		return lista2.stream().sorted((p1, p2) -> p1.getNombre().compareTo(p2.getNombre())).toList();
	}

	public List<Persona> ordenarEdades() {
		Comparator<Persona> compararMayores = Comparator.comparing(Persona::getEdad);

		return lista2.stream().sorted(compararMayores).toList();
	}

	public List<Integer> map() {
		return lista2.stream().map(p -> p.getEdad() * 3).toList();
	}

	public List<String> map2() {
		return lista2.stream().map(p -> p.getNombre()).distinct().toList();
	}

	public IntStream mapEdad(int edad) {

		return lista2.stream().filter(p -> p.getEdad() == edad).mapToInt(Persona::getEdad);
	}

	public void addViaje() {

	}
}

package ejercicio02;

import java.util.List;

public class GestionCadenas {

	private List<String> lista;

	public GestionCadenas(List<String> lista) {
		super();
		this.lista = lista;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionCadenas [lista=" + lista + "]";
	}

	public void mostrarLista(List<String> listaMostrada) {
		listaMostrada.stream().forEach(System.out::println);
	}

	public List<String> ordenarAlfabetico() {

		return lista.stream().sorted().toList();
	}

	public List<String> longitudImpar() {

		return lista.stream().filter(string -> string.length() % 2 != 0).toList();

	}

	public String findCadena(String c) {
		return lista.stream().filter(s -> s.equalsIgnoreCase(c)).findFirst().get();
	}

	public void borrarPalabrasImpares() {
		lista.removeAll(longitudImpar());
	}

	public List<String> aMayuscula() {

		return lista.stream().map(s -> s.toUpperCase()).toList();
	}

	public void nuevaPalabra() {
		String nuevoString;
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).charAt(i);

		}
	}

}

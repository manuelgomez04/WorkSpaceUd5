package ejercicio01;

import java.util.List;

public class CrudNotas {

	private List<Nota> lista;

	public CrudNotas(List<Nota> lista) {
		super();
		this.lista = lista;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudNotas [lista=" + lista + "]";
	}

	public void agregarNota(Nota n) {
		lista.add(n);
	}

	public Nota buscarNota(int id) {

		boolean encontrado = false;
		Nota n = null;

		for (int i = 0; i < lista.size() && !encontrado; i++) {

			if (lista.get(i).getId() == id) {
				n = lista.get(i);
				encontrado = true;
			}
		}

		return n;
	}

	public void borrarNota(int id) {
		if (!lista.isEmpty()) {
			lista.remove(buscarNota(id));
		}
	}

	public void mostrarNotas() {

		for (Nota nota : lista) {
			if (!lista.isEmpty())
				System.out.println(nota);
		}
	}

	public void mostrarNota(int id) {

		if (!lista.isEmpty()) {
			System.out.println(buscarNota(id));
		}

	}

	public int contarTamanio() {
		return lista.size();
	}

	public Nota[] buscarNotasPorTitulo(String titulo) {

		Nota n[] = new Nota[lista.size()];

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				n[i] = lista.get(i);
			}
		}

		return n;

	}

	public void mostrarNotasPorTitulo(String titulo) {
		System.out.println(buscarNotasPorTitulo(titulo));
	}

	public void modificar(int id) {

	}
}

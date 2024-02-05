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
		if (buscarNota(id) != null) {
			lista.remove(buscarNota(id));
		}
	}

	public void mostrarNotas() {

		for (Nota nota : lista) {
			System.out.println(nota);
		}
	}

	public void mostrarNota(int id) {

		System.out.println(buscarNota(id));
	}

}

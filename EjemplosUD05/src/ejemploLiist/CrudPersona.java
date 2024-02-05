package ejemploLiist;

import java.util.List;

public class CrudPersona {

	private List<Persona> lista;

	public CrudPersona(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}

	public void agregarPersona(Persona p) {

		lista.add(p);
	}

	public boolean agregarPersonaV2(Persona p) {

		return lista.add(p);
	}

	public Persona buscarDni(String dni) {

		int i = 0;
		boolean encontrado = false;

		while (i < lista.size() && !encontrado) {
			if (lista.get(i).getDni().equalsIgnoreCase(dni)) {

				encontrado = true;
			} else {
				i++;
			}

		}

		if (encontrado) {
			return lista.get(i);
		} else {
			return null;
		}
	}

	public Persona buscarDniV2(String dni) {
		boolean salir = false;
		Persona per = null;

		for (int i = 0; i < lista.size() && !salir; i++) {
			if (lista.get(i).getDni().equalsIgnoreCase(dni)) {
				salir = true;
				per = lista.get(i);
			}
		}
		return per;
	}

	public void mostrarLista() {

		for (Persona p : lista) {
			System.out.println(p);
		}
	}

	public void eliminarPersona(String dni) {

		if (buscarDni(dni) != null)
			lista.remove(buscarDni(dni));
	}

}

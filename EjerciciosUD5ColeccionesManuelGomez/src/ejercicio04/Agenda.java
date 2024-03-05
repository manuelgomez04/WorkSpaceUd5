package ejercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Agenda {

	private Map<Contacto, String> listaContacto;

	public Agenda(Map<Contacto, String> listaContacto) {
		super();
		this.listaContacto = listaContacto;
	}

	public Map<Contacto, String> getListaContacto() {
		return listaContacto;
	}

	public void setListaContacto(Map<Contacto, String> listaContacto) {
		this.listaContacto = listaContacto;
	}

	@Override
	public String toString() {
		return "Agenda [listaContacto=" + listaContacto + "]";
	}

	public void addContacto(Contacto c) {
		listaContacto.put(c, c.getNumTelf());
	}

	public Contacto buscarContacto(String numTelf) {

		for (Contacto conct : listaContacto.keySet()) {
			if (conct.getNombre().equals(numTelf)) {
				return conct;
			}

		}
		return null;
	}

	public List<Contacto> buscarContactoNombre(String nombre) {

//		Set<Contacto> listaBuscada = new HashSet<Contacto>();
		List<Contacto> listaBuscada = new ArrayList<>();

		for (Contacto con : listaContacto.keySet()) {
			if (con.getNombre().equalsIgnoreCase(nombre)) {
				listaBuscada.add(con);
			}

		}
		return listaBuscada;
	}

	public void deleteContacto(String num) {
		listaContacto.remove(buscarContacto(num));
	}

	public void mostrarContactos() {

		for (Contacto con : listaContacto.keySet()) {
			System.out.println(con);
		}
	}

	public void modificarDatosContacto(String nom, String nuevoNombre) {
		buscarContacto(nom).setNombre(nuevoNombre);
	}
}

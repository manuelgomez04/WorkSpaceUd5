package ejercicio04;

import java.util.Map;
import java.util.Set;

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

	public Contacto buscarContacto(String nombre) {
		Contacto c = null;
		Set<Contacto> claves = listaContacto.keySet();
		for (Contacto conct : claves) {
			if (conct.getNombre().equals(nombre)) {
				c = conct;
			}

		}
		return c;
	}

	public void deleteContacto(String num) {
		listaContacto.remove(buscarContacto(num));
	}

	public void mostrarContactos() {
		System.out.println(listaContacto);
	}

	public void modificarDatosContacto(String nom, String nuevoNombre) {
		buscarContacto(nom).setNombre(nuevoNombre);
	}
}

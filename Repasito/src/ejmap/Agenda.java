package ejmap;

import java.util.HashSet;
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

	public Set<Contacto> findConctactoNombre(String nombre) {

		Set<Contacto> setEncontrados = new HashSet<>();

		for (Contacto contacto : listaContacto.keySet()) {
			if (contacto.getNombre().equalsIgnoreCase(nombre)) {
				setEncontrados.add(contacto);
			}
		}
		return setEncontrados;
	}

	public Contacto findTelefono(String telf) {

		for (Contacto contacto : listaContacto.keySet()) {
			if (contacto.getNumTelf().equalsIgnoreCase(telf)) {
				return contacto;
			}
		}
		return null;
	}

	public Set<Contacto> findContactos(String nombre) {
		Set<Contacto> buscado = new HashSet<Contacto>();
		for (Contacto contacto : listaContacto.keySet()) {
			if (contacto.getNombre().equalsIgnoreCase(nombre)) {
				buscado.add(contacto);
			}
		}
		return buscado;
	}

	public void mostrarMap() {
		for (Contacto contacto : listaContacto.keySet()) {
			System.out.println(contacto);
		}
	}

	public void borrarContacto(String telefono) {
		listaContacto.remove(findTelefono(telefono));
	}

	public void mostrarContactos() {
		for (Contacto contacto : listaContacto.keySet()) {
			System.out.println(contacto);
		}
	}

	public void modificarNombre(String telefono, String nuevoNombre) {
		findTelefono(telefono).setNombre(nuevoNombre);
	}

	public void dfsfd() {
		System.out.println(listaContacto.entrySet());
	}

	public void kddk() {
		System.out.println(listaContacto);
	}

}

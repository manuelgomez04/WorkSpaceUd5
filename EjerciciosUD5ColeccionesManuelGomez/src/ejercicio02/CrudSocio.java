package ejercicio02;

import java.util.List;

public class CrudSocio {

	private List<Socio> listaSocios;

	public CrudSocio(List<Socio> listaSocios) {
		super();
		this.listaSocios = listaSocios;
	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	@Override
	public String toString() {
		return "CrudSocio [listaSocios=" + listaSocios + "]";
	}

	public Socio buscarDNI(String dni) {

		boolean salir = false;
		Socio s = null;

		for (int i = 0; i < listaSocios.size() && !salir; i++) {
			if (listaSocios.get(i).getDni().equalsIgnoreCase(dni)) {
				salir = true;
				s = listaSocios.get(i);
			}
		}
		return s;
	}

	public int buscarInt(String dni) {
		boolean salir = false;
		int index = 0;
		for (int i = 0; i < listaSocios.size() && !salir; i++) {
			if (listaSocios.get(i).getDni().equalsIgnoreCase(dni)) {
				salir = true;
				index = i;
			}
		}
		return index;
	}

	public void agregarSocio(Socio s) {
		listaSocios.add(s);
	}

	public void mostrarSocios() {
		for (Socio socio : listaSocios) {
			System.out.println(socio);
		}
	}

	public void borrarSocio(String dni) {

		listaSocios.remove(buscarDNI(dni));

	}

	public void moodificarCuotaBase(String dni, double cuotaBase) {

		listaSocios.get(buscarInt(dni)).setCuotaBase(cuotaBase);

		// buscarDNI(dni).setCuotaBase(cuotaBase);
	}
}

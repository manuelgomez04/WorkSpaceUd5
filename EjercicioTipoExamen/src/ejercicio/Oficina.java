package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

	private List<Trastero> listaTrasteros;

	public Oficina(List<Trastero> listaTrasteros) {
		super();
		this.listaTrasteros = listaTrasteros;
	}

	public List<Trastero> getListaTrasteros() {
		return listaTrasteros;
	}

	public void setListaTrasteros(List<Trastero> listaTrasteros) {
		this.listaTrasteros = listaTrasteros;
	}

	@Override
	public String toString() {
		return "Oficina [listaTrasteros=" + listaTrasteros + "]";
	}

	public void addTrastero(Trastero t) {
		listaTrasteros.add(t);
	}

	public List<Trastero> findPorPrecio(double precio) {
		List<Trastero> mismoPrecio = new ArrayList<Trastero>();

		for (Trastero trastero : listaTrasteros) {
			if (trastero.getPrecio() == precio) {
				mismoPrecio.add(trastero);
			}
		}

		return mismoPrecio;
	}

	public Trastero findPorNum(int num) {

		if (listaTrasteros.size() != 0) {
			for (Trastero trastero : listaTrasteros) {
				if (trastero.getNumTrastero() == num) {
					return trastero;
				}
			}
		}
		return null;
	}

	public Trastero findMasCaro() {
		Trastero t = null;

		for (Trastero trastero : listaTrasteros) {
			if (t == null || trastero.getPrecio() > t.getPrecio()) {
				t = trastero;
			}
		}
		return t;
	}

	public void borrarTrastero(int num) {
		listaTrasteros.remove(findPorNum(num));
	}

	public void modificarPrecio(int num, double precioNuevo) {
		findPorNum(num).setPrecio(precioNuevo);
	}

	public void mostrarListaNoOcupados() {
		for (Trastero trastero : listaTrasteros) {
			if (!trastero.isOcupado()) {
				System.out.println(trastero);
			}

		}
	}

	public void mostrarBuscadosPrecio(double precio) {
		for (Trastero trastero : findPorPrecio(precio)) {
			System.out.println(trastero);
		}
	}

	public void mostrarLista() {
		for (Trastero trastero : listaTrasteros) {
			System.out.println(trastero);
		}
	}
}
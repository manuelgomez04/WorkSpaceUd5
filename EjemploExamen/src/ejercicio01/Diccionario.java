package ejercicio01;

import java.util.Iterator;
import java.util.List;

public class Diccionario {

	private List<Palabra> listaPalabras;

	public Diccionario(List listaPalabras) {
		super();
		this.listaPalabras = listaPalabras;
	}

	public List getListaPalabras() {
		return listaPalabras;
	}

	public void setListaPalabras(List listaPalabras) {
		this.listaPalabras = listaPalabras;
	}

	@Override
	public String toString() {
		return "Diccionario [listaPalabras=" + listaPalabras + "]";
	}

	public void addWord(Palabra p, String nuevoSignificado) {
		listaPalabras.add(p);

		// Para que si una palabra que queremos añadir ya existe y no sean duplicados

//		Iterator<Palabra> iteratorPalabra = listaPalabras.iterator();
//		Palabra palabraBuscada;
//		boolean encontrado = false;
//
//		while (iteratorPalabra.hasNext() && !encontrado) {
//
//			palabraBuscada = iteratorPalabra.next();
//
//			if (p.getNombre().equalsIgnoreCase(palabraBuscada.getNombre())) {
//				p.setNombre(palabraBuscada.getSignificado() + "," + nuevoSignificado);
//				encontrado = true;
//			} else while (!iteratorPalabra.hasNext()) {
//		listaPalabras.add(p);
//	}
//		}
//		
	}

	public Palabra findPalabraPorNombre(String nombre) {
		Palabra p = null;

		if (listaPalabras.size() > 0) {

			for (Palabra palabra : listaPalabras) {
				if (palabra.getNombre().equalsIgnoreCase(nombre)) {
					return palabra;
				}
			}
		}

		return p;
	}

	public void modificarPalabra(String nombre, String significado) {
		findPalabraPorNombre(nombre).setSignificado(significado);
	}

	public void borrarPalabra(String nombre) {
		listaPalabras.remove(findPalabraPorNombre(nombre));
	}

	public void mostrarConIterator() {

		Iterator<Palabra> it = listaPalabras.iterator();

		for (int i = 0; i < listaPalabras.size(); i++) {
			if (it.hasNext()) {
				System.out.println(listaPalabras.get(i));
			}
		}

	}
}

package ejercicio01;

import java.util.Comparator;

public class OrdenaPorNombre implements Comparator<Palabra> {

	@Override
	public int compare(Palabra o1, Palabra o2) {

		return -(o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase()));
	}

}

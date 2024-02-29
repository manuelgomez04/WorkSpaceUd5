package ejercicio06;

import java.util.Comparator;

public class CompararNombreYSueldo implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador o1, Trabajador o2) {
		Trabajador t = new Trabajador();

		if (o1.getNombre().equalsIgnoreCase(o2.getNombre())) {
			return t.compareTo(o2);
		} else {
			return -(o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase()));
		}
	}

}

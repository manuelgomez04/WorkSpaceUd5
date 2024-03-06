package ejercicio06;

import java.util.Comparator;

public class CompararNombreYSueldo implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador o1, Trabajador o2) {

		ComparaSueldo cs = new ComparaSueldo();

		if (o1.getNombre().equalsIgnoreCase(o2.getNombre())) {
			return cs.compare(o1, o2);
		} else {
			return (o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase()));
		}
	}

}

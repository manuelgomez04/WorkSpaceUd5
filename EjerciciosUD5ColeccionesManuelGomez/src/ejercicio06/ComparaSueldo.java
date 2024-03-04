package ejercicio06;

import java.util.Comparator;

public class ComparaSueldo implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador o1, Trabajador o2) {

		if (o1.getSueldoFinal() < o2.getSueldoFinal()) {
			return 1;
		} else {
			if (o1.getSueldoFinal() > o2.getSueldoFinal()) {
				return -1;
			}
		}

		return 0;
	}

}

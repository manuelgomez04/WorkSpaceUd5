package ejercicio;

import java.util.Comparator;

public class OrdenaGolesMarcados implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		if (o1.getGolesAnotados() < o2.getGolesAnotados()) {
			return 1;
		} else {
			if (o1.getGolesAnotados() > o2.getGolesAnotados()) {
				return -1;
			}
		}
		return 0;
	}

}

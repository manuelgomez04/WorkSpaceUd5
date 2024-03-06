package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Equipo {

	private List<Jugador> listaJugadores;
	private String nombreEquipo;

	public Equipo(List<Jugador> listaJugadores, String nombreEquipo) {
		super();
		this.listaJugadores = listaJugadores;
		this.nombreEquipo = nombreEquipo;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	@Override
	public String toString() {
		return "Equipo [listaJugadores=" + listaJugadores + ", nombreEquipo=" + nombreEquipo + "]";
	}

	public void addJugador(Jugador j) {
		listaJugadores.add(j);
	}

	public Jugador findByDorsal(int dorsal) {

		for (Jugador jugador : listaJugadores) {
			if (jugador.getDorsal() == dorsal) {
				return jugador;
			}
		}
		return null;
	}

	public List<Jugador> findNoGoles() {
		List<Jugador> listaEncontrados = new ArrayList<>();

		Iterator<Jugador> it = listaJugadores.iterator();
		int contador = 0;

		while (it.hasNext()) {
			if (it.next().getGolesAnotados() == 0) {
				listaEncontrados.add(listaJugadores.get(contador));

			}
			contador++;
		}
		return listaEncontrados;

	}

	public void mostrarNoGoles() {
		Iterator<Jugador> it = findNoGoles().iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

	public void mostrarLista() {
		Iterator<Jugador> it = listaJugadores.iterator();
		int contador = 0;

		for (int i = 0; i < listaJugadores.size(); i++) {
			if (it.hasNext()) {
				System.out.println(listaJugadores.get(i));
			}
		}
	}

	public double calcularMediaGoles() {

		double sum = 0;
		for (Jugador jugador : listaJugadores) {
			sum += jugador.getGolesAnotados();
		}
		return sum / listaJugadores.size();
	}

	public void modificarPosicion(int dorsal, String posicion) {
		findByDorsal(dorsal).setPosicion(posicion);
	}

	public void ordenarNatural() {
		Collections.sort(listaJugadores);
	}

	public void ordenarNumGoles() {
		Collections.sort(listaJugadores, new OrdenaGolesMarcados());
	}

}

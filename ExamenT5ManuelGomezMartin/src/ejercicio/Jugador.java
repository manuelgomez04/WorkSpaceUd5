package ejercicio;

public class Jugador implements Comparable<Jugador> {

	private String nombre;
	private String posicion;
	private int dorsal;
	private int golesAnotados;
	private boolean esTitular;

	public Jugador(String nombre, String posicion, int dorsal, int golesAnotados, boolean esTitular) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.dorsal = dorsal;
		this.golesAnotados = golesAnotados;
		this.esTitular = esTitular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getGolesAnotados() {
		return golesAnotados;
	}

	public void setGolesAnotados(int golesAnotados) {
		this.golesAnotados = golesAnotados;
	}

	public boolean isEsTitular() {
		return esTitular;
	}

	public void setEsTitular(boolean esTitular) {
		this.esTitular = esTitular;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", dorsal=" + dorsal + ", golesAnotados="
				+ golesAnotados + ", esTitular=" + esTitular + "]";
	}

	@Override
	public int compareTo(Jugador o) {

		return this.getPosicion().toLowerCase().compareTo(o.getPosicion().toLowerCase());
	}

}

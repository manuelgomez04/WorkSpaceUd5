package ejemplo03;

public class Viaje {

	private String pais;

	public Viaje(String pais) {
		super();
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Viaje [pais=" + pais + "]";
	}

}

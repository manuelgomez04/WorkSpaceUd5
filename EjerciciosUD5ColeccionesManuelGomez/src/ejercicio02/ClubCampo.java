package ejercicio02;

public class ClubCampo {

	private CrudSocio cs;

	public ClubCampo(CrudSocio cs) {
		super();
		this.cs = cs;
	}

	public CrudSocio getCs() {
		return cs;
	}

	public void setCs(CrudSocio cs) {
		this.cs = cs;
	}

	@Override
	public String toString() {
		return "ClubCampo [cs=" + cs + "]";
	}

	public double calcularTotal() {
		double total = 0;
		int i = 0;
		for (Socio s : cs.getListaSocios()) {
			total += cs.getListaSocios().get(i).getCuotaBase();
		}
		return total;
	}

}

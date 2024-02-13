package ejemploSet;

import java.util.List;

import ejemploLiist.Persona;

public class CrudPersona {

	private List<Persona> lista2;

	public CrudPersona(List<Persona> lista2) {
		super();
		this.lista2 = lista2;
	}

	public Persona buscarPorDni(String dni) {

		boolean encontrado = false;
		// Persona persona = new Persona(2, dni, "pp");

//		for (int i = 0; i < lista.size() && !encontrado; i++) {
//			Iterator<Persona> itPer = lista.iterator();
//			if (itPer.hasNext()) {
//				Persona persona1 = itPer.next();
//				
//				Boolean sonIguales = persona1.getDni().equalsIgnoreCase(dni);
//
//				if (sonIguales) {
//					encontrado = true;
//					persona=persona1;
//				}
//			}
//
//		}

//		for (Persona persona1 : lista) {
//			Boolean sonIguales = persona1.getDni().equalsIgnoreCase(dni);
//
//			if (sonIguales) {
//				encontrado = true;
//				persona = persona1;
//
//			}
//		}
//
//		return persona;

		// lista.stream().filter(persona213 ->
		// persona213.getDni().equalsIgnoreCase(dni)).findAny().get();
//		 (Persona) lista.stream().filter(persona213 -> persona213.getDni().equalsIgnoreCase(dni))
//				.collect(Collectors.toList()).get(0);

		return lista2.stream().filter(persona213 -> persona213.getDni().equalsIgnoreCase(dni)).findAny().get();
	}

}

package ejemploLiist;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listado = new ArrayList<String>();
		listado.add("Ángel");
		listado.add("Rafa");
		listado.add("Juanjo");

		listado.contains("Rafa");
		System.out.println(listado.contains("Rafa"));

		System.out.println(listado);

		listado.remove(1);

		System.out.println(listado);

		System.out.println(listado.size());
		listado.remove(0);

		System.out.println(listado);

	}

}

package ejemplo02;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<String> nombres = new ArrayList<>();

		nombres.add("Bruno");
		nombres.add("Moises");
		nombres.add("Victor");
		nombres.add("Carlos");
		nombres.add("Manuel");

		// nombres.stream().filter(nombre -> nombre.contains("V")).findAny().get();
		System.out.println(nombres.stream().filter(nombre -> nombre.contains("V")).findAny().get());

		nombres.stream().count();
	}

}

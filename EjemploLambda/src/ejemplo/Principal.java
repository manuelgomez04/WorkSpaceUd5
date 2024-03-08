package ejemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {

		int dos = 2, e = 5, w = 6;
		double cinco = 50.0;

		List<String> lista = new ArrayList<>();

		lista.add("Juanjo");
		lista.add("Víctor");
		lista.add("Br1");
		lista.add("Moisés");

		String mensaje = "YOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW";
		IPrimeraInterfaz ipi = x -> System.out.println(mensaje);

		ipi.mostrarBienvenida(mensaje);
		System.out.println();

		IzMasDos izmd = (z, h) -> z + h;

		System.out.println(izmd.zetaMasDos(e, w));
		System.out.println();

		Supplier<Double> kmr = () -> Math.random();

		for (int i = 0; i < 5; i++) {
			System.out.println(kmr.get());
		}

		System.out.println();

		Consumer<String> mostrarMatricula = yow -> System.out.println(yow);

		for (String string : lista) {
			mostrarMatricula.accept(string);

		}
		System.out.println();

		Function<Double, Double> aMetros = km -> km * 1000;
		Function<Double, Double> aCm = mt -> mt * 100;

		System.out.println(aMetros.apply(cinco));
		System.out.println(aCm.apply(cinco));

		System.out.println(aMetros.andThen(aCm).apply(cinco));

	}

}

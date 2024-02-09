package ejemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// Se viene

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Hola");
		memberNames.add("Hola");
		memberNames.add("Hola");

		Stream<String> yow = memberNames.stream();

		yow.distinct().forEach(System.out::println);

	}

}

package ejemploForMejorado;

public class Principal {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int suma = 0;

		// Antes de los dos puntos se define una variable del tipo de lo que sea la
		// variable. Después de los dos puntos aparece el nombre del array;

		for (int valor : numeros) {
			suma += valor;

			System.out.println(valor);
		}
		System.out.println("La suma es: " + suma);
	}

}

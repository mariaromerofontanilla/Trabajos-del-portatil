package clases;

import java.util.Random;

/**
 * Clases con funciones para generar números aleatorios
 */
public class Aleatorios {

	/**
	 * Función que generá un número aleatorio las veces que le indique el usuario por teclado
	 * 
	 * @param cantidad de Número que introducirá el usuario para generar tantos números aleatorios como desee
	 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * Función que tambien genera un número las veces que le introduzca el usuario, pero adiferencia 
	 * de que el número generado no puede ser mayor que el maximo introducido
	 * 
	 * @param cantidad de Número que introducirá el usuario para generar tantos números aleatorios como desee
	 * @param max, Cantidad máxima que puede tomar un número aleatorio
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}

	/**
	 * Función que tambien genera un número las veces que le introduzca el usuario, pero adiferencia de que el número 
	 * generado no puede ser mayor que el maximo introducido ni menor que el introducido
	 * 
	 * @param cantidad de Número que introducirá el usuario para generar tantos números aleatorios como desee
	 * @param minimo, Cantidad máxima que puede tomar un número aleatorio.
	 * @param maximo, Cantidad mínima que puede tomar un número aleatorio.
	 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for (int i = 1; i <= cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo + 1);
			System.out.println(aleatorio);
		}
	}
}
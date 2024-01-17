package clases;

import java.util.Random;

/**
 * Clase tesoro simula un juego donde el usuario sera un jugador y buscar un tesoro en
 * un tablero
 */
public class Tesoro {

	/**
	 * Especifica el tamaño del tablero
	 */
	public static final int TAM_TABLERO = 5;

	/**
	 * Coordenada X donde se encuentra el tesoro
	 */
	static int xTesoro;

	/**
	 * Coordenada Y donde se encuentra el tesoro
	 */
	static int yTesoro;

	/**
	 * Coordenada X donde se encuentra el jugador en el tablero
	 */
	int xJugador = 1;

	/**
	 * Coordenada Y donde se encuentra el jugador en el tablero
	 */
	int yJugador = 1;

	/**
	 * Función que genera una posición aleatoria para el tesoro
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	/**
	 * Función se encarga de imprimir el tablero con la posición del jugador
	 */
	void pintaTablero() {
		// Imprimimos la primera línea de números
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de línea para comenzar con los números de la izquierda
		System.out.println();

		// Bucle para imprimir las líneas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número de línea
			System.out.print(i);
			// Si la línea coincide con la posición X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posición Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de línea para pasar a la siguiente línea
			System.out.println();
		}
	}

	/**
	 * Función que nos permite mover al jugador en el tablero mediante el comando espeficicado por el jugador
	 * 
	 * @param movimiento, Los comandos de movimiento son los siguientes (arriba, abajo, izquierda y derecha)
	 * @return 0 si el movimiento esta bien, -1 si esta fuera del tablero y -2 si el comando no es correcto
	 */
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}

		return res;
	}

	/**
	 * Función que comprueba si el jugador ha encontrado el tesoro escondido
	 * 
	 * @return Devuelve "true" si el jugador ha encontrado el tesoro, "false" si no lo ha encontrado.
	 */
	boolean buscaTesoro() {
		boolean res = false;
		if (xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}

package exament3;

import java.util.Scanner;

public class ParchisJuego {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner sc = new Scanner(System.in);
		// Nombre del jugador 1
		String nomJ1;
		// Nombre del jugador 2
		String nomJ2;
		// Mensaje de bienvenida
		System.out.println("¡Bienvenid@ a mi juego!");

		// Imprime de que introduzcas los nombre del jugador 1
		System.out.println("Introduce el nombre del jugador 1: ");
		// Scanner del nombre del jugador1
		nomJ1 = sc.nextLine();
		// Imprime de que introduzcas el nombre del jugador 2
		System.out.println("Introduce el nombre del jugador 2: ");
		// Scanner del nombre del jugador2
		nomJ2 = sc.nextLine();

		// Funcion de pinta tablero
		ParchisFuncion jugador = new ParchisFuncion();
		// Posicion que va a avanzar los
		jugador.avanzaPosicion(0);
		// Tirada de dados
		jugador.tiraDados();
		// Imprime por pantalla una serie d tiradas de los dados al hazar
		System.out.print("Ta tirada de dados da: " + jugador.dado1 + " y " + jugador.dado2);
		// salto de línea
		System.out.println();
		// Pinta el tablero
		jugador.pintaTablero();

		// Imprime el nombre de ambos jugadores
		System.out.println(nomJ1);
		System.out.println(nomJ2);
		// Cierre del Scanner
		sc.close();
	}

}

package exament3;

import java.util.Random;

public class ParchisFuncion {
	// Constante que marca la longitud del tablero
	public static final int TAM_TABLERO = 20;
	// Variables de las fichas de los jugadores
	int fichaJ1;
	int fichaJ2;
	// Variables de los dados
	static int dado1;
	static int dado2;
	// Variable del nombre de jugadores
	 String nomJ1;
	 String nomJ2;
	// Construnctor de las funciones ParchisFuncion sin parámetros
	public ParchisFuncion() {
		
	}
	// Constructor de la funcion ParchisFuncion con parámetros
	public ParchisFuncion(int fichaJ1, int fichaJ2, String nom1j1, String nomJ2) {
		this.nomJ1 = nom1j1;
		this.nomJ2 = nomJ2;
	}
	// Funcion de tiraDados que te dira la tirada de los dado en aleatorio.
	// Y el dado solo solo iene del 1 al 6
	static void tiraDados() {
		Random r = new Random();
		dado1 = r.nextInt(1,7);
		dado2 = r.nextInt(1,7);
	}
	// Funcion que pinta el tablero del juego, de 20 estacios
	public void pintaTablero(){
		// for para pintar el tablero
		for (int i =1; i <= TAM_TABLERO;i++) {
			// imprime el tablero de juego
			System.out.print("\t" + i);
			// For donde se pone donde ira la ficha
			for (int y=0; i<= fichaJ1;y++) {
				// Imprimeun tabulador
				System.out.print("/t");
				// imprime la posicion donde esta situado
				System.out.println("o");
			}
		}
		// Salto de línea
		System.out.println();
		// for para imprimir la parte del inicio
		for (int j=0;j<=2;j++) {
			// Imprime el lateral izquierdo en vertical poniendo tre I de inicio
			System.out.println("I");
		}
		
		// Imprime la posisión
		System.out.print("o");
		System.out.println();
	}
	// Entrada: nada
	// salida: numero
	// Funcionalidad: Elije que jugador empieza, y luego segun el numero que salga pues
	// Se modifican las chicas de cada jugador, mas la suma de los dados
	public void avanzaPosicion(int numero) {
		// Te genera un numero al azar del 1 al 2
		Random r = new Random();
		numero = r.nextInt(1,3);
		
		// le suma la cantidad de dados a cada ficha mas el valor de la ficha
		if (numero == 1) {
			fichaJ1 = fichaJ1 + (dado1 + dado2);
		} else {
			fichaJ2 = fichaJ2 + (dado1 + dado2);
		}
		// Si se sobre pasa del Tablero se le resta la cantidad que se ha sobre pasado del tablero
		if (fichaJ1 > TAM_TABLERO) {
			fichaJ1 = fichaJ1--;
		} else {
			fichaJ2 = fichaJ2--;
		}
	}
	// Funcion del estado de la carrera que en un punto concreto, en mi caso puse en el 10
	// Muestra el nombre del usuario que este en ese punto
	public void estadoCarrera() {
		if (fichaJ1 == 10) {
			System.out.println(nomJ1);
		} else if (fichaJ2 == 10){
			System.out.println(nomJ2);
		}
	}
	// Funcion del jugador ganador, cuando cualquiera de los dos jugadores llegue al 20
	// saldra el nombre del jugador que ha ganado la carrera
	// de lo contrario si nadie llego pondra cadana vasia hasta que uno de los dos llegue
	public void esGanador() {
		if (fichaJ1 == 20) {
			System.out.println(nomJ1);
		} else if (fichaJ2 == 20){
			System.out.println(nomJ2);
		} else {
			System.out.println("");
		}
	}
		
	
	
}

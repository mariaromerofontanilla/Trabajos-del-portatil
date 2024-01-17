package exament3;

import java.util.Scanner;

public class Parchis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el nombre del jugador 1: ");
		String nomJ1 = sc.nextLine();

		// Solicitar nombre del jugador 2 hasta que sea diferente al del jugador 1
		System.out.print("Ingrese el nombre del jugador 2: ");
		String nomJ2 = sc.nextLine();
		
		while (nomJ1.toLowerCase().equals(nomJ2.toLowerCase())) {
			System.out.println("Los nombres de los jugadores no pueden ser iguales. Intente nuevamente.");
			System.out.print("Ingrese el nombre del jugador 2: ");
			nomJ2 = sc.nextLine();
		}

		// Crear una instancia de la clase Jugadores con los nombres ingresados
		Funciones jugadores = new Funciones(nomJ1, nomJ2);
		
		String avanzar = "";
		int jugadorActual = 1;
		String nombreActual = nomJ1;
		
		while (jugadores.esGanador() == "") {
			if (avanzar == "") {
				System.out.print("Ingrese un caracter para avanzar: ");
				avanzar = sc.nextLine();
			} else {
				Funciones.avanzaPosiciones(jugadorActual);
				
				System.out.println();
				
				System.out.println("Turno de: " + nombreActual);
				
				System.out.println();
				
				System.out.println("La tirada ha sido " + Funciones.getDado1() + " y " + Funciones.getDado2());
				System.out.println();
				
				jugadores.pintaTablero();
				
				if (Funciones.getDado1() != Funciones.getDado2()) {
					jugadorActual = (jugadorActual == 1) ? 2 : 1;
					nombreActual = (nombreActual == nomJ1) ? nomJ2 : nomJ1;
				}
				
				jugadores.estadoCarrera();
				avanzar = "";
			}
		}
		
		System.out.println("Ha ganado " + jugadores.esGanador());
	}
}

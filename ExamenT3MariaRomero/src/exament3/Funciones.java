package exament3;

import java.util.Random;

public class Funciones {
	final static int TAM_TABLERO = 20;
	static int fichaJ1 = 0;
	static int fichaJ2 = 0;
	static int dado1;
	static int dado2;
	String nomJ1;
	String nomJ2;
	
	public Funciones(String nomJ1, String nomJ2) {
		this.nomJ1 = nomJ1;
		this.nomJ2 = nomJ2;
	}

	public Funciones() {
		
	}
	
	public static void tiraDados() {
		Random r = new Random();
		dado1 = r.nextInt(1,7);
		dado2 = r.nextInt(1,7);
	}
	
	public void pintaTablero() {
		String numeros = "";
		String j1 = "";
		String j2 = "";
		
		for (int i= -1; i < TAM_TABLERO; i++) {
			if (i == 0) {
				numeros += "I\t";
				j1 += "I\t";
				j2 += "I\t";
			} else if (i > 0) {
				numeros += i + "\t";
				
				if (fichaJ1 > 0 && fichaJ1 == i) {
					j1 += "0\t";
					if (fichaJ2 == fichaJ1) {
						j2 += "0\t";
					} else {
						j2 += "\t";
					}
				} else if (fichaJ2 > 0 && fichaJ2 == i) {
					j2 += "0\t";
					if (fichaJ1 == fichaJ2) {
						j1 += "0\t";
					} else {
						j1 += "\t";
					}
				} else {
					j1 += "\t";
					j2 += "\t";
				}
				
			} else if (i == -1) {
				numeros += "\t";
				j1 += this.nomJ1 + "\t";
				j2 += this.nomJ2 + "\t";
				
			}
		}
		numeros += "F";
		j1 += "F";
		j2 += "F";
		
		System.out.println(numeros);
		System.out.println(j1);
		System.out.println(j2);
	}
	
	public static void avanzaPosiciones(int jugador) {
		tiraDados();
		
		int suma = dado1 + dado2;
		int posicion;
		
		if (jugador == 1) {
			posicion = fichaJ1 + suma;
			fichaJ1 = (posicion <= TAM_TABLERO) ? posicion : 2 * TAM_TABLERO - (fichaJ1 + posicion);
		} else {
			posicion = fichaJ2 + suma;
			fichaJ2 = (posicion <= TAM_TABLERO) ? posicion : 2 * TAM_TABLERO - (fichaJ2 + posicion);
		}
	}
	
	public void estadoCarrera() {
		if (fichaJ1 > fichaJ2) {
			System.out.println("Va ganando " + this.nomJ1);
		} else if (fichaJ2 > fichaJ1) {
			System.out.println("Va ganando " + this.nomJ2);
		} else {
			System.out.println("Van empate");
		}
	}
	
	public String esGanador() {
		if (fichaJ1 == TAM_TABLERO) {
			return this.nomJ1;
		}
		
		if (fichaJ2 == TAM_TABLERO) {
			return this.nomJ2;
		}
		
		return "";
	}
	
	public static int getDado1() {
		return dado1;
	}
	
	public static int getDado2() {
		return dado2;
	}

}

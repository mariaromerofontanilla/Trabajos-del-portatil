package examen;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * CASO 1: Usuario introduce 500 || Resultado: 1 billete d: 500€
 * CASO 2: Usuario introduce 200 || Resultado: 1 billete d: 200€
 * CASO 3: Usuario introduce 100 || Resultado: 1 billete d: 100€
 * CASO 4: Usuario introduce 50 || Resultado: 1 billete d: 50€
 * CASO 5: Usuario introduce 20 || Resultado: 1 billete d: 20€
 * CASO 6: Usuario introduce 10 || Resultado: 1 billete d: 10€
 * CASO 7: Usuario introduce 500 || Resultado: 1 billete d: 5€
 */
public class ejercicio02 {

	public static void main(String[] args) {
		// Constantes de los billetes
		final int BILLETE500 = 500;
		final int BILLETE200 = 200;
		final int BILLETE100 = 100;
		final int BILLETE50 = 50;
		final int BILLETE20 = 20;
		final int BILLETE10 = 10;
		final int BILLETE5 = 5;
		// Variable de canidad de dinero que pondra el suuario, billete
		int cantidad = 0;
		int cantidadBillete=0;
		String respuesta = "";
		// Crear Scanner
		Scanner sc = new Scanner(System.in);
		// while para comenzar el programa
		while (true) {
			// Imprime por pantala de que intropduzcas euros
			System.out.println("Introduzca los euros: ");
			// Scanner de variable cantidad
			cantidad = sc.nextInt();
			// if de que si la cantidad introducida es multiplo de 5 y cantidad es mayor a 0 que haga lo siguiente
			if (cantidad%5==0 && cantidad > 0) {
				// if de que si la cantidad el mayor o igual a 500
				if (cantidad>=500) {
					// cantidad de billete igual a cantidad entre billete 500
					cantidadBillete= cantidad/BILLETE500;
					// Si la cantidad es mayor a 0
					if (cantidadBillete > 0) {
						// Imprime por pantalla la cantidad de billetes de ese billete
						 System.out.println(cantidadBillete + " billete de: " + BILLETE500 + " €");
						 // cantidad mosulo de 500
						 cantidad%=BILLETE500;
					 }
				}
				// if de que si la cantidad el mayor o igual a 200
				if (cantidad>=200) {
					// cantidad de billete igual a cantidad entre billete 200
					cantidadBillete= cantidad/BILLETE200;
					// Si la cantidad es mayor a 0
					if (cantidadBillete > 0) {
						// Imprime por pantalla la cantidad de billetes de ese billete
						 System.out.println(cantidadBillete + " billete de: " + BILLETE200 + " €");
						 // cantidad mosulo de 200
						 cantidad%=BILLETE200;
					 }
				
			}
				// if de que si la cantidad el mayor o igual a 100
				if (cantidad>=100) {
					// cantidad de billete igual a cantidad entre billete 100
					cantidadBillete= cantidad/BILLETE100;
					// Si la cantidad es mayor a 0
					if (cantidadBillete > 0) {
						// Imprime por pantalla la cantidad de billetes de ese billete
						 System.out.println(cantidadBillete + " billete de: " + BILLETE100 + " €");
						// cantidad mosulo de 100
						 cantidad%=BILLETE100;
					 }
			}
				// if de que si la cantidad el mayor o igual a 50
				if (cantidad>=50) {
					// cantidad de billete igual a cantidad entre billete 50
					cantidadBillete= cantidad/BILLETE50;
					// Si la cantidad es mayor a 0
					if (cantidadBillete > 0) {
						// Imprime por pantalla la cantidad de billetes de ese billete
						 System.out.println(cantidadBillete + " billete de: " + BILLETE50 + " €");
						// cantidad mosulo de 50
						 cantidad%=BILLETE50;
					 }
			}
				// if de que si la cantidad el mayor o igual a 20
				if (cantidad>=20) {
					// cantidad de billete igual a cantidad entre billete 20
					cantidadBillete= cantidad/BILLETE20;
					// Si la cantidad es mayor a 0
					if (cantidadBillete > 0) {
						// Imprime por pantalla la cantidad de billetes de ese billete
						 System.out.println(cantidadBillete + " billete de: " + BILLETE20 + " €");
						// cantidad mosulo de 20
						 cantidad%=BILLETE20;
					 }
			}
				// if de que si la cantidad el mayor o igual a 10
				if (cantidad>=10) {
					// cantidad de billete igual a cantidad entre billete 10
					cantidadBillete= cantidad/BILLETE10;
					// Si la cantidad es mayor a 0
					if (cantidadBillete > 0) {
						// Imprime por pantalla la cantidad de billetes de ese billete
						 System.out.println(cantidadBillete + " billete de: " + BILLETE10 + " €");
						// cantidad mosulo de 10
						 cantidad%=BILLETE10;
					 }
			}
				// if de que si la cantidad el mayor o igual a 5
				if (cantidad>=5) {
					// cantidad de billete igual a cantidad entre billete 5
					cantidadBillete= cantidad/BILLETE5;
					// Si la cantidad es mayor a 0
					if (cantidadBillete > 0) {
						// Imprime por pantalla la cantidad de billetes de ese billete
						 System.out.println(cantidadBillete + " billete de: " + BILLETE5 + " €");
						// cantidad mosulo de 5
						 cantidad%=BILLETE5;
					 }
			}
			// de lo contrario
			else {
				// Imprime por pantalla Quieres poner de nuevo otra cantidad:
				System.out.println("Quieres poner de nuevo otra cantidad: ");
				// Scanner respuesta
				respuesta = sc.nextLine();
				// if de que si la respuesta es lo contrario a S se salga
				if (!respuesta.equals("S")) {
					break;
				}
			}
}
		// cierre del Scanner
		sc.close();
	}
}
}
package examen;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Este ejercicio trata de realizar un hexágono:
 * CASO 1: Usuario introduce 4 ||
 * Resultado: ******
 *			 ********
 *			**********
 *			 ********
 *			  ******
 * CASO 2: Usuario introduce -1 || Resultado: Has introducido un numero mayor que 0.
 *
 */
public class ejercicio01 {

	public static void main(String[] args) {
		// variable 
		// numero entero num
		int num=0;
		// Scanner de la variable
		Scanner sc = new Scanner(System.in);
			// Imprime por pantalla de que introduzcas un numero entero
			System.out.println("Introduzca un numero entero: ");
			// Scanner de la variable num
			num = sc.nextInt();
			// if de que si el numero es mayor a 0 ejecute lo que ahi dentro de el
			if (num>0 ) {
			// for de que si la variable i es menor o igual al numero dado por el usuario la variable se sume
			for(int i=3;i<=num;i++) {
				// for de que si la variable j es menos al numero - la variable i, imprie espacio
				for ( int j =0;j<num-i;j++) {
					// Imprime por pantalla un spacio
					System.out.print(" ");
				}
				// for de que si la variable j es menor a la variable i*2, imprime asterisco
				for (int j =0;j<i*2;j++) {
					// Imprime por pantalla un asterisco
					System.out.print("*");
				}
				// Salto de línea
				System.out.println();
			}
			// for de que si la variable i es menor o igual al numero dado por el usuario la variable se sume
			for(int i=3;i<=num;i++) {
			// for de que si la variable j es menos al numero - la variable i, imprie espacio
			for ( int j =0;j<num-i;j++) {
			// Imprime por pantalla un spacio
			System.out.print(" ");
			}
			// for de que si la variable j es menor a la variable i*2, imprime asterisco
			for (int j =0;j<i*2;j++) {
			// Imprime por pantalla un asterisco
			System.out.print("*");
			}
			// Salto de línea
			System.out.println();
			}
		// else de que si la condiciondel if no se cumple haga lo siguiente
		} else {
			// Imprime por pantalla Has introducido un numero menor que 0.
			System.out.println("Has introducido un numero menor que 0.");
		}
			// Cierre del Scanner
			sc.close();
}
}

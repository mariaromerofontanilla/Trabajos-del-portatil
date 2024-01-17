package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la longitud: ");
		int longitud = sc.nextInt();
		
		System.out.print("Introduce el final: ");
		int fin = sc.nextInt();
		
		int[] tabla = rellenaPares(longitud, fin);
		
		System.out.println(Arrays.toString(tabla));

	}
	
	public static int[] rellenaPares(int longitud, int fin) {
		int[] tabla = new int[longitud];
		
		if ((fin / 2) > longitud) {
			System.out.println("Error. Tienes que indicar más longitud");
		} else {
			int cont = 0;
			for (int i =2; i <= fin; i+=2) {
				tabla[cont] = i;
				cont++;
			}
		}
		
		return tabla;
		
	}

}

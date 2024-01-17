package examen2022;

import java.util.Scanner;

public class eje5 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una milla: ");
		numero = sc.nextInt();
		
		
		System.out.println("Las millas que has introducido son: " + numero + " y los kilometros son: " + millasKilometros(numero));

	}
	
	public static double millasKilometros(int millas) {
		return millas * 1.60934;
	}

}

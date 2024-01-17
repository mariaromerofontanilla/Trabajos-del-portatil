package examen;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// Variables
		final int BILLETE500 = 500;
		final int BILLETE200 = 200;
		final int BILLETE100 = 100;
		final int BILLETE50 = 50;
		final int BILLETE20 = 20;
		final int BILLETE10 = 10;
		final int BILLETE5 = 5;
		int cantidad = 0;
		int cantidadBillete = 0;
		String pregunta = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la cantidad de billetes: ");
		cantidad = sc.nextInt();

		do{
			
			if (cantidad % 5 == 0 && cantidad > 0) {
				if (cantidad >= 500) {
					cantidadBillete= cantidad/BILLETE500;
					if (cantidadBillete > 0) {
						System.out.println(cantidadBillete + " Billete de: " + BILLETE500 + " €");
						cantidad %= BILLETE500;
					}
				}
				if (cantidad >= 200) {
					cantidadBillete = cantidad/BILLETE200;
					if (cantidadBillete > 0) {
						System.out.println(cantidadBillete + " Billete de: " + BILLETE200 + " €");
						cantidad %= BILLETE200;
					}
				}
				if (cantidad >= 100) {
					cantidadBillete = cantidad/BILLETE100;
					if (cantidadBillete > 0) {
						System.out.println(cantidadBillete + " Billete de: " + BILLETE100 + " €");
						cantidad %= BILLETE100;
					}
				}
				if (cantidad >= 50) {
					cantidadBillete = cantidad/BILLETE50;
					if (cantidadBillete > 0) {
						System.out.println(cantidadBillete + " Billete de: " + BILLETE50 + " €");
						cantidad %= BILLETE50;
					}
				}
				if (cantidad >= 20) {
					cantidadBillete = cantidad/BILLETE20;
					if (cantidadBillete > 0) {
						System.out.println(cantidadBillete + " Billete de: " + BILLETE20 + " €");
						cantidad %= BILLETE20;
					}
				}
				if (cantidad >= 10) {
					cantidadBillete = cantidad/BILLETE10;
					if (cantidadBillete > 0) {
						System.out.println(cantidadBillete + " Billete de: " + BILLETE10 + " €");
						cantidad %= BILLETE10;
					}
				}
				if (cantidad >= 5) {
					cantidadBillete = cantidad/BILLETE5;
					if (cantidadBillete > 0) {
						System.out.println(cantidadBillete + " Billete de: " + BILLETE5 + " €");
						cantidad %= BILLETE5;
					}
				}
			}
			System.out.println("Introduce S en caso que deses continuar: ");
			pregunta = sc.nextLine();
			cantidad = sc.nextInt();
		}while(!pregunta.equals("N"));
	}

}

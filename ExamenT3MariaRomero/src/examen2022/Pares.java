package examen2022;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		while (num <= 0) {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
		}
		
		String numS = String.valueOf(num);
		
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < numS.length(); i++) {
			if (numS.charAt(i) % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("El numero " + num + " tiene " + impares + " cifras impares y " + pares + " cifras pares");

	}

}

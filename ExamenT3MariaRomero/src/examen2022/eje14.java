package examen2022;

import java.util.Scanner;

public class eje14 {

	public static void main(String[] args) {
		int numero;
		char letra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		numero = sc.nextInt();
		
		System.out.println("Introduce una letra: ");
		letra = sc.next().charAt(0);
		
		piramide(numero, letra);
		

	}
	
	public static  void piramide(int lineas, char caracter) {
		for (int i = 1; i <= lineas; i++) {
			for (int j = 0; j < lineas - i; j++) {
                System.out.print(" ");
            }
			
			for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(caracter);
            }
			
			System.out.println();
			System.out.println();
		}
	}

}

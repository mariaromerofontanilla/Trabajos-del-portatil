package examen2022;

import java.util.Scanner;

public class Cuadrad0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while (num <= 0) {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || i == num-1) {
					System.out.print("*");
				} else {
					if (j == 0 || j == num - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}

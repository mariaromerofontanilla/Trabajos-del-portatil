package examen2022;

import java.util.Scanner;

public class Nota2 {

	public static void main(String[] args) {
		// Variables
		String nombreAlumno = "";
		String alumnoMaxima = "";
		String alumnoMinima = "";
		int opcion;
		int practica = -1;
		int problema = -1;
		int teoria = -1;
		double calculo = 0;
		int contadorAlumno = 0;
		double maxima = 0;
		double minima = 10;
		double media = 0;
		int cont = 0;
 
		Scanner sc  = new Scanner(System.in);
		
		while(!nombreAlumno.equals("0")) {
			System.out.print("Introduce el nombre de alumno: ");
			nombreAlumno = sc.nextLine();
			
			if (!nombreAlumno.equals("0") ) {
				while (practica < 0 || practica > 10) {
					System.out.print("Introduce la nota de practica: ");
					practica = sc.nextInt();
				}
				cont++;
				calculo += practica * 0.10;
				double maxAux = maxima;
				double minAux = minima;
				
				maxima = (practica > maxima) ? practica : maxima;
				minima = (practica < minima) ? practica : minima;
				
				alumnoMaxima = (practica > maxAux) ? nombreAlumno : alumnoMaxima;
				alumnoMinima = (practica < minAux) ? nombreAlumno : alumnoMinima;
				maxAux = maxima;
				minAux = minima;
				
				while (teoria < 0 || teoria > 10) {
					System.out.print("Introduce la nota de teoria: ");
					teoria = sc.nextInt();
				}
				cont++;
				calculo += teoria * 0.40;
				maxima = (teoria > maxima) ? teoria : maxima;
				minima = (teoria < minima) ? practica : minima;
				
				alumnoMaxima = (teoria > maxAux) ? nombreAlumno : alumnoMaxima;
				alumnoMinima = (teoria < minAux) ? nombreAlumno : alumnoMinima;
				
				maxAux = maxima;
				minAux = minima;
				
				while (problema < 0 || problema > 10) {
					System.out.print("Introduce la nota de problema: ");
					problema = sc.nextInt();
				}
				cont++;
				calculo += problema * 0.50;
				maxima = (problema > maxima) ? problema : maxima;
				minima = (problema < minima) ? practica : minima;
				
				alumnoMaxima = (problema > maxAux) ? nombreAlumno : alumnoMaxima;
				alumnoMinima = (problema < minAux) ? nombreAlumno : alumnoMinima;
				
				maxAux = maxima;
				minAux = minima;
				
				
				
				practica = -1;
				problema = -1;
				teoria = -1;
				practica = -1;
				sc.nextLine();
			}
			
			
			
		}
		System.out.println();
		System.out.println("Menú: ");
		System.out.println("1. Nota máxima");
		System.out.println("2. Nota mínima");
		System.out.println("3. Media de las notas");
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1: 
			System.out.println("La maxima nota la ha sacado " + alumnoMaxima + " y ha sido un " + maxima);
			break;
		case 2:
			System.out.println("La minima nota la ha sacado " + alumnoMinima + " y ha sido un " + minima);
			break;
		case 3:
			System.out.printf("La media de todas las notas es: %.2f", calculo / cont);
			break;
		default:
			System.out.println("No has elegido ninguna de las opciones anteriores.");
			break;
		}
		sc.close();
	}

}

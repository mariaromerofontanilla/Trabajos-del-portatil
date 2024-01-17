package examen2022;

import java.util.Scanner;

public class Ejer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombreAlumno;
		double media;
		double notaPractica;
		double notaProblema;
		double notaTeoria;
		double notaFinal;
		int contadorAlumno = 0;
		double sumaNota = 0;
		String nombreMax = "";
		String nombreMin = "";
		double notaMax = 0;
		double notaMin = 10;
		double notaMedia;
		int opcion = 0;
		
		System.out.println("Introduce el nombre del alumno: ");
		
		while (true) {
			nombreAlumno = sc.nextLine();
			
			if (nombreAlumno.equals("0")){
				break;
			}
			System.out.println("Introduce la nota de la parte practica: ");
			notaPractica = sc.nextDouble();
			
			System.out.println("Introduce la nota de problema: ");
			notaProblema = sc.nextDouble();
			
			System.out.println("Introduce la nota de la parte de la teoria: ");
			notaTeoria = sc.nextDouble();
			
			if (notaPractica < 0 || notaPractica > 10 || notaProblema < 0 || notaProblema > 10 || 
					notaTeoria < 0 || notaTeoria > 10) {
				System.out.println("Error debes de introduce notas entre 0 y 10");
				sc.nextLine();
				continue;
			}
			notaFinal = (notaPractica * 0.10) + (notaProblema * 0.50) + (notaTeoria * 0.40);
			
			sumaNota = sumaNota + notaFinal;
			contadorAlumno++;
			
			if (notaFinal > notaMax) {
				notaFinal = notaMax;
				nombreAlumno = nombreMax;
			}
			
			if (notaFinal < notaMin) {
				notaFinal = notaMin;
				nombreAlumno = nombreMin;
			}
			
			System.out.println("Menu: ");
			System.out.println("1. Nota maxima");
			System.out.println("2. Nota minima");
			System.out.println("3. Media de las notas");
			
			switch (opcion){
			case 1: 
				System.out.println("La nota maxima es: " + notaMax + " y corresponde al alumno: " + nombreMax);
				break;
			case 2:
				System.out.println("La nota minima es: " + notaMin + " y corresponde al alumno: " + nombreMin);
				break;
			case 3:
				media = sumaNota / contadorAlumno;
				System.out.println("La media de las notas es: " + media);
				break;
			default:
				System.out.println("Error");
			}
		}
		
	sc.close();
	}

}

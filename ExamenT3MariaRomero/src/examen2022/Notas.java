package examen2022;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int contadorAlumnos = 0;
        String nombreAlumno;
        double notaPractica, notaProblemas, notaTeorica, notaFinal;
        double sumaNotas = 0;
        double notaMaxima = 0;
        double notaMinima = 0;
        String nombreMaxima = "";
        String nombreMinima = "";

        System.out.println("Introduce el nombre del alumno o escribe 0 para finalizar:");

        while (true) {
            nombreAlumno = sc.nextLine();

            if (nombreAlumno.equals("0")) {
                break;
            }

            System.out.println("Introduce la nota de la parte práctica (0-10):");
            notaPractica = sc.nextDouble();

            System.out.println("Introduce la nota de la parte de problemas (0-10):");
            notaProblemas = sc.nextDouble();

            System.out.println("Introduce la nota de la parte teórica (0-10):");
            notaTeorica = sc.nextDouble();

            // Validar que las notas estén en el rango correcto
            if (notaPractica < 0 || notaPractica > 10 || notaProblemas < 0 || notaProblemas > 10
                    || notaTeorica < 0 || notaTeorica > 10) {
                System.out.println("Error: Las notas deben estar entre 0 y 10. Introduce los datos nuevamente.");
                sc.nextLine(); // Limpiar el buffer del sc
                continue; // Volver al inicio del bucle
            }

            // Calcular la nota final
            notaFinal = (notaPractica * 0.10) + (notaProblemas * 0.50) + (notaTeorica * 0.40);

            // Actualizar estadísticas
            sumaNotas += notaFinal;
            contadorAlumnos++;

            if (notaFinal > notaMaxima) {
                notaMaxima = notaFinal;
                nombreMaxima = nombreAlumno;
            }

            if (notaFinal < notaMinima) {
                notaMinima = notaFinal;
                nombreMinima = nombreAlumno;
            }

            // Solicitar el nombre del siguiente alumno
            System.out.println("Introduce el nombre del siguiente alumno o escribe 0 para finalizar:");
            sc.nextLine(); // Limpiar el buffer del sc
        }

        // Mostrar menú de opciones
        System.out.println("\nMenú:");
        System.out.println("1. Nota máxima");
        System.out.println("2. Nota mínima");
        System.out.println("3. Media de las notas");
        System.out.println("Seleccione una opción:");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La nota máxima es " + notaMaxima + " y pertenece a " + nombreMaxima);
                break;
            case 2:
                System.out.println("La nota mínima es " + notaMinima + " y pertenece a " + nombreMinima);
                break;
            case 3:
                double media = sumaNotas / contadorAlumnos;
                System.out.println("La media de las notas es " + media);
                break;
            default:
                System.out.println("Opción no válida");
        }

        // Cerrar el sc al final
        sc.close();
    }
}
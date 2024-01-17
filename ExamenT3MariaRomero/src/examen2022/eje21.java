package examen2022;

import java.util.Scanner;

public class eje21 {

	public static void main(String[] args) {
	      int opc = 0;
	        double r;
	        do {
	            opc = menu();

	            switch (opc) {
	                case 1:
	                    r = pideRadio();
	                    System.out.println("La circuferencia es: " + circuferencia(r));
	                    break;
	                case 2:
	                    r = pideRadio();
	                    System.out.println("El área es: " + area(r));
	                    break;
	                case 3:
	                    r = pideRadio();
	                    System.out.println("La circuferencia es: " + circuferencia(r));
	                    System.out.println("El área es: " + area(r));
	                    System.out.println("El volumen es: " + volumen(r));
	                    break;
	                case 4:
	                    break;
	                default:
	                    System.out.println("Introduce una opción correcta");
	                    break;
	            }

	        } while (opc != 4);

	        System.out.println("ADIOS");
	    }

	    public static int menu() {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("1. Circuferencia");
	        System.out.println("2. Area");
	        System.out.println("3. Todas");
	        System.out.println("4. Salir");
	        System.out.print("Introduce una opción: ");
	        return sc.nextInt();
	    }

	    public static double pideRadio() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("introduce el radio: ");
	        return sc.nextDouble();
	    }

	    public static double circuferencia(double r) {
	        return 2 * 3.14 * r;
	    }

	    public static double area(double r) {
	        return 3.14 * (r * r);
	    }

	    public static double volumen(double r) {
	        return ((double) 4 /3) * 3.14 * (r * r * r);
	    }
	}
package examen;

import java.util.Scanner;

public class Practicar {
	
	enum TipoBebida {
        COCACOLA, PEPSI, AGUA, ZUMO, OTRO
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TipoBebida[] opciones = TipoBebida.values();
		
		System.out.println("Menú de bebidas:");
		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i + 1) + ". " + opciones[i] + " - Precio: " + obtenerPrecio(opciones[i]));
		}
		System.out.println("0. Salir.");
		
		int opcion;
		do {
			System.out.print("Introduzca una opcion: ");
			opcion = sc.nextInt();
			
			if (opcion < 0 || opcion > opciones.length) {
				System.out.println("Intentelo de nuevo, opcion erronea");
			}else if (opcion > 0){
				System.out.println("Opcion: " + opcion + " elegida");
				System.out.print("Introduce la cantidad de dineri que va a introducir: ");
				double dinero = sc.nextDouble();
				
				TipoBebida bebidaSeleccionada = opciones[opcion - 1];
				double precio = obtenerPrecio(bebidaSeleccionada);
				
				if (dinero < precio) {
					System.out.println("Has introducido menos dinero. El dinero será devuelto");
				} else if (dinero == precio) {
					System.out.println("Dinero correcto. Toma tu " + bebidaSeleccionada);
				} else {
					double cambio = dinero - precio;
					System.out.println("Dinero correcto. Toma tu " + bebidaSeleccionada);
					System.out.printf("Cambio devuelto: %.2f euros%n", cambio);
				}
			}
			
		}while(opcion != 0);
		
		System.out.println("HASTA LUEGO!");
		
	}
	
	//Funcion para obtener el precio de cada bebida
	public static double obtenerPrecio(TipoBebida bebida) {
		return switch (bebida) {
	        case COCACOLA, PEPSI -> 1.50;
	        case AGUA -> 1.00;
	        case ZUMO -> 2.00;
	        case OTRO -> 1.75;
		};
	}

}

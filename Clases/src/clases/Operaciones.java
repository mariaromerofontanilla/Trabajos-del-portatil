package clases;

/**
 * Clases con funciones para realizar calculos matematicos con dos números proporcionados 
 * por el usuario a travez del teclado
 */
public class Operaciones {

	/**
	 * Primer número utilizado para los calculos
	 */
	double num1;

	/**
	 * Segundo número utilizado para los calculos
	 */
	double num2;

	/**
	 * Clase que inicializa los números a 0 por defecto
	 */
	public Operaciones() {

	}

	/**
	 * Función que permite especificar tanto el valor del número 1 como el número 2
	 * 
	 * @param num1 El primer número utilizado para los calculos
	 * @param num2 El segundo número utilizado para los calculos
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Función que calcula la suma de los dos números
	 * 
	 * @return Devuelve la suma mediante los siguientes calculos matematicos, del número 1 mas número 2.
	 */
	public double suma() {
		return num1 + num2;
	}

	/**
	 * Función que calcula la resta de los dos números
	 * 
	 * @return Devuelve la resta mediante los calculos matematicos, del número 1 menos número 2.
	 */
	public double resta() {
		return num1 - num2;
	}

	/**
	 * Función que calcula la multiplicación de los dos números
	 * 
	 * @return Devuelve la multiplicación mediante los caclulos matematicos, del número 1 por número 2.
	 */
	public double multiplicacion() {
		return num1 * num2;
	}

	/**
	 * Función que calcula la división de los dos números
	 * 
	 * @return Devuelve la división mediante los calculos matematicos, del número 1 entre número 2
	 * Si el número 2 es 0, devuelve 0.
	 */
	public double division() {
		double res = 0;

		if (num2 != 0) {
			res = num1 / num2;
		}
		return res;
	}

	/**
	 * Función que devuelve el mínimo de los dos números
	 * 
	 * @return Devuelve el mínimo entre el primer y segundo número
	 */
	public double max() {
		return num1 > num2 ? num1 : num2;
	}

	/**
	 * Función que devuelve el máximo de los dos números
	 * 
	 * @return Devuelve el máximo entre el primer y el segundo número
	 */
	public double min() {
		return num1 < num2 ? num1 : num2;
	}
}
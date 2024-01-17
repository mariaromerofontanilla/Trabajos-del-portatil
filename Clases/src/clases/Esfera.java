package clases;

/**
 * Clase con funciones que se utiliza para generarf una esfera.
 */
public class Esfera {

	/**
	 * Radio de la esfera, se inicializa en 1.0
	 */
	double radio = 1.0;

	/**
	 * Función que inicializa una esfera con radio 1.0
	 */
	public Esfera() {
		super();
	}

	/**
	 * Funcion que nos permite crear el radio y modificarlo segun el tamaño del mismo
	 * 
	 * @param radio, radio de la esfera.
	 */ 
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}

	/**
	 * Función que se encarga de calcular mediante ecuaciones matematicas o calculos matematicos la
	 * superficie de la esfera devolviendo asi el resultado
	 * 
	 * @return Devuelve la superficie de la esfera, es decir, 4 * PI * el radio de la esfera al cuadrado
	 */
	public double superficie() {
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		return superficie;
	}

	/**
	 * Función que se encarga de calcular mediante una serie de operaciones matematicas o calculos matematicos 
	 * el volumen de la esfera y devuelve el resultado
	 * 
	 * @return Devuelve el volumen de la esfera, mediante los siguientes calculos, 
	 * entre parentesis () 4 * PI partido / 3, * el
	 * radio de la esfera al cubo.
	 */
	public double volumen() {
		double volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
		return volumen;
	}
}

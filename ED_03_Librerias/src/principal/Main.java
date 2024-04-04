package principal;

import aleatorios.ClaseAleatorios;
import sysos.ImprimirPantalla;

public class Main {

	public static void main(String[] args) {
		ClaseAleatorios ca = new ClaseAleatorios();
		int numero = ca.numeroAleatorio();
		
		ImprimirPantalla ip = new ImprimirPantalla();
		ip.imprimir(numero);
	}
}

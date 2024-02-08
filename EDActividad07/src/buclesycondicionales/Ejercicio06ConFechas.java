
package buclesycondicionales;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio06ConFechas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//System.out.println(numeroAleatorio);
		System.out.println("-----------------NUMERO PRIMO--------");
		int numero = pedirNumero(sc);
		Date fechaInicial = new Date();//Toma la fecha del sistema en este momento
		System.out.println("Milisegundos pasados desde 1/1/1970: " + fechaInicial.getTime());
		boolean primo = esPrimo(numero);
		Date fechaFinal = new Date();
		long tiempoTotal = fechaFinal.getTime() - fechaInicial.getTime(); 
		System.out.println("Tiempo total de calculo: " + tiempoTotal);
		if(primo) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero NO es primo");
		}
	}
	
	private static boolean esPrimo(int numero) {
		//Un número es primo solo cuando es divisible por si mismo y la unidad
		for(int i = 2; i < numero / 2; i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int pedirNumero(Scanner sc) {
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		return numero;
	}

}
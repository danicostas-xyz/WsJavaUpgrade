
package buclesycondicionales;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//System.out.println(numeroAleatorio);
		System.out.println("-----------------NUMERO PRIMO--------");
		int numero = pedirNumero(sc);
		boolean primo = esPrimo(numero);
		if(primo) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero NO es primo");
		}
	}
	
	private static boolean esPrimo(int numero) {
		//Un número es primo solo cuando es divisible por si mismo y la unidad
		for(int i = 2; i < numero; i++) {
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
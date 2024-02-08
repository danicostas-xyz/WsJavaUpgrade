package buclesycondicionales;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Suma de números positivos");
		System.out.println("-------------------------");
		
		int numero = pedirNumero(sc);
		int suma = 0;
		
		while(numero >= 0) {
			suma+= numero;
			numero = pedirNumero(sc);
		}
	
		System.out.println("La suma es: " + suma);
	}
	
	public static int pedirNumero(Scanner sc) {
		System.out.println("Introduzca un número positivo para sumar, negativo para salir");
		int numero = sc.nextInt();
		return numero;
	}
	
}

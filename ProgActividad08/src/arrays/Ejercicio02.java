
package arrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//System.out.println(numeroAleatorio);
		System.out.println("Introduzca el tamaño del array");
		int tamaño = pedirNumero(sc);
		int[] arrayNumeros = rellenarArray(tamaño,sc);
		int mayor = calularMayorNumeroArray(arrayNumeros);
		System.out.println("La suma es: " + mayor);
	}
	
	private static int calularMayorNumeroArray(int[] arrayNumeros) {
		
		int mayor = Integer.MIN_VALUE;//Esta constante devuelve el menor de los enteros
									//algo así como "-2_100_000_000"
		for(int numero : arrayNumeros) {
			if(numero > mayor) {
				mayor = numero;
			}
		}		
		return mayor;
	}

	private static int[] rellenarArray(int tamaño, Scanner sc) {
		int[] arrayNumeros = new int[tamaño];
		System.out.println("El tamaño del array es: " + arrayNumeros.length);
		//Primera parte recoger números y ponerlos en el array
		for(int i = 0; i<arrayNumeros.length;i++) {
			int numero = pedirNumero(sc);
			arrayNumeros[i] = numero;
		}
		return arrayNumeros;
	}

	public static int pedirNumero(Scanner sc) {
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		return numero;
	}

}

package arrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduzca el tamaño del array");
		int tamaño = pedirNumero(sc);
		int[] arrayNumeros = rellenarArray(tamaño,sc);
		
		int contadorPares = 0;
		int contadorImpares = 0;
		
		for(int numero : arrayNumeros) {
			if(esPar(numero)) {
				contadorPares++;
			}else {
				contadorImpares++;
			}
		}
		
		System.out.println("El número de pares es: " + contadorPares);
		System.out.println("El número de impares es: " + contadorImpares);
		
	}
	
	private static boolean esPar(int numero) {
		if(numero % 2 == 0) {
			return true;
		}else {
			return false;
		}
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
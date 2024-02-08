
package arrays;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//System.out.println(numeroAleatorio);
		System.out.println("Introduzca el tamaño del array");
		int numero = pedirNumero(sc);
		int media = calularMediaArray(numero,sc);
		System.out.println("La suma es: " + media);
	}
	
	private static int calularMediaArray(int tamaño,Scanner sc) {
		int[] arrayNumeros = rellenarArray(tamaño,sc);
		
		int suma = calcularSumaArray(arrayNumeros);
		
		int media = suma / arrayNumeros.length;
		
		return media;
	}

	private static int calcularSumaArray(int[] arrayNumeros) {
		//Segunda parte, recorrer el array para sumar sus elementos
		int suma = 0;
		for(int numero : arrayNumeros) {
			suma += numero;
		}
		return suma;
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
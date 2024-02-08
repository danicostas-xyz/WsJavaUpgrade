
package arrays;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//System.out.println(numeroAleatorio);
		System.out.println("Introduzca el tamaño del array");
		int tamaño = pedirNumero(sc);
		int[] arrayNumeros = rellenarArray(tamaño,sc);
		//Invertir el array
		int[] arrayInvertido = new int[tamaño];
		int indiceNuevo = 0;
		//Recorremos el array original al reves y vamos rellenando el
		//array nuevo desde el principio hasta el final
		for(int i = arrayNumeros.length -1; i>=0;i--) {
			arrayInvertido[indiceNuevo] = arrayNumeros[i];
			indiceNuevo++;
		}
		System.out.println("Array Invertido");
		for(int numero : arrayInvertido) {
			System.out.println(numero);
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

package arrays;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//System.out.println(numeroAleatorio);
		System.out.println("Introduzca el tamaño del array");
		int numero = pedirNumero(sc);
		int suma = calularSumaArray(numero,sc);
		System.out.println("La suma es: " + suma);
	}
	
	private static int calularSumaArray(int tamaño,Scanner sc) {
		int[] arrayNumeros = new int[tamaño];
		System.out.println("El tamaño del array es: " + arrayNumeros.length);
		//Primera parte recoger números y ponerlos en el array
		for(int i = 0; i<arrayNumeros.length;i++) {
			int numero = pedirNumero(sc);
			arrayNumeros[i] = numero;
		}
		
		//Segunda parte, recorrer el array para sumar sus elementos
		int suma = 0;
		for(int numero : arrayNumeros) {
			suma += numero;
		}
		return suma;
	}

	public static int pedirNumero(Scanner sc) {
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		return numero;
	}

}

package arrays;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//System.out.println(numeroAleatorio);
		System.out.println("Introduzca el tamaño del array 1");
		int tamaño = pedirNumero(sc);
		int[] arrayNumeros1 = rellenarArray(tamaño,sc);
		System.out.println("Introduzca el tamaño del array 2");
		tamaño = pedirNumero(sc);
		int[] arrayNumeros2 = rellenarArray(tamaño,sc);
		
		int[] arrayUnido = unirArrays(arrayNumeros1, arrayNumeros2);
		int suma = 0;
		for(int numero : arrayUnido) {
			suma+= numero;
		}
		System.out.println("La suma de los números del nuevo array será: " + suma);
	}
	
	private static int[] unirArrays(int[] arrayNumeros1, int[] arrayNumeros2) {
		int[] arrayResultante = new int[arrayNumeros1.length + arrayNumeros2.length];
		int i = 0;
		for(int numero : arrayNumeros1) {
			arrayResultante[i] = numero;
			i++;
		}
		//i==4
		for(int numero : arrayNumeros2) {
			arrayResultante[i] = numero;
			i++;
		}
		
		return arrayResultante;
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
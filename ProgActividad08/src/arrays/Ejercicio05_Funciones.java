
package arrays;

import java.util.Scanner;

public class Ejercicio05_Funciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduzca el tamaño del array");
		int tamaño = pedirNumero(sc);
		int[] arrayNumeros = rellenarArray(tamaño,sc);
		//La idea sería crear un nuevo array donde estaran los números no 
		//duplicados.
		//Por cada número en el array orginal tenemos que comprobar
		//que dicho número no este en el array nuevo, si no está
		//lo métemos, si está no esta pues no lo metemos.
		int[] arrayNumerosNoDuplicados = new int[tamaño];
		boolean duplicado = false;
		
		for(int i = 0; i < arrayNumeros.length;i++) {
			duplicado = arrayContieneNumero(arrayNumeros[i], arrayNumerosNoDuplicados);
			if(!duplicado) {
				arrayNumerosNoDuplicados[i] = arrayNumeros[i];
			}		
		
		}
		
		System.out.println("El nuevo array sin duplicados es: ");
		for(int numero : arrayNumerosNoDuplicados) {
			if(numero != 0) {
				System.out.println(numero);
			}
		}
		
	}
	
	private static boolean arrayContieneNumero(int i, int[] arrayNumerosNoDuplicados) {
		boolean duplicado = false;
		for(int j = 0; j < arrayNumerosNoDuplicados.length;j++) {
			if(i == arrayNumerosNoDuplicados[j]) {
				duplicado = true;
				break;
			}
		}
		return duplicado;
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
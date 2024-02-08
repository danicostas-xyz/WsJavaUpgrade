
package arrays;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//System.out.println(numeroAleatorio);
		System.out.println("Introduzca el tamaño del array");
		int numero = pedirNumero(sc);
		int multiplicacion = calularMultiplicacionArray(numero,sc);
		System.out.println("La multiplicacion es: " + multiplicacion);
	}
	
	private static int calularMultiplicacionArray(int tamaño,Scanner sc) {
		int[] arrayNumeros = new int[tamaño];
		System.out.println("El tamaño del array es: " + arrayNumeros.length);
		//Primera parte recoger números y ponerlos en el array
		for(int i = 0; i<arrayNumeros.length;i++) {
			int numero = pedirNumero(sc);
			arrayNumeros[i] = numero;
		}
		
		//Segunda parte, recorrer el array para sumar sus elementos
		int multiplicacion = 0;
		for(int numero : arrayNumeros) {
			multiplicacion *= numero;
		}
		return multiplicacion;
	}

	public static int pedirNumero(Scanner sc) {
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		return numero;
	}

}
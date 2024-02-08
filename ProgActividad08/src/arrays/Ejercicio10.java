
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//System.out.println(numeroAleatorio);
		System.out.println("Introduzca el numero a borrar");
		int numero = pedirNumero(sc);
		int[] arrayNumeros = {1,2,3,4,5};
		//Arrays.toString -> convierte un array a cadena
		System.out.println("array original: " + Arrays.toString(arrayNumeros));
		System.out.println("array original: " + arrayNumeros);
		for(int i = 0;i < arrayNumeros.length;i++) {
			if(numero == arrayNumeros[i]) {
				arrayNumeros[i] = 0;
			}
		}
		
		System.out.println("array nuevo: " + Arrays.toString(arrayNumeros));

	}
	
	public static int pedirNumero(Scanner sc) {
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		return numero;
	}

}
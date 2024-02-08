
package arrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduzca el tamaño del array");
		int numeroUsuario = pedirNumero(sc);
		int[] arrayNumeros = {1,2,3,4,5,6,7};
		
		boolean encontrado = false;
		for(int numeroArray : arrayNumeros) {
			if(numeroUsuario == numeroArray) {
				encontrado = true;
				break;
			}
		}
		
		if(encontrado) {
			System.out.println("El numero esta en el array");
		}else {
			System.out.println("El numero NO esta en el array");
		}
		
	}
	

	public static int pedirNumero(Scanner sc) {
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		return numero;
	}

}
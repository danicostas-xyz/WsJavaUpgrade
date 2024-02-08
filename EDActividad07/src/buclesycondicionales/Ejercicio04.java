package buclesycondicionales;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		// Juego número mayor
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int mayor = 0;

		do {
			System.out.print("Ingrese un número (ingrese un número negativo para finalizar): ");
			numero = sc.nextInt();
			if(numero > mayor) {
				mayor = numero;
			}
			
		} while (numero >= 0);

		System.out.println("El número mayor ingresado es: " + mayor);
		sc.close();
	}
}

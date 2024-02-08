
package buclesycondicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = r.nextInt(10) + 1;
		
		//System.out.println(numeroAleatorio);
		System.out.println("-----------------ADIVINA EL NUMERO--------");
		System.out.println("VAMOS A GENERAR UN NUMERO ALEATORIO, Y TU VAS A TENER QUE ADIVINARLO");
		int numero = 0;
		boolean seguirJugando = true;
		
		do {
			numero = pedirNumero(sc);
			if (numero < numeroAleatorio) {
				System.out.println("Te has quedado corto");
			}else if (numero > numeroAleatorio) {
				System.out.println("Te has pasado");
			}else {
				seguirJugando = false;
			}
		} while (seguirJugando);
		System.out.println("---HAS GANADOOO----" + "el numero dado era: " + numeroAleatorio);

	}
	
	public static int pedirNumero(Scanner sc) {
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		return numero;
	}

}
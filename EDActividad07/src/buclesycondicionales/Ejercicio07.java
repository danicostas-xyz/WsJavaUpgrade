
package buclesycondicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//System.out.println(numeroAleatorio);
		System.out.println("----------------- NUMERO FIBONACCI --------");
		int numero = pedirNumero(sc);
		calularFibonacci(numero);
	}
	
	private static void calularFibonacci(int numero) {
		int numero1 = 0;
		int numero2 = 1;
		int fibonacci = 1;
		System.out.println("f(0)=0");
		for(int i = 1; i <= numero; i++) {
			numero2 = numero1 + fibonacci;
			System.out.println("f("+i+")=" + fibonacci);
			numero1 = fibonacci;
			fibonacci = numero2;			
		}
	}

	public static int pedirNumero(Scanner sc) {
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		return numero;
	}

}
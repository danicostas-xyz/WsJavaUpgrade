package buclesycondicionales;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int inicio = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int fin = sc.nextInt();
		
		int contadorDePares = 0;
		
		for(int i = inicio; i <= fin; i++) {
			if(i % 2 == 0) {
				contadorDePares++;
			}
		}
		
		System.out.println(contadorDePares);
		sc.close();
	}
}

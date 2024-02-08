package ejwhile;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int inicio = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int fin = sc.nextInt();
		
		while(inicio <= fin) {
			System.out.println(inicio);
			inicio++;
		}
		
		sc.close();//Solamente cerrarlo al final del programa
	}
}

package ejdowhile;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la base");
		int base = sc.nextInt();
		System.out.println("Introduzca el exponente");
		int exponente = sc.nextInt();
		
		int resultado = 1;
		int i = 1;
		do {
			resultado *= base;
			i++;
		}while(i <= exponente);
		
		System.out.println(resultado);
	}
}

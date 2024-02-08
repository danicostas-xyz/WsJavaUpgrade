package buclefor;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la base");
		int base = sc.nextInt();
		System.out.println("Introduzca el exponente");
		int exponente = sc.nextInt();
		
		int resultado = 1;
		
		for(int i = 1; i <= exponente;i++) {
			resultado*=base;
		}
		
		System.out.println(resultado);
	}
}

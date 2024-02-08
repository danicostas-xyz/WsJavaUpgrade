package string;

import java.util.Scanner;

public class Ejercicio_02_Mayus_Minus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Ejercicio 2: Desarrolla un programa que solicite al usuario ingresar una cadena y luego muestre la misma cadena en mayúsculas y minúsculas.");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Ingrese una frase....");
		
		String frase = sc.nextLine();
		
		System.out.println("Su frase pasada a mayúsculas es: " + frase.toUpperCase());
		
		System.out.println("Su frase pasada a minúsculas es: " + frase.toLowerCase());
		
		sc.close();
	}

}
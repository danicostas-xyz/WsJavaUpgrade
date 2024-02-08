package string;

import java.util.Scanner;

public class Ejercicio_01_Longitud {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ejercicio 1: el usuario ingresará una cadena de texto y se le dirá la longitud de la misma");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Ingrese su cadena...");
		String cadena = sc.nextLine();
		
		System.out.println("La longitud de la cadena es: " + cadena.length());
		
		
		sc.close();
	}

}
package string;

import java.util.Scanner;

public class Ejercicio08_palíndromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		String cadena2 ="";
		System.out.println("Por favor ingresa una cadena:");
		cadena = sc.nextLine();
		
		for(int i =cadena.length()-1; i>=0 ; i--) {
			cadena2=cadena2+cadena.charAt(i);
		}
		
		if(cadena.equalsIgnoreCase(cadena2)) {
			System.out.println("La frase es palindroma");
		}else {
			System.out.println("La frase NO es palindroma");
		}

	}

}
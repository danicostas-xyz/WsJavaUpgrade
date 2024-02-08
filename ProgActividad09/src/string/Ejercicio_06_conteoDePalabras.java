package string;

import java.util.Scanner;

public class Ejercicio_06_conteoDePalabras {

	public static void main(String[] args) {
		String frase = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la frase que quieres contar:");
		frase = sc.nextLine();
		String[] cadenaPartida = frase.split(" ");
		int contadorPalabras = 0;
		for(String s : cadenaPartida) {
			if(!s.equals("")) {
				contadorPalabras++;
			}
			//System.out.println("'" + s + "'");
		}

		System.out.println("El numero de palabras es: " + contadorPalabras);

	}

}

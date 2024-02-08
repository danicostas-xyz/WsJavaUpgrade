package string;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		String cadena2 ="";
		System.out.println("Por favor ingresa una cadena:");
		cadena = sc.nextLine();
		
		for(int i =cadena.length()-1; i>=0 ; i--) {
			cadena2=cadena2+cadena.charAt(i);
		}
		System.out.println(cadena2);

	}

}
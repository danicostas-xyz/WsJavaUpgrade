package ejdowhile;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		//El factorial de un número es ese número por todos los anteriores
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		int numero = sc.nextInt();
		long factorial = 1;
		int i = numero;
		
		do {
			factorial = factorial * i;
			i--;
		}while(i>=1);
		

		System.out.println(factorial);
	}
}

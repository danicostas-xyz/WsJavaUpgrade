package buclefor;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		
		//El factorial de un número es ese número por todos los anteriores
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		int numero = sc.nextInt();
		long factorial = 1;
		
		
		for(int i = numero; i>=1;i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
}

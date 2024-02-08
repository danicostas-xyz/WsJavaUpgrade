package ejdowhile;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		int inicio = sc.nextInt();
		
		//Con bucles
		for(int i = 1; i <= 10; i++) {
			System.out.println(inicio + " X " + i + " = " + (inicio * i));
		}
		

	}
}

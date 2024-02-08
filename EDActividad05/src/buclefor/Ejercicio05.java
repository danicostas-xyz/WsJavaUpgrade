package buclefor;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		int inicio = sc.nextInt();
		
		int i = 1;
		//Con bucles
		do {
			System.out.println(inicio + " X " + i + " = " + (inicio * i));
			i++;
		}while(i <= 10);
		

	}
}

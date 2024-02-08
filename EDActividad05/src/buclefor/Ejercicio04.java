package buclefor;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		int inicio = sc.nextInt();
		
		int resultado = (inicio * (inicio + 1)) / 2;
		System.out.println(resultado);
		
		//Con bucles
		int suma = 0;
		for(int i = 1; i <= inicio; i++) {
			suma += i;
		}
		System.out.println(suma);

	}
}

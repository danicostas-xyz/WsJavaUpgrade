package ejercicios;

import java.util.Scanner;

public class _06_ImparOPar {

	public static void main(String[] args) {
		numeros();
	}
	
	public static void numeros () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduza un numero entero");
		int numero1 = sc.nextInt();
		int resultado = numero1 % 2;//resto
		
		switch (resultado) {
		case 0:
			System.out.println("Este numero es par");
			break;
		case 1:
			System.out.println("Este numero es impar");
			break;
		}
	}

}

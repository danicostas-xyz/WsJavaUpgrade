package buclefor;

import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = menu(sc);
		switch (opcion) {
		case 1:
			System.out.println("Introduzca el primer numero");
			int inicio = sc.nextInt();
			System.out.println("Introduzca el segundo numero");
			int fin = sc.nextInt();
			imprimirValores(inicio,fin);
			break;

		case 2:
			System.out.println("Introduzca el numero");
			int numero = sc.nextInt();
			tablaMultiplicar(numero);
			break;
		case 3:
			System.out.println("Introduzca el numero para factorial");
			int factorial = sc.nextInt();
			calcularFactorial(factorial);
			break;
		default:
			break;
		}
	}

	private static void calcularFactorial(int numero) {
		long factorial = 1;
		for(int i = numero; i>=1;i--) {
			factorial *= i;
		}
		System.out.println(factorial);
		
	}

	private static void tablaMultiplicar(int numero) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}
		
	}

	private static void imprimirValores(int inicio, int fin) {
		for(int i = inicio; i <= fin;i++) {
			System.out.println("Hola este bucle lo hemos ejecutado " + i);
		}
		
	}

	private static int menu(Scanner sc) {
		System.out.println("Para ejercicio 3 pulse 1");
		System.out.println("Para ejercicio 5 pulse 2");
		System.out.println("Para ejercicio 8 pulse 3");
		
		int opcion = sc.nextInt();
		return opcion;
	}
}

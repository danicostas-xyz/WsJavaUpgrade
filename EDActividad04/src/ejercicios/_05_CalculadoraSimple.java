package ejercicios;

import java.util.Scanner;

public class _05_CalculadoraSimple {

	public static void main(String[] args) {
		int opcion = menu();
		condicional(opcion);
		
		
	}
	public static double suma ( double d1, double d2) {
		 double suma = d1 + d2;
		 return suma;
		
	}
	public static double resta ( double d1, double d2) {
		 double resta = d1 - d2;
		 return resta;
		
	}
	public static double multiplicacion ( double d1, double d2) {
		 double multiplicacion = d1 * d2;
		 return multiplicacion;
		
	}
	public static double division ( double d1, double d2) {
		 double division = d1 / d2;
		 return division;
		
	}
	public static double resto ( int n1, int n2) {
		 int resto = n1 % n2;
		 return resto;
		
	}
	public static int menu () {
		System.out.println("Para sumar pulse 1");
		System.out.println("Para restar pulse 2");
		System.out.println("Para multiplicar pulse 3");
		System.out.println("Para dividir pulse 4");
		System.out.println("Para saber el resto de la división entera pulse 5");
		
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		return opcion;
	}
	
	public static void condicional (int opcion) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int numero2 = sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("El resultado de la suma es: " + suma (numero1,numero2));
			break;
		case 2:
			System.out.println("El resultado de la resta es: " + resta (numero1,numero2));
			break;
		case 3:
			System.out.println("El resultado de la multiplicacion es: " + multiplicacion (numero1,numero2));
			break;
		case 4:
			System.out.println("El resultado de la division es: " + division (numero1,numero2));
			break;
		case 5:
			System.out.println("El resultado de la resto es: " + resto (numero1,numero2));
			break;
		default:
			System.out.println("La opcion escogida no es correcta");
			break;
		}	
	}
}
		 



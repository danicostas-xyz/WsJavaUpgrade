package _02_actividad;

import java.util.Scanner;

public class _03_Ejercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuacion haremos las operaciones básicas entre dos números");	
		System.out.println("Para ello introduzca los datos que le sean solicitados");

		System.out.println(".........................................");

		System.out.println("Introduzca el valor del primer número");
		double n1 = sc.nextDouble();
		System.out.println("Ahora introduzca el valor del segundo número ");
		double n2 = sc.nextDouble();

		System.out.println(".........................................");

		double suma = n1 + n2 ;
		System.out.println("El resultado de la suma entre los dos numeros es de: " + suma);
		System.out.println(".........................................");

		double resta = n1 - n2;
		System.out.println("El resultado de la resta entre el primer número y el segundo es de: " + resta);
		System.out.println(".........................................");

		double division = n1 / n2;
		System.out.println("El resultado de la división entre el primer número y el segundo es de: " + division);
		System.out.println(".........................................");

		double multiplicacion = n1 * n2;
		System.out.println("El resultado de la multiplicación entre los dos números es de: " + multiplicacion);
		System.out.println(".........................................");

	}

}

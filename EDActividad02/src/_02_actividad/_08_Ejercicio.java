package _02_actividad;

import java.util.Scanner;

public class _08_Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcularemos el sueldo de un trabajador teniendo en cuenta:");
		System.out.println("El sueldo base + horas extra (40€ por h)");
		
		System.out.println(".........................................");
		
		System.out.println("Introduce el salario base");
		double sueldoBase = sc.nextDouble();
		
		System.out.println("Ahora introduce el número de horas extras trabajadas");
		double horasExtras = sc.nextDouble();
		
		final int PAGO_EXTRA= 40;
		
		System.out.println("Pulsa enter para ver el sueldo total");
		sc.nextLine();
		sc.nextLine();
		double sueldoTotal = (sueldoBase) + ( horasExtras * PAGO_EXTRA);
		System.out.println("El sueldo total será de: " + sueldoTotal);
			
	}
}

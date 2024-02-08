package _02_actividad;

import java.util.Scanner;

public class _05_Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación calcularemos el total de dinero" 
		+ "que recibira un trabajador al mes teniendo en cuenta");
		System.out.println("que recibe una comision de un 10% por venta (en este caso"
	    + "ha realizado tres ventas), sumando tambien su salario base.");
		
		System.out.println(".........................................");
		
		System.out.println("Introduce el valor que actuará como salario base");
		double salarioBase = sc.nextDouble();
		
		final double PORCENTAJE_DE_COMISION = 0.10;
		
		System.out.println("Introduce el valor de la primera venta");
		double venta1 = sc.nextDouble();
		System.out.println("Introduce el valor de la segunda venta");
		double venta2 = sc.nextDouble();
		System.out.println("Introduce el valor de la tercera venta");
		double venta3 = sc.nextDouble();
		
		double sumaVentas = venta1 + venta2 + venta3;
		double salarioComision = PORCENTAJE_DE_COMISION * sumaVentas;
		
		System.out.println("Pulsa enter para ver la comision total basada en el salario base");
		sc.nextLine();
		sc.nextLine();
		System.out.println("La comision total por las ventas es de: "+ salarioComision);
		
		System.out.println(".........................................");
		System.out.println("Ahora pulsa enter para ver el sueldo total");
		sc.nextLine();
		
		double sueldoTotal = salarioBase + salarioComision;
		System.out.println("El sueldo total recibido será de: " + sueldoTotal);
		
		
		
		

	}

}

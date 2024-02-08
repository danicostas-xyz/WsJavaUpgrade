package _02_actividad;

import java.util.Scanner;

public class _01_Ejercicio {

	public static void main(String[] args) {
		//Area y perimetro de un rectangulo dada su base y altura.
		
		Scanner sc = new Scanner (System.in);

		System.out.println("A continuación vamos a calcular el área y el perimetro de un rectangulo");
		System.out.println("Para ello complete con los datos que le sean solicitados");
		System.out.println(".........................................");

		System.out.println("Introduzca un número decimal que se comportara como la altura del rectangulo");
		double altura = sc.nextDouble();
		System.out.println("Ahora introduzca un numero decimal que se comportara como la base del rectangulo");
		double base = sc.nextDouble();

		System.out.println(".........................................");
		double perimetro = (altura * 2) + (base * 2);

		System.out.println("El perimetro de este rectangulo será: " + perimetro);

		System.out.println(".........................................");

		double area = base * altura;

		System.out.println("El area de este rectangulo será: " + area);
	}

}

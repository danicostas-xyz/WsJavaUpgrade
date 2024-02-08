package _02_actividad;

import java.util.Scanner;

public class _04_Ejercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación calcularemos la media entre tres números");
		System.out.println("Para ello introduce los numeros que desees a medida que te sean solicitados");
		System.out.println(".........................................");
		
		System.out.println("Introduce el valor del primer numero");
		double n1 = sc.nextDouble();
		System.out.println("Ahora introduce un segundo valor");
		double n2 = sc.nextDouble();
		System.out.println("Finalmente introduce el valor para un tercer número");
		double n3 = sc.nextDouble();
		System.out.println(".........................................");
		
		System.out.println("Primero sumaremos estos valores, pulsa enter  para proceder ");
		double suma = n1 + n2 +n3;
		sc.nextLine();
		sc.nextLine();
		System.out.println("El resultado de la suma es de: " + suma);
		
		System.out.println(".........................................");
		
		System.out.println("Para la media dividiremos este resultado entre el numero de valores, pulsa enter paara proceder");
		double media = suma / 3;
		sc.nextLine();
		System.out.println("La media de estos numeros es de: " + media);
		
	}

}

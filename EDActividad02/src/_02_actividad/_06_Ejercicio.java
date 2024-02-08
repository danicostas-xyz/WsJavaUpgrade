package _02_actividad;

import java.util.Scanner;

public class _06_Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuacion calcularemos la calificación final de una materia");
		System.out.println("teniendo en cuenta los siguientes datos");
		System.out.println("55% del promedio de sus tres calificaciones parciales. ");
		System.out.println("30% de la calificación del examen final.");
		System.out.println("15% de la calificación de un trabajo final. ");
		
		System.out.println("Introduce la nota obtenida en tu primer parcial");
		double primerParcial = sc.nextDouble();
		System.out.println("Introduce la nota obtenida en el segundo parcial");
		double segundoParcial = sc.nextDouble();
		System.out.println("Introduce la nota obtenida en el tercer parcial");
		double tercerParcial = sc.nextDouble();
		
		System.out.println("Pulsa enter para visualizar la nota promedio de tus parciales");
		double parcialTotal = (primerParcial + segundoParcial + tercerParcial) /3;
		sc.nextLine();
		sc.nextLine();
		System.out.println("La nota promedio de los parciales fue de: "+ parcialTotal);
			
		System.out.println(".........................................");
		
		System.out.println("Ahora introduce la calificacion del examen final");
		double notaExamen = sc.nextDouble();
		
		System.out.println("Para continuar ingresa la nota de tu trabajo final");
		double trabajoFinal = sc.nextDouble();
		
		System.out.println(".........................................");
		double calificacionFinal = (parcialTotal * 0.55) + ( notaExamen * 0.30) + (trabajoFinal * 0.15);
		
		System.out.println("Finalmente pulsa enter para visualizar la nota final");
		sc.nextLine();
		sc.nextLine();
		System.out.println("Tu nota final será de: " + calificacionFinal);
		
	}

}

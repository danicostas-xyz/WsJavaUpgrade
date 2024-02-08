package ejercicios;

import java.util.Scanner;

public class _03_EvaluacionNotas {

	public static void main(String[] args) {
		nota ();
		

	}
	public static void nota() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre el 0 y el 100");
		int numero = sc.nextInt();
		
		String cadena = numero < 50 ? "Suspenso" : "Aprobado";
		System.out.println("el alumno está: " + cadena);
	}
	
		
	
	
	
}



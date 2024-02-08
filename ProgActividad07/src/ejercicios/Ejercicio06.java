package ejercicios;

public class Ejercicio06 {
	public static void main(String[] args) {

		for(int i = 1; i <= 6; i++) {

			int variable = 1;

			if(i % 2 != 0 || variable != 3) {

				System.out.println(i);

			}

			variable += 2;

		}
		//Ejercicio 6.txt

		//Iteración 1
		// i = 1
		// int variable = 1
		// salida = 1
		// variable = 3

		//Iteración 2
		// i = 2
		// int variable = 1 //se vuelve a crear la variable
		// salida = 2
		// variable = 3

		//Iteración 3
		// i = 3
		// int variable = 1
		// salida = 3
		// variable = 3


		//Iteración 4
		// i = 4
		// int variable = 1
		// salida = 4
		// variable = 3

		//Iteración 5
		// i = 5
		// int variable = 1
		// salida = 5
		// variable = 3

		//Iteración 6
		// i = 6
		// int variable = 1
		// salida = 6
		// variable = 3

		//Iteración 7
		// i = 7
		// Fin de bucle
		
	}
}

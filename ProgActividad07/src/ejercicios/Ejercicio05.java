package ejercicios;

public class Ejercicio05 {
	public static void main(String[] args) {

		for(int i = 1; i <= 6; i++) {

			int variable = 1;

			if(i % 2 == 0 && variable != 3) {

				System.out.println(i);

			}

			variable ++;

		}
		//Iteración 1
		// i = 1
		// int variable = 1
		// variable = 2

		//Iteración 2
		// i = 2
		// int variable = 1 //se vuelve a crear la variable
		// salida = 2
		// variable = 2

		//Iteración 3
		// i = 3
		// int variable = 1
		// variable = 2


		//Iteración 4
		// i = 4
		// int variable = 1
		// salida = 4
		// variable = 2

		//Iteración 5
		// i = 5
		// int variable = 1
		// variable = 2

		//Iteración 6
		// i = 6
		// int variable = 1
		// salida = 6
		// variable = 2

		//Iteración 7
		// i = 7
		// Fin de bucle
		
		//En este caso variable no se reinicia cada vez
		int variable = 1;
		
		for(int i = 1; i <= 6; i++) {

			if(i % 2 == 0 && variable != 3) {

				System.out.println(i);

			}

			variable ++;

		}
		
	}
}

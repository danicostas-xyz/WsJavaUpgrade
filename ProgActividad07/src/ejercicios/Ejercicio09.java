package ejercicios;

public class Ejercicio09 {
	public static void main(String[] args) {

		for(int i = 1; i <= 5; i++) {

			for(int j = 1; j <= 5; j++) {

				if(j == 3) {

					continue;

				}

				System.out.println(i);

			}

			if(i == 4) {

				System.out.println(45);

				break;

			}

		}
		//Ejercicio9.txt

		//Iteración 1 1
		// i = 1
		// j = 1
		// salida = 1

		//Iteración 1 2
		// i = 1
		// j = 2
		// salida = 1

		//Iteración 3
		// i = 1
		// j = 3

		//Iteración 4
		// i = 1
		// j = 4
		// salida = 1

		//Iteración 5
		// i = 1
		// j = 5
		// salida = 1

		//Iteración 6
		// i = 1
		// Salimos bucle for (j)

		//Iteración 7
		// i = 2
		// j = 1
		// salida = 2

		//Iteración 8
		// i = 2
		// j = 2
		// salida = 2

		//Iteración 9
		// i = 2
		// j = 3

		//Iteración 10
		// i = 2
		// j = 4
		// salida = 2

		//Iteración 11
		// i = 2
		// j = 5
		// salida = 2

		//Iteración 12
		// i = 2
		// j = 6
		// Salimos del bucle for (j) 

		//Iteración 13
		// i = 3
		// j = 1
		// salida = 3

		//Iteración 14
		// i = 3
		// j = 2
		// salida = 3

		//Iteración 15
		// i = 3
		// j = 3

		//Iteración 16
		// i = 3
		// j = 4
		// salida = 3

		//Iteración 17
		// i = 3
		// j = 5
		// salida = 3

		//Iteración 18
		// i = 3
		// j = 6
		// Salimos del bucle for (j)

		//Iteración 19
		// i = 4
		// j = 1
		// salida = 4

		//Iteración 20
		// i = 4
		// j = 2
		// salida = 4

		//Iteración 21
		// i = 4
		// j = 3
		
		//Iteración 22
		// i = 4
		// j = 4
		// salida = 4
		
		//Iteración 23
		// i = 4
		// j = 5
		// salida = 4
	
		//Iteración 24
		// i = 4
		// j = 6
		// Salimos del bucle for (j)
		// salida = 45
		// Salimos del bucle for (i)
			
	}
}

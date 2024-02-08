package ejercicios;

public class Ejercicio08 {
	public static void main(String[] args) {

		for(int i = 1; i <= 5; i++) {

			if(i % 2 == 0) {

				System.out.println(i - 1);

			}             

			if(i == 3) {

				continue;//volvemos a la linea 6 en incrementamos 'i'

			}

		}

		//Iteración 1
		// i = 1

		//Iteración 2
		// i = 2
		// salida = 1

		//Iteración 3
		// i = 3

		//Iteración 4
		// i = 4
		// salida = 3

		//Iteración 5
		// i = 5

		//Iteración 6
		// i = 6
		// Fin de bucle

	}
}

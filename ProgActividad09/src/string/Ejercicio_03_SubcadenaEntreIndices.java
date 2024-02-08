package string;

import java.util.Scanner;

public class Ejercicio_03_SubcadenaEntreIndices {

	public static void main(String[] args) {
		System.out.println("Ejercicio 3: dada una cadena ingresada por el usuario y 2 índices, devolver la subcadena que se encuentra entre los mismos");
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("Ingrese una cadena....");
		String cadena = sc.nextLine();
		
		System.out.println("Ingrese su primer índice: ");
		int indice1 = sc.nextInt();
		
		System.out.println("Ingrese su segundo índice: ");
		int indice2 = sc.nextInt();
		
		boolean bandera = false;
		do {
			if(indice1 > indice2) {
				System.out.println("Su primer índice es mayor que el segundo, por favor reeingrese sus índices...");
				System.out.println("Ingrese su primer índice: ");
				indice1 = sc.nextInt();
				
				System.out.println("Ingrese su segundo índice: ");
				indice2 = sc.nextInt();
			}else {
				bandera = true;
			}
		} while (!bandera);//while(bandera == false);
		
		System.out.println(cadena.substring(indice1,indice2+1));
		
		
		sc.close();
	}

}

package ejercicios;

import java.util.Scanner;

public class _01_EjercicioMayorMenor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int numero2 = sc.nextInt();
		mayorMenor(numero1, numero2);

		

	}
	public static void mayorMenor (int n1, int n2) {
		
		//Operador ternario
		boolean mayorN1 = n1 > n2 ? true : false;
		
		if(mayorN1) {
			System.out.println( n1 + " " + "es mayor que " + n2);
		}else {
			System.out.println( n1 + " " +"es menor que " + n2);
		}	
		
		//Otra opcion
		String cadena = (n1<=n2) ?  n1 +" es Menor que "+n2 : n1 +" es Mayor que " +n2;
		System.out.println(cadena);
		
	}

}

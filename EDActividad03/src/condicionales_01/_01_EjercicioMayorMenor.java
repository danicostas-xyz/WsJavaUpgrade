package condicionales_01;

import java.util.Scanner;

public class _01_EjercicioMayorMenor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int numero2 = sc.nextInt();
		mayorMenor(numero1, numero2);
		//mayorMenor(1, 100);
		//mayorMenor(10, 10);
		

	}
	public static void mayorMenor (int n1, int n2) {
		if (n1>n2) {
			System.out.println( n1 + " " + "es mayor que " + n2);
		}else if (n1<n2) {
			System.out.println( n1 + " " +"es menor que " + n2);
		}else if (n1 == n2) {
			System.out.println( n1 + " " +"es igual que " + n2);
		}
	}

}

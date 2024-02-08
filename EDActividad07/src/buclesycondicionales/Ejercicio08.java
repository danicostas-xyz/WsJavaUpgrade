
package buclesycondicionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		int numero1 = 0;
		int numero2 = 0;
		do {

			opcion = menu(sc);
			
			switch (opcion) {
			case 1: 
				System.out.println("Por favor elija dos números para sumarlos");
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();
				
				int suma = numero1 + numero2;
				System.out.println("La suma de los dos números es:"+ suma);
				break;
			case 2: 
				System.out.println("Por favor elija dos números para restarlos");
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();
				
				int resta = numero1 - numero2;
				System.out.println("La resta de los dos números es:"+ resta);
				break;
			case 3: 
				System.out.println("Por favor elija dos números para multiplicarlos");
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();
				
				int multi = numero1 * numero2;
				System.out.println("La multiplicación de los dos números es:"+ multi);
				break;
			case 4: 
				System.out.println("Por favor elija dos números para dividirlos");
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();
				
				int div = numero1 / numero2;
				System.out.println("La división de los dos números es:"+ div);
				break;
			}
			
		}while(opcion!=5);
		//while(opcion>5 && opcion<5);
		//while(opcion<5 || opcion>5)
		
		System.out.println("...........................CALCULADORA APAGADA........................................");
	}

	private static int menu(Scanner sc) {
		int opcion = 0;
		do {
			System.out.println("Por favor introduzca el comando que desea hacer (1-5)");
			System.out.println("Pulsa 1 para realizar una suma ");
			System.out.println("Pulsa 2 para realizar una resta");
			System.out.println("Pulsa 3 para realizar una multiplicación");
			System.out.println("Pulsa 4 para realizar una división");
			System.out.println("Pulsa 5 para apagar la calculadora");
			opcion = sc.nextInt();
			if(opcion <= 0 || opcion >= 6) {
				System.out.println("Opcion incorrecta");
			}
		}while(opcion <= 0 || opcion >= 6);
		
		return opcion;
	}
}
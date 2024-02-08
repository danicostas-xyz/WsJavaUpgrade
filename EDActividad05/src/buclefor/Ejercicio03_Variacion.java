package buclefor;

import java.util.Scanner;

public class Ejercicio03_Variacion {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int inicio = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int fin = sc.nextInt();
		
		if(fin < inicio) {
			for(int i = inicio; i >= fin;i--) {
				System.out.println("Hola este bucle lo hemos ejecutado " + i);
			}
		}else {
			for(int i = inicio; i <= fin;i++) {
				System.out.println("Hola este bucle lo hemos ejecutado " + i);
			}
		}

	}
}

package string;
import java.util.Scanner;

public class Ejercicio09_conteoDeCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		char letra = ' ';
		int contador = 0;
		
		System.out.println("Por favor escriba una frase:");
		cadena = sc.nextLine();
		
		System.out.println("Ahora escribe la letra que quiere contar:");
		letra = sc.next().charAt(0);
		
		for(int i =0; i<=cadena.length()-1 ; i++) {
			if(cadena.charAt(i)==letra) {
				contador++;
			}
		}
		System.out.println("La letra "+letra + " se repite "+ contador +" veces");

	}

}
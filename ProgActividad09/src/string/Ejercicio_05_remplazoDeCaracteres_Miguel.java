package string;
import java.util.Scanner;

public class Ejercicio_05_remplazoDeCaracteres_Miguel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		char cambio = ' ';
		char remplazo = ' ';
		frase = "viva españita";
		
		System.out.println(frase);
		System.out.println("Por favor introduce el caracter que quiera cambiar");
		cambio =sc.next().charAt(0);
		System.out.println("Por favor introduce el caracter por el que quieras remplazar");
		remplazo =sc.next().charAt(0);
		
		System.out.println(frase.replace(cambio, remplazo));
	
	}

}
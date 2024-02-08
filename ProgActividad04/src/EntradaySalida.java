import java.util.Scanner;

public class EntradaySalida {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//STRING
		System.out.println("introduce la palabra que quieras leer:");
		String s1 = sc.next();
		System.out.println("El usuario ha escrito la palabra:" + s1);
		
		System.out.println("introduce la frase que quieras leer:");
		s1 = sc.nextLine();
		System.out.println("El usuario ha escrito la frase:" + s1);
		
		//INT
		System.out.println("introduce el numero que quieras leer:");
		int numero1 = sc.nextInt();
		System.out.println("El numero elegido es el numero:" + numero1);
		
		//DOUBLE
		System.out.println("Introduce el numero doble que quieras leer:");
		double numero2 = sc.nextDouble();
		System.out.println("El numero elegido ha sido el numero:" + numero2);
		//En este caso, hay q separar la unidad de los decimales mediante una
		//coma, si lo hacemos con un punto nos dara error.
		//LONG
		
		System.out.println("Introduce el numero long que quieras leer:");
		long numero3 = sc.nextLong();
		System.out.println("El numero elegido ha sido el numero:" + numero3);
		
		//FLOAT
		System.out.println("Introduce el numero float que quieras leer:");
		float numero4 = sc.nextFloat();
		System.out.println("El numero elegido ha sido el numero:" + numero4);
		
		//Pasa lo mismo que con el numero double, no podemos separar los
		//decimales mediante un punto porque nos dara error.
		//BYTE
		System.out.println("Introduce el numero byte que quieras leer:");
		byte numero5 = sc.nextByte();
		System.out.println("El numero elegido ha sido el numero:" + numero5);
		
		//BOOLEAN
		System.out.println("Introduce el valor booleano que quieras leer");
		boolean bool1 = sc.nextBoolean();
		System.out.println("El valor booleano que has elegido es:" + bool1);
		
		//TAMBIEN PODEMOS HACER QUE SE SUMEN COMO POR EJEMPLO:
		System.out.println("Introduce el numero que quieras sumar:");
		int numero6 = sc.nextInt();
		System.out.println("Introduce otro numero mas para sumarlo al anterior:");
		int numero7 = sc.nextInt();
		int numero8 = numero6 + numero7;
		System.out.println("La suma de los dos numeros introducidos es iguala:" + numero8);
	}
}
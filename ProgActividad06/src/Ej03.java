import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {

		scanear();

	}

	public static void scanear() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el primer numero:");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo numero:");
		int num2 = sc.nextInt();

		System.out.println("La suma de ambos será:" + sumar(num1, num2));
		sc.nextLine();
		sc.nextLine();

		System.out.println("La resta de ambos será:" + restar(num1, num2));

		sc.nextLine();

		System.out.println("La multiplicación de ambos será:" + multi(num1, num2));

		sc.nextLine();

		System.out.println("La división de ambos será:" + dividir(num1, num2));

	}

	public static int sumar(int n1,int n2) {
		int suma = n1 + n2;
		return suma;
		
	}
	public static double sumar(double n1,double n2) {
		double suma = n1 + n2;
		return suma ;		
	}
	
	public static double restar(double n1,double n2) {
		double resta = n1 - n2;
		return resta;
		
	}
	public static int restar(int n1,int n2) {
		int resta = n1 - n2;
		return resta;		
	}

	public static float multi(float n1,float n2) {
		float multi = n1 * n2;
		return multi;
		
	}
	
	public static double multi(double n1,double n2) {
		double multi = n1 * n2;
		return multi;
		
	}
	public static double dividir(double n1,double n2) {
		double div = n1 / n2;
		return div;
		
	}
	
	public static float dividir(float n1,float n2) {
		float div = n1 / n2;
		return div;
		
	}

}
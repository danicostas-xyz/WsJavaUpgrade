
public class Ej01_Calculadora {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("CALCULADORA DURA");
		System.out.println("-----------------------------------------");
		
		System.out.println("LA SUMA DE LOS DOS NÚMEROS SERÁ:"+ sumar(3, 5));
		System.out.println("LA SUMA DE LOS DOS NÚMEROS SERÁ:"+ sumar(4.5, 5.5));
		
		System.out.println("-----------------------------------------");
		
		System.out.println("LA RESTA DE LOS DOS NÚMEROS SERÁ:"+ restar(70, 25));
		System.out.println("LA RESTA DE LOS DOS NÚMEROS SERÁ:"+ restar(46.0, 33.0));
		
		System.out.println("-----------------------------------------");
		
		System.out.println("LA MULTIPLICACIÓN DE LOS DOS NÚMEROS SERÁ:"+ multi(7, 23));
		System.out.println("LA MULTIPLICACIÓN DE LOS DOS NÚMEROS SERÁ:"+ multi(3, 4));
		
		System.out.println("-----------------------------------------");
		
		System.out.println("LA DIVISIÓN DE LOS DOS NÚMEROS SERÁ:"+ dividir(23, 12));
		System.out.println("LA DIVISIÓN DE LOS DOS NÚMEROS SERÁ:"+ dividir(55, 32));

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


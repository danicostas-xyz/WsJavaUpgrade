package _05_funciones;
/*
 * Ej06. Crear 4 funciones para calcular suma, resta, división y multiplicación de dos números enteros (parámetros de entrada). 
 * El valor calculado se deberá de devolver (parámetro de salida) e imprimir por pantalla.

Una vez creada la función, llamar a la función 2 veces desde el método "main" con parámetros de entrada diferentes.
 */
public class _06_ {

	public static void main(String[] args) {
		double suma=sumar(10, 15);
		System.out.println("El valor de la suma es " +suma);
		double resta= restar(10,15);
		System.out.println("El valor de la resta es" +resta);
		double multiplicacion= multiplicar(10,15);
		System.out.println("El valor de la multiplicacion es " +multiplicacion);
		double division= dividir(10,15);
		System.out.println("El valor restante de la divison es " +division);
		
		suma=sumar(100, 150);
		System.out.println("El valor de la suma es " +suma);
		resta= restar(134,34);
		System.out.println("El valor de la resta es " +resta);
		multiplicacion= multiplicar(12,13);
		System.out.println("El valor de la multiplicacion es " +multiplicacion);
		division= dividir(30,15);
		System.out.println("El valor restante de la divison es " +division);
		
	}
	
	public static int sumar(int num1, int num2) {
		int suma =num1+num2;
		return suma;	
	}
		
	public static int restar(int num1, int num2) {
		int resta=num1-num2;
		return resta;
	}
	public static int multiplicar(int num1, int num2) {
		int multiplicacion=num1*num2;
		return multiplicacion;
	}
	public static int dividir(int num1, int num2) {
		int division= num1/num2;
		return division;
	}

	}		



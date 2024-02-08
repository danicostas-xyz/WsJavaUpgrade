
//Las clases se escriben en UpperCamelCase
public class ActivConstantesOperadores {
	
	public static void main(String[] args) {
		//Área y perímetro del rectángulo
		double longitud = 12.56;
		double ancho = 8.3;
		double area = longitud * ancho;
		System.out.println("El area del rectangulo es: " + area);
		
		double perimetro = 2 * (longitud + ancho);
		System.out.println("El perimetro del rectangulo es: " + perimetro);
		longitud = 34.21;
		ancho = 25.36;
		area = longitud * ancho;
		System.out.println("El area del rectangulo es: " + area);
		
		perimetro = 2 * (longitud + ancho);
		System.out.println("El perimetro del rectangulo es: " + perimetro);
		
		//Conversión de Temperatura
		int fahrenheit = 14;
		final int PRIMERA_CONSTANTE = 32;
		final int SEGUNDA_CONSTANTE = 5;
		final int TERCERA_CONSTANTE = 9;
		//PRIMERA_CONSTANTE = 56;//ERROR, NO PODEMOS CAMBIAR UNA COSTANTE
		int celsius = (fahrenheit - PRIMERA_CONSTANTE) * SEGUNDA_CONSTANTE / TERCERA_CONSTANTE;
		System.out.println("La temepratura en grados Celsius es de: " + celsius);
		fahrenheit = 46;
		celsius = (fahrenheit - PRIMERA_CONSTANTE) * SEGUNDA_CONSTANTE / TERCERA_CONSTANTE;
		System.out.println("La temepratura en grados Celsius es de: " + celsius);
		fahrenheit = 14;
		celsius = (fahrenheit - PRIMERA_CONSTANTE) * SEGUNDA_CONSTANTE / TERCERA_CONSTANTE;
		System.out.println("La temepratura en grados Celsius es de: " + celsius);
		
		// Calculo del área de un circulo
		final double PI = 3.1416;
		double radio = 64.54;
		area = PI * (radio * radio);
		System.out.println("El area de un circulo es: " + area);
		radio = 64.54;
		area = PI * (radio * radio);
		System.out.println("El area de un circulo1 es: " + area);
		
		// Cálculo de Interés Simple
		int principal = 2156;
		int tasa = 3218;
		int tiempo = 65;
		int interes = principal * tasa * tiempo;
		System.out.println("El interes simple ganado en una inversion es :" + interes);
		
		//Conversión de Moneda
		double TASA = 0.85;
		double dolares = 46.456;
		double euros = dolares * TASA;
		System.out.println("La conversion a euros es: " + euros + "€");

		//Calculo de índice de masa corporal
		double peso = 73.2;
		double altura = 1.78;
		double IMC = peso / (altura * altura);
		System.out.println("El índice de masa corporal es de : " + IMC);
	}
}
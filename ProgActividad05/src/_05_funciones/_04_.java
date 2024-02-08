package _05_funciones;
/*
Ej04. Crea una función que devuelva el área (parámetro de salida) de un rectángulo dada su base y su altura (parámetros de entrada). El valor devuelto deberemos de imprimirlo por pantalla.

Una vez creada la función, llamar a la función 2 veces desde el método "main" con parámetros de entrada diferentes.
*/
public class _04_ {

	public static void main(String[] args) {
		int area= calcularArea(20, 10);
		System.out.println("El area del rectángulo con base  es " + area);
		System.out.println("El area del rectángulo con base  es " + calcularArea(20, 45));

	}
	
	//Los métodos son verbos! Representan acciones
	public static int calcularArea(int base, int altura){
		int perimetro = base + altura;
		return perimetro;
	}

}

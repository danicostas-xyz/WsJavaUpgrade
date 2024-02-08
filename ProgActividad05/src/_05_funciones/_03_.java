package _05_funciones;
//Ej03. Crea una función que devuelva el perímetro (parámetro de salida) 
//de un rectángulo dada su base y su altura (parámetros de entrada).
//El valor devuelto deberemos de imprimirlo por pantalla.
public class _03_ {

	public static void main(String[] args) {
		int perimetro= perimetro1(20, 10);
		System.out.println("El perímetro del rectángulo con base  es " + perimetro);
		System.out.println("El perímetro del rectángulo con base  es " + perimetro1(20, 45));

	}
	
	public static int perimetro1(int base, int altura){
		int perimetro = 2 * (base + altura);
		return perimetro;
	}

}

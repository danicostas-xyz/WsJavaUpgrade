package _05_funciones;
/*
 * Ej02. Crea una función que imprima por pantalla el perímetro de 
 * un rectángulo dada su base y su altura (parámetros de entrada).
   Una vez creada la función, llamar a la función 2 veces desde 
   el método "main" con parámetros de entrada diferentes.
 */
public class _02_ {

	public static void main(String[] args) {
		perimetro(10,20);
		perimetro(20,30);

	}
	public static void perimetro(double base, double altura) {
		 double perimetro = 2 * (base + altura);
		 System.out.println("El perímetro del rectángulo según su base " + base 
				 + " y altura " + altura + " es de : " + perimetro);
	}

}

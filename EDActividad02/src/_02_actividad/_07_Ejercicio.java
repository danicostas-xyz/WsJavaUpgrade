package _02_actividad;

import java.util.Scanner;

public class _07_Ejercicio {

	public static void main(String[] args) {
    Scanner  sc = new  Scanner(System.in);
    
    System.out.println("A continuacion calcularemos la nota final de un examen");
    System.out.println("Para ello tendremos en cuenta lo siguiente:");
    System.out.println("Por cada respuesta correcta 5 puntos, por una incorrecta -1 y por");
    System.out.println("respuestas en blanco 0");
    
    System.out.println(".........................................");
    
    System.out.println("La cantidad de respuestas correctas:");
    double respuestasCorrectas = sc.nextDouble();
    System.out.println("Ahora la cantidad de respuestas incorrectas");
    double respuestasIncorrectas = sc.nextDouble();
    System.out.println("Para finalizar la cantidad de respuestas en blanco");
    double respuestasBlanco = sc.nextDouble();
    
    int correctas = 5;
    int incorrectas = -1;
    int blanco = 0;
    System.out.println("Pulsa enter para ver la nota final");
    sc.nextLine();
    sc.nextLine();
    double puntajeTotal = (respuestasCorrectas * correctas) 
    					+ (respuestasIncorrectas * incorrectas)
    					+ (respuestasBlanco * blanco);
    
    System.out.println("La nota final sera de: " + puntajeTotal);
    
    
    
	}

}

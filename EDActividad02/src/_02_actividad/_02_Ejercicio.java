package _02_actividad;

import java.util.Scanner;

public class _02_Ejercicio {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("A continuacion vamos a calcular la hipotenusa de un triángulo rectángulo");
	    System.out.println("Para ello introduzca los datos que se le soliciten");
	    
	    System.out.println(".........................................");
	    
	    System.out.println("Introduzca el valor del cateto A en cm: ");
	    double catetoA = sc.nextDouble();
	    System.out.println("Introduzca el valor del cateto B en cm: ");
	    double catetoB = sc.nextDouble();
	    
	    System.out.println(".........................................");
	    double hipotenusa = Math.sqrt((catetoA * catetoA)+ (catetoB * catetoB));
	    System.out.println("El valor de la hipotenusa segun los valores introducidos es de: " + hipotenusa);
	    
	}

}

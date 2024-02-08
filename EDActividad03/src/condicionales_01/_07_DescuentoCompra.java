package condicionales_01;

import java.util.Scanner;

public class _07_DescuentoCompra {

	public static void main(String[] args) {
		descuentos ();
	}
	
	public static void descuentos () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el monto total de la compra si es en decimal ponga ',' en vez de punto");
		double importe = sc.nextDouble();
		double descuento = 0;
		
		if (importe >= 100) {
			descuento = 0.10;
			System.out.println("Recibes un 10% de descuento");
		}else if (importe>=50) {
			descuento = 0.05;
			System.out.println("Recibes un 5% de descuento");
		}else {
			System.out.println("Recibes un 0% de descuento");
		}
		
		double importeTotal = importe - (importe * descuento);
		System.out.println("El importe total de la compra es: " + importeTotal);		
	}
}

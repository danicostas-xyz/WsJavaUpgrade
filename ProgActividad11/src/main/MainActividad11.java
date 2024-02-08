package main;

import java.util.Scanner;

import entidad.Videojuego;

public class MainActividad11 {

	public static void main(String[] args) {
		Videojuego v1 = new Videojuego();
		Videojuego v2 = new Videojuego("Fornite", "15/03/2016");
		Videojuego v3 = new Videojuego(3, "Baldurs Gate III", 10, 59.95, "03/08/2023", true);
		
		Scanner sc = new Scanner(System.in);
		v1.id = sc.nextLong();
		v1.precio = sc.nextDouble();
		v1.puntuacion = sc.nextDouble();
		v1.esSegundaMano = sc.nextBoolean();
		//La clase scanner tiene un problema, siempre que recojamos
		//un dato que no sea String y luego queráis recoger un String
		//tenéis que hacer un nextLine() extra
		sc.nextLine();
		v1.nombre = sc.nextLine();
		//v1.fecha = sc.nextLine();
		
		//Invocamos los métodos
		v1.mostrarDatos();
		v1.mostrarNombrePuntuacion();
		v1.mostrarPrecioEnLibras();
		v1.mostrarFechaInvertida();
		v1.mostrarFechaInvertidaSubstring();
		System.out.println(v1.calcularDescuento());
		v1.mostrarEsApto();
		v1.mostrarPuntacionHastaElDiez();
		boolean esMasCaro = v1.esMasCaro(v3);
		System.out.println(esMasCaro);
		int iEsMasCaro = v1.esMasCaroOIgual(v3);
		
		switch (iEsMasCaro) {
		case -1:
			System.out.println("v1 es más barato que v3");
			break;
		case 0:
			System.out.println("v1 vale lo mismo que v3");
			break;
		case 1:
			System.out.println("v1 es más caro que v3");
			break;
		default:
			break;
		}
	}

}

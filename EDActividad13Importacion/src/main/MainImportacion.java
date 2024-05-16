package main;

import operaciones.Matematicas;

public class MainImportacion {

	public static void main(String[] args) throws Exception {

		System.out.println("Hola librerias");
		int resultado = Matematicas.sumar(1, 3);
		System.out.println(resultado);
		
		resultado = Matematicas.dividir(5, 0);//arrojamos la excepcion
	}

}

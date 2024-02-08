package string;

import java.util.Scanner;

public class Ejercicio_04_ComparacionCadenas {

	public static void main(String[] args) {
		System.out.println("Ejercicio 4: ingresar usuario y contraseña y mostrar bienvenido al programa si acierta");
		System.out.println("--------------------------------------------------------------------------------------");
	
		String usuarioBien = "Capi";
		String contrasenaBien = "odioAironMan69";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el usuario: ");
		String usuario = sc.nextLine();
		
		System.out.println("Ingrese contraseña: ");
		String contrasena = sc.nextLine();
		
		usuario = usuario.trim();//quitamos los espacios a la derecha y a la izquierda
		contrasena = contrasena.trim();
		
		if(usuario.equalsIgnoreCase(usuarioBien) && contrasena.equals(contrasenaBien)) {
			System.out.println("Bienvenido al programa rey CAPITAN DE NAVÍO");
		}else {
			System.out.println("Usuario o password incorrecto");
		}
		
		sc.close();
	}

}

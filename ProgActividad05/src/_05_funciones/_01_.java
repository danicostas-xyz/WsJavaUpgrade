package _05_funciones;
//Ejercicio 001: Crea una función que imprima por pantalla un menú como el que sigue:
//1.Entrar en la aplicación.
//2.Registrarse en la aplicación
//3.Salir del programa

//Una vez creada la función, llamar a la función 3 veces desde el método 'main'
public class _01_ {
	
	public static void main(String [] args) {
		eligeMenu();
		eligeMenu();
		eligeMenu();
		eligeMenu2();
	}

	public static void eligeMenu() {
		System.out.println("Este es tu menú de opciones");
		System.out.println("---------------------------");
		System.out.println("1.Entrar en la aplicación.");
		System.out.println("2.Registrarse en la aplicación");
		System.out.println("3.Salir del programa");
	}
	
	public static void eligeMenu2() {
		//Utilizando "\n". Cuando imprimimos por consola "\n" hace un salto de linea
		System.out.print("\tEste es tu menú de opciones\n");
		System.out.print("\t---------------------------\n");
		System.out.print("\t1.Entrar en la aplicación.\n");
		System.out.print("\t2.Registrarse en la aplicación\n");
		System.out.print("\t3.Salir del programa\n");
	}
}
	

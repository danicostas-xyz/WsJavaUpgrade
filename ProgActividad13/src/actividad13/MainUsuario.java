package actividad13;

import java.util.Scanner;

public class MainUsuario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Usuario[] listaUsuarios = new Usuario[3];
		System.out.println("Cuantas valoraciones va a introducir en general?");
		int arrayTamanio = scan.nextInt();
		listaUsuarios[0] = new Usuario("2321f", "Paco", new double[arrayTamanio] );
		listaUsuarios[1] = new Usuario("1WDSF", "JUAN", new double[] {1.0, 3.4, 5.2, 6.2, 10.0} );
		listaUsuarios[2] = new Usuario("1112D", "Antonio", new double[arrayTamanio] );
		
		for(Usuario u : listaUsuarios) {
			pedirValoraciones(scan,u);
		}
		/*
		pedirValoraciones(scan, arrayTamanio, listaUsuarios[0]);
		pedirValoraciones(scan, arrayTamanio, listaUsuarios[1]);
		pedirValoraciones(scan, arrayTamanio, listaUsuarios[2]);*/
		
		for(int i = 0;i<listaUsuarios.length;i++) {
			System.out.println("---------------------------------------------------------------------------------------------------------------");
			System.out.println("Usuario " + (i+1));
			// TOSTRING
			System.out.println(listaUsuarios[i]);
			// Devolver Valoracion Media
			System.out.println("La media de las valoraciones es: " + listaUsuarios[i].devolverValoracionMedia());
			// Mostrar valoraciones
			listaUsuarios[i].motrarValoraciones();
			// Devolver puntuaciones más altas
			System.out.println("La cantidad de notas más altas es: " + listaUsuarios[i].devolverPuntuacionesMasAltas(5));
			// Devolver mayor y menor media
			System.out.println("La valoracion supera la media de valoraciones ? = " + listaUsuarios[i].devolverMayorOMenorMediaValoracion(7));
			System.out.println("---------------------------------------------------------------------------------------------------------------");
		}
		scan.close();
	}
	
	public static void pedirValoraciones(Scanner scan, Usuario usuario) {
		System.out.println("Valoracion usuario");
		for (int j = 0;j< usuario.valoraciones.length;j++) {
			double valoracion = 0;
			do {
				System.out.println("Introduce la valoracion del Usuario | numero " + (j+1));
				valoracion = scan.nextDouble();
			}while((valoracion>10) || (valoracion<0) );
			usuario.valoraciones[j] = valoracion;
		}
	}

}
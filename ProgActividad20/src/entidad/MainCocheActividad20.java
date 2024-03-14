package entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCocheActividad20 {

	private Scanner sc;
	private ArrayList<Coche> listaCoches;
	
	public static void main(String[] args) {
		MainCocheActividad20 main = new MainCocheActividad20();
		main.arrancarPrograma();
	}
	
	public void arrancarPrograma() {
		sc = new Scanner(System.in);
		listaCoches = new ArrayList<>();
		String opcion = null;
		
		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case "1":
				crearCoche();
				break;
			case "2":
				mostrarCoches();
				break;
			case "3":
				mostrarContadorID();
				break;
			case "4":
				resetearContadorID();
				break;
			case "5":
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}while(!opcion.equals("5"));		
	}
	
	public String mostrarMenu() {
		System.out.println();
		System.out.println("Menú");
		System.out.println("1- Crear coche");
		System.out.println("2- Mostrar coches");
		System.out.println("3- Mostrar contador ID");
		System.out.println("4- Resetear contador ID");
		System.out.println("5- Salir del programa");
		System.out.print("Elija una opción: ");
		String opcion = sc.nextLine();
		return opcion;
	}
	
	public void crearCoche() {
		System.out.println("Introduzca la matricula");
		String matricula = sc.nextLine();
		System.out.println("Inroduzca la marca");
		String marca = sc.nextLine();
		
		Coche coche = new Coche();
		coche.setMatricula(matricula);
		coche.setMarca(marca);
		
		listaCoches.add(coche);
	}
	
	public void mostrarCoches() {
		for(Coche c : listaCoches) {
			System.out.println(c);
		}
	}
	
	public void mostrarContadorID() {
		System.out.println("Valor actual del contador ID: " + Coche.getContadorID());		
	}
	
	public void resetearContadorID() {
		System.out.println("Contador resetado a 0");
		Coche.resetarContadorID();
	}

}

package main;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Director;
import entidad.Empleado;
import entidad.JefeDeProyecto;
import entidad.Programador;

public class MainEmpleados {
	
	private ArrayList<Empleado> listaGeneral;
	private Scanner scanner;

	public static void main(String[] args) {
		MainEmpleados me = new MainEmpleados();
		me.menu();
	}

	private void menu() {
		scanner = new Scanner(System.in);
		listaGeneral = new ArrayList<Empleado>();

		String opcion = "";
		
		do {
			System.out.println(" --------------------------------------");
			System.out.println("|[1] Dar de alta un Empleado           |");
			System.out.println("|[2] Mostrar Empleados                 |");
			System.out.println("|[3] Mostrar Salario                   |");
			System.out.println("|[4] Coste total Empresa               |");
			System.out.println("|[0] Salir del programa                |");
			System.out.println(" --------------------------------------");
			System.out.println("Eligue una opción: ");

			opcion = scanner.nextLine();

			switch (opcion) {
			case "1":
				darDeAltaEmpleado();
				break;
			case "2":
				mostrarEmpleados();
				break;
			case "3":
				mostrarSalarioEmpleado();
				break;
			case "4":
				costeTotalEmpresa();
				break;
			case "0":
				System.out.println("Programa terminado.");
				break;
			default:
				System.out.println("La opción no es valida.");
				break;
			}
		} while (!opcion.equals("0"));
	}

	private void darDeAltaEmpleado() {

		String opcion = "";

		do {
			System.out.println(" ------------------------");
			System.out.println("|     DAR DE ALTA        |");
			System.out.println("|[1] Programador         |");
			System.out.println("|[2] Jefe de Proyecto    |");
			System.out.println("|[3] Director            |");
			System.out.println("|[0] Salir               |");
			System.out.println(" ------------------------");
			System.out.println("Eligue una opción: ");

			opcion = scanner.nextLine();
			Empleado e = null;
			
			switch (opcion) {
			case "1":
				e = darDeAltaProgramador();
				listaGeneral.add(e);
				break;
			case "2":
				e = darDeAltaJefeDeProyecto();
				listaGeneral.add(e);
				break;
			case "3":
				e = darDeAltaDirector();
				listaGeneral.add(e);
				break;
			case "0":
				break;
			default:
				System.out.println("opción incorrecta");
				break;
			}
		} while (!opcion.equals("0"));
	}

	private Empleado darDeAltaProgramador() {
		Programador programador = new Programador();

		System.out.println("- Alta Programador -");

		programador.setNombre(pedirNombre());
		programador.setDni(pedirDni());
		programador.setSueldoBase(pedirSueldo());

		return programador;
	}

	private Empleado darDeAltaJefeDeProyecto() {
		JefeDeProyecto jefe = new JefeDeProyecto();

		System.out.println("- Alta Jefe de Proyecto -");

		jefe.setNombre(pedirNombre());
		jefe.setDni(pedirDni());
		jefe.setSueldoBase(pedirSueldo());
		jefe.setIncentivo(pedirIncentivo());

		return jefe;

	}

	private Empleado darDeAltaDirector() {
		Director director = new Director();
		
		System.out.println("- Alta Director -");
		
		director.setNombre(pedirNombre());
		director.setDni(pedirDni());
		director.setSueldoBase(pedirSueldo());
		director.setListaEmpleados(seleccionarEmpleado());

		return director;

	}

	private ArrayList<Empleado> seleccionarEmpleado() {
		ArrayList<Empleado> listaEmpleadosDelDirector = new ArrayList<Empleado>();
		String opcion = "";
		
		do {
			System.out.println("Seleciona un Empleado o pulsa 's' para Salir");
			mostrarEmpleados();
			opcion = scanner.nextLine();
			
			if (!opcion.equalsIgnoreCase("s")) {
				int iOpcion = Integer.parseInt(opcion);
				listaEmpleadosDelDirector.add(listaGeneral.get(iOpcion));
			}
			
		} while (!opcion.equalsIgnoreCase("s"));

		return listaEmpleadosDelDirector;
	}

	private void mostrarEmpleados() {
		int contador = 0;
		
		if(listaGeneral.size() > 0) {
			for (Empleado empleado : listaGeneral) {
				System.out.println("[" + contador++ + "]" + empleado);
			}
		}else {
			System.out.println("No hay ningun Empleado dado de alta.");
		}

	}

	private void mostrarSalarioEmpleado() {

		mostrarEmpleados();
		
		if(listaGeneral.size() > 0) {
			System.out.println("Elige un empleado: ");
			String sOpcion = scanner.nextLine();
		
			int iOpcion = Integer.parseInt(sOpcion);
			System.out.println(listaGeneral.get(iOpcion).salarioTotal());
		}
	}

	private void costeTotalEmpresa() {

		double costeTotal = 0;
		for (Empleado empleado : listaGeneral) {
			costeTotal += empleado.salarioTotal();
		}
		System.out.println("El coste total de salarios es: " + costeTotal + "€");

	}
	

	private double pedirSueldo() {
		System.out.println("Ingresa el sueldo:");
		String sueldo = scanner.nextLine();
		double iSueldo = Integer.parseInt(sueldo);
		return iSueldo;
	}

	private String pedirDni() {
		System.out.println("Ingresa el dni:");
		String dni = scanner.nextLine();
		return dni;
	}

	private String pedirNombre() {
		System.out.println("Ingresa un nombre:");
		String nombre = scanner.nextLine();
		return nombre;
	}
	

	private double pedirIncentivo() {
		System.out.println("Ingresa la cantidad de incentivo:");
		String incentivo = scanner.nextLine();
		double iIncentivo = Integer.parseInt(incentivo);
		return iIncentivo;
	}

}

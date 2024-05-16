package actividad25;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EmpresaMain {
	
	private static Random rd = new Random();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		ArrayList<Empleado> listaEmpleadosCreados = new ArrayList<Empleado>();
		ArrayList<Integer> listaIDS = new ArrayList<Integer>();
		int opcion = 0;
		int opcionmain = 0;
		do {
			menuPrincipal();
			opcionmain = Integer.parseInt(scan.nextLine());
			switch (opcionmain) {
			case 1: {
				crearEmpleado(listaEmpleados, listaEmpleadosCreados,listaIDS,opcion);
				break;
			}case 2:{
				mostrarEmpleados(listaEmpleados);
				break;
			}case 3:{
				mostrarSalarioEmpleados(listaEmpleados);
				break;
			}case 4:{
				calcularCostesEmpresa(listaEmpleados); 
				break;
			}case 5:{
				calcularDespidos(listaEmpleados);
				break;
			}case 6:{
				System.out.println("Saliste del programa");
				break;
			}
			default:
				System.out.println("OPCION INCORRECTA");
				
			}
		}while(opcion != 6);
		
		

	}
	public static void menuPrincipal() {
		System.out.println(" MENU ");
		System.out.println("1. Dar de alta empleado");
		System.out.println("2. Mostrar Empleados");
		System.out.println("3. Calcular salario empleado");
		System.out.println("4. Calcular costes totales empresa");
		System.out.println("5. Calcular despidos");
		System.out.println("6. Salir del programa");
	}
	public static void imprimirMenu() {
		System.out.println(" MENU ");
		System.out.println("¿Que tipo de empleado quieres dar de alta?");
		System.out.println("1. Programador");
		System.out.println("2. Jefe de Proyecto");
		System.out.println("3. Director");
		System.out.println("4. Volver al Menu Principal");
	}
	public static void mostrarEmpleados(ArrayList<Empleado> listaEmpleados) {
		for (Empleado s: listaEmpleados) {
			System.out.println(s);
		}
		
	}
	public static void crearEmpleado(ArrayList<Empleado> listaEmpleados, ArrayList<Empleado> listaEmpleadosCreados,ArrayList<Integer> listaIDS, int opcion) {
		do {
			imprimirMenu();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case 1: {
				System.out.println("Introduce el dni del empleado");
				scan.next();
				String dni = scan.nextLine();
				System.out.println("Introduce el nombre del empleado");
				String nombre = scan.nextLine();
				System.out.println("Introduce el sueldo del empleado");
				double sueldo = Integer.parseInt(scan.nextLine());
				System.out.println("Introduce los anios trabajados del empleado");
				int aniosTrabajados = Integer.parseInt(scan.nextLine());
				int id = generarIDS(listaIDS);
				listaEmpleados.add(new Programador(id, dni, nombre, sueldo, aniosTrabajados));
				listaEmpleadosCreados.add(new Programador(id, dni, nombre, sueldo, aniosTrabajados));
				break;
			}case 2:{
				System.out.println("Introduce el dni del empleado");
				scan.next();
				String dni = scan.nextLine();
				System.out.println("Introduce el nombre del empleado");
				String nombre = scan.nextLine();
				System.out.println("Introduce el sueldo del empleado");
				double sueldo = Integer.parseInt(scan.nextLine());
				System.out.println("Introduce los anios trabajados del empleado");
				int aniosTrabajados = Integer.parseInt(scan.nextLine());
				int id = rd.nextInt(1,12000000);
				listaEmpleados.add(new JefeProyecto(id, dni, nombre, sueldo, aniosTrabajados));
				listaEmpleadosCreados.add(new JefeProyecto(id, dni, nombre, sueldo, aniosTrabajados));
				break;
			}case 3:{
				System.out.println("Introduce el dni del empleado");
				scan.next();
				String dni = scan.nextLine();
				System.out.println("Introduce el nombre del empleado");
				String nombre = scan.nextLine();
				System.out.println("Introduce el sueldo del empleado");
				double sueldo = Integer.parseInt(scan.nextLine());
				System.out.println("Introduce los anios trabajados del empleado");
				int aniosTrabajados = Integer.parseInt(scan.nextLine());
				int id = rd.nextInt(1,12000000);
				System.out.println("Elige que empleados trabajan bajo ordenes de este director (Introducir id)");
				ArrayList<Empleado> empleadosDirector = new ArrayList<Empleado>();
				for(Empleado s: listaEmpleadosCreados) {
					System.out.println(s);
				}
				int eleccionID = scan.nextInt();
				for(Empleado h: listaEmpleadosCreados) {
					if(h.getId() == eleccionID) {
						empleadosDirector.add(h);
					}
				}
				listaEmpleados.add(new Director(id, dni, nombre, sueldo, empleadosDirector, aniosTrabajados));
		
				break;
			}case 4:{
				System.out.println("Saliste del programa");
				break;
			}
			default:
				System.out.println("OPCION INCORRECTA");
				
			}
		}while(opcion != 4);
	}
	public static void mostrarSalarioEmpleados(ArrayList<Empleado> listaEmpleados) {
		System.out.println("Elige una ID");
		for(Empleado r : listaEmpleados) {
			System.out.println(r);
			System.out.println();
		}
		int buscarID = scan.nextInt();
		for (Empleado e : listaEmpleados) {
			if(e.getId() == buscarID ) {
				System.out.println("El salario del empleado es: " + e.calcularSalarioTotal());
			}
			System.out.println("------");
		}
		
	}
	public static void calcularCostesEmpresa(ArrayList<Empleado> listaEmpleados) {
		double contadorCostes = 0;
		for(Empleado c : listaEmpleados) {
			contadorCostes += c.calcularSalarioTotal();
		}
		System.out.println("El coste total de la empresa sera de :"  + contadorCostes);
		
	}
	public static int generarIDS(ArrayList<Integer> listaIDS) {
		int id = rd.nextInt(1,Integer.MAX_VALUE);
		for(Integer l : listaIDS) {
			if(l == id) {
				id = rd.nextInt(1,12000000);
			}else {
				listaIDS.add(id);
			}
		}
		return id;
	}
	public static void calcularDespidos(ArrayList<Empleado> listaEmpleados) {
		System.out.println("Despidos Procedentes");
		listaEmpleados.forEach(v -> System.out.println("Hola soy el trabajador " + v.getNombre() + " y mi salario de despido es " + v.calcularDespidoProcedente()));
		System.out.println("Despidos Improcedentes");
		listaEmpleados.forEach(v -> System.out.println("Hola soy el trabajador " + v.getNombre() + " y mi salario de despido es " + v.calcularDespidoImporocedente(v.getAniosTrabajados())));
	}
	

}

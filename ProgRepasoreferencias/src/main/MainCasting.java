package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

import entidades.Alumno;

public class MainCasting {

	public static void main(String[] args) {
		int n1 = 5;
		Alumno a1 = new Alumno();
		Alumno a2 = a1;
		int n2 = n1;
		
		a1.setEdad(20);
		a2.setEdad(25);
		
		System.out.println(a1.getEdad());
		System.out.println(a2.getEdad());
		
		n1 = 3;
		System.out.println(n2);
		System.out.println(n1);
		
		Alumno a3 = new Alumno();
		Alumno a4 = new Alumno();
		a3.setEdad(50);
		a4.setEdad(65);
		
		System.out.println(a3.getEdad());
		
		a4 = a3;
		a4.setEdad(40);
		System.out.println(a3.getEdad());
		
		a4 = null;
		System.out.println(a3.getEdad());
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		Alumno a5 = new Alumno();
		listaAlumnos.add(a5);
		
		a5.setEdad(20);

		System.out.println(listaAlumnos.get(0).getEdad());
		
	}
}

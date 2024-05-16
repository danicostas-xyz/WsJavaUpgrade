package main;

import java.util.Scanner;

import entidades.Personaje;

public class Combate {
	private Personaje m1;
	private Personaje m2;
	
	public Combate(Personaje m1, Personaje m2) {
		super();
		this.m1 = m1;
		this.m2 = m2;
	}
	
	/**
	 * Metodo que realiza el combate entre dos muniemon por turnos
	 * @return el muniemon ganador
	 */
	public Personaje empezar() {
		System.out.println("EMPIEZA EL GRAN COMBATE ENTRE PERSONAJES");
		int turno = 1;
		Scanner sc = new Scanner(System.in);
		boolean combateAcabado = false;
		Personaje muniemonGanador = null;
		do {
			System.out.println("Primer personaje: " + m1);
			System.out.println("Segundo personaje: " + m2);
			System.out.println("Turno: "  + turno++);
			m1.atacar(m2);//Polimorfismo
			if(m2.getVida() <= 0) {
				combateAcabado = true;
			}
			if(!combateAcabado) {
				m2.atacar(m1);
				if(m1.getVida() <= 0) {
					combateAcabado = true;
				}
				if(combateAcabado) {
					muniemonGanador = m2;
				}
			}else {
				muniemonGanador = m1;
			}
			System.out.println("Pulse enter para continuar");
			sc.nextLine();
		}while(!combateAcabado);
		
		return muniemonGanador;
	}	
}

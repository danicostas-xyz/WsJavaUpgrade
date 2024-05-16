package main;

import entidades.Arma;
import entidades.Curandero;
import entidades.Hechizo;
import entidades.Mago;
import entidades.Personaje;
import entidades.Rezo;

public class MainCombate {

	public static void main(String[] args) {
		Mago m1 = new Mago();
		Arma arma = new Hechizo();
		arma.setDanio(10);
		m1.setNombre("Merlin");
		m1.setVida(50);
		m1.setInteligencia(5);
		m1.setArma(arma);
		
		Curandero c = new Curandero();
		c.setNombre("Padre Miguel");
		c.setVida(40);
		c.setSabiduria(7);
		arma = new Rezo();
		arma.setDanio(9);
		c.setArma(arma);
		
		Combate combate = new Combate(m1, c);
		Personaje pGanador = combate.empezar();
		System.out.println("El ganador es: " + pGanador);
		
		

	}
	

}

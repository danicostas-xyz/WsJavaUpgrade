package _14_ClasesObjetosYArrays;

import java.util.Arrays;

public class Equipo {
	
	String nombre;
	String[] jugadores;
	
	public Equipo() {
	}
	
	public Equipo(String nombre, String[] jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" +
				Arrays.toString(jugadores) + "]";
	}

	public void mostrarJugadores() {
		for(String jugador : jugadores) {
			System.out.println(jugador);
		}
	}
	
	public boolean existeJugador(String jugador) {
		for (String j : jugadores) {
			if (j.equalsIgnoreCase(jugador)) {
				return true;
			}
		}
		return false;
	}
	
	public int cantidadDeJugadores() {
		int contadorJugadores = 0;
		for(String j : jugadores) {
			if(j != null) {
				contadorJugadores++;
			}
		}
		return contadorJugadores;
	}
	
	public boolean aptoParaJugar() {
		if (cantidadDeJugadores() > 6) {
			return true;
		}
		return false;
	}
	
	public boolean listasIguales (Equipo segundoEquipo) {
		if (this.jugadores.length != segundoEquipo.jugadores.length) {
			return false;
		}
		
		for(String otroJugador : segundoEquipo.jugadores) {
			if(existeJugador(otroJugador)) {
				continue;
			}else {
				return false;
			}
		}
		
		return true;
		
		/*
		
		boolean[] existenJugadores = new boolean[this.jugadores.length];
		for (int i = 0; i < this.jugadores.length; i++) {
			for (int j = 0; j < segundoEquipo.jugadores.length; j++) {
				if (this.jugadores[i].equalsIgnoreCase(segundoEquipo.jugadores[j])) {
					existenJugadores[i] = true;
				}
			}
		}
		for (int i = 0; i < this.jugadores.length; i++) {
			if (existenJugadores[i] == false) {
				return false;
			}
		}
		return true;*/
	}
	
	public boolean equiposIguales (Equipo segundoEquipo) {
		if (this.nombre.equalsIgnoreCase(segundoEquipo.nombre)
				&& listasIguales(segundoEquipo)) {
			return true;
		}
		return false;
	}
	
}
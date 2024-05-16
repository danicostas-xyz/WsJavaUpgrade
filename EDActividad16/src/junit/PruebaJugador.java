package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Jugador;

class PruebaJugador {

	private Jugador j1;
	
	@BeforeEach
	void crearJugador() {
		j1 = new Jugador();
	}
	
	// JUGADOR
	// Metodo poner dorsal
	@Test
	void testPonerDorsalIgualUno() {
		j1.ponerDorsal(1);
		int resultadoEsperado = 1;
		int resultado = j1.getDorsal();
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	void testPonerDorsalIgualVeinte() {
		j1.ponerDorsal(20);
		int resultadoEsperado = 20;
		int resultado = j1.getDorsal();
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	void testPonerDorsalMayorTreinta() {
		j1.ponerDorsal(45);
		int resultadoEsperado = -1;
		int resultado = j1.getDorsal();
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	void testPonerDorsalMenorUno() {
		Jugador j1 = new Jugador();
		j1.ponerDorsal(0);
		int resultadoEsperado = -1;
		int resultado = j1.getDorsal();
		assertEquals(resultadoEsperado, resultado);
	}

	// Metodo estaExpulsado
	@Test
	void testEstaExpulsadoDosTarjetasAmarillas() {
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(0);
		assertTrue(j1.estaExpulsado());
	}

	@Test
	void testEstaExpulsadoUnaTarjetaRoja() {
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);
		assertTrue(j1.estaExpulsado());
	}

	@Test
	void testEstaExpulsadoUnaTarjetaRojaYUnaAmarilla() {
		j1.setNumeroTarjetasAmarillas(1);
		j1.setNumeroTarjetasRojas(1);
		assertTrue(j1.estaExpulsado());
	}

	@Test
	void testEstaExpulsadoCeroTarjetas() {
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(0);
		assertFalse(j1.estaExpulsado());
	}
	
	@Test
	void testEstaExpulsadoUnaTarjetaAmarilla() {
		j1.setNumeroTarjetasAmarillas(1);
		j1.setNumeroTarjetasRojas(0);
		assertFalse(j1.estaExpulsado());
	}

	@Test
	void invocarMetodosJugador() {
		j1.toString();
		j1.setDorsal(10);
		j1.getNumeroTarjetasAmarillas();
		j1.getNumeroTarjetasRojas();
	}

}

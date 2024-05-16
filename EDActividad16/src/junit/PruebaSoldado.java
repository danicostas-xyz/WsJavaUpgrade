package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Soldado;

class PruebaSoldado {

	private Soldado soldado = null;
	
	@BeforeEach
	void crearSoldado() {
		soldado = new Soldado();
	}
	// SOLDADO
	// Metodo puedeDisparar

	//En las pruebas comparamos resultado esperados con resultados
	//obtenidos
	//En este caso establecemos el numero de balas a 0 y esperamos
	//"false"
	@Test
	void testPuedeDispararIgualCero() {
		soldado.setNumeroBalas(0);
		assertFalse(soldado.puedeDisparar());
	}

	@Test
	void testPuedeDispararMenorCero() {
		soldado.setNumeroBalas(-10);
		assertFalse(soldado.puedeDisparar());
	}

	@Test
	void testPuedeDispararMayorCero() {
		soldado.setNumeroBalas(5);
		assertTrue(soldado.puedeDisparar());
	}

	// Metodo disparar
	@Test
	void testDisparar() {
		Soldado segundoSoldado = new Soldado();
		soldado.setNumeroBalas(5);
		int resultadoEsperado = 4;
		soldado.disparar(segundoSoldado);
		int resultadoObtenido = soldado.getNumeroBalas();//4
		assertTrue(segundoSoldado.isEstaMuerto());//True
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void invocarMetodosSoldado() {
		Soldado soldado = new Soldado();
		soldado.toString();
		soldado.setEstaMuerto(false);
	}

}

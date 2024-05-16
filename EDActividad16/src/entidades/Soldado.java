package entidades;

/**
 * Esta clase incluye dos métodos que darán funcionalidad al <b>Soldado</b>.
 * 
 * El primer método nos dirá si al soldado le quedan balas o no. Con el segundo
 * método el soldado disparará si le quedan balas.
 * 
 * Tambien posee los siguientes metodos {@link #puedeDisparar)},
 * {@link #disparar(Soldado)}
 * 
 * @author Yina.
 * @author Felix de Pablo
 * @version 1.0
 */
public class Soldado {
	/**
	 * Esta propiedad nos indica si el <b>Soldado</b> está muerto o no.
	 */
	private boolean estaMuerto;
	/**
	 * Representa el numero de balas que tiene el soldado Atributo de tipo entero
	 */
	private int numeroBalas;

	// Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las
	// pruebas y la documentación.
	// Aquí no se han creado porque no aportan nada

	@Override
	public String toString() {
		return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
	}

	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	/**
	 * Este método nos indica si el <b>Soldado</b> puede o no disparar, en función
	 * del número de balas que tenga el soldado. Si el número de balas es mayor que
	 * 0, entonces <b>sí</b> podrá disparar. En caso de que sea igual o menor a 0
	 * <b>no</b> podrá disparar.
	 * 
	 * @return<b>true</b> si le quedan balas y puede disparar (mayor que 0) o <b>false</b> si no
	 *        no puede disparar.
	 */
	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {
			return true;
		}
		return false;
	}

	/**
	 * Metodo mediante el cual se mata a un Soldado pasado por parametro. Se le
	 * restara una bala al soldado(parametro numeroBalas -1) desde el cual se llama 
	 * el metodo y se igualará el  atributo estaMuerto del soldado pasado por 
	 * parametro a 'true'
	 * 
	 * @param sol representa el soldado que morirá.
	 */

	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}
}

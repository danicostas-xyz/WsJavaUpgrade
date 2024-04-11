package entidad;

/**
 * Clase que representa un brujo con tres atributos, vida, tieneAlma y poder.
 * 
 * Esta clase sera usada para un videojuego de lucha
 * 
 * @author Steve Rogers
 * @version 1.0
 *
 */
public class BrujoSinDocumentar {
	
	/**
	 * Vida del brujo, va con valores comprendidos entre cualquier numero
	 * negativo y el 100
	 * Si llega a 0 o inferior esta muerto
	 */
	private int vida;
	/**
	 * El brujo puede tener alma
	 */
	private boolean tieneAlma;
	/**
	 * El brujo puede tener poder. No hay maximo y no se admiten negativos.
	 */
	private int poder;	
	
	public void setPoder(int poder) {
		if(poder < 0) {
			poder = 0;
		}else {
			this.poder = poder;
		}
	}
	
	public boolean estaMuerto() {
		if(vida <= 0) {
			return true;
		}else if(!tieneAlma) {
			return true;
		}		
		return false;
	}
	
	// Los getter y setters no hace falta documentarlos normalmente
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public boolean isTieneAlma() {
		return tieneAlma;
	}

	public void setTieneAlma(boolean tieneAlma) {
		this.tieneAlma = tieneAlma;
	}

	public int getPoder() {
		return poder;
	}

}

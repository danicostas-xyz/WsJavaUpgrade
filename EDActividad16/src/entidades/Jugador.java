package entidades;

/**
* Clase Jugador, tiene como objetivo 
* realizar un seguimiento de las diferentes estadisticas del
* jugador. Contiene los siguientes atributos:
* <br>
* <ul>
* <li> dorsal </li>
* <li> numeroTarjetasAmarillas </li>
* <li> numeroTarjetasRojas </li>
* </ul>
* <br>
* Posee los siguientes metodos {@link #ponerDorsal(int)},
* {@link #numeroTarjetasAmarillas} y {@link #numeroTarjetasRojas}
* @author Yina.
*/
public class Jugador {
	 /** Representa el numero de la camiseta del jugador
	 * Se limita su rango de valores con el metodo 
	 * {@link #ponerDorsal(int)}
	 */
	private int dorsal;
	/**
	 * "numeroTarjetasAmarillas" representa el número de taretas 
	 * amarillas asignadas al jugador. Su rango es de 0 a 2
	 * Se utiliza este atributo en el metodo "estaExpulsado"
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * "numeroTarjetasROjas" representa el número de tarjetas 
	 * rojas asignadas al jugador. Su rango es de 0 a 1
	 * Se utiliza este atributo en el metodo "estaExpulsado"
	*/
	private int numeroTarjetasRojas;
	


//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", numeroTarjetasAmarillas=" + numeroTarjetasAmarillas
				+ ", numeroTarjetasRojas=" + numeroTarjetasRojas + "]";
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	/**
	 * Metodo que condiciona el rango de valores que puede
	 * tener el dorsal del jugador, teniendo como parametro de 
	 * entrada un dorsal. 
	 * <br>
	 * La condicion que sigue es la siguiente: 
	 * - Si el dorsal es mayor o igual a 1 y menor o igual a 30: El
	 * atributo dorsal del jugador se igualara al dorsal pasado por 
	 * parametro
	 * - De no cumplirse la condicion anterior el atributo dorsal
	 * se igualara a "-1"
	 * 
	 * @param dorsal Número de camiseta del jugador pasador por parametro
	 */
	public void ponerDorsal(int dorsal) {
		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}

	/**
	 * Metodo que devulve si el jugador será o no expulsado
	 * 
	 * <br>
	 * Las condiciones que rigen el metodo son:
	 * -En caso de que el jugador hubiese recibido dos tarjetas amarillas
	 * seria expulsado.
	 * -Si el jugador recibio directamente una tarjeta roja tambien va a 
	 * ser expulsado. 
	 * @return <b>true</b> si el jugador ha recibido dos tarjetas amarillas
	 * o una roja y <b>false</b> si no sucedio ninguno de los casos anteriores.
	 */

	public boolean estaExpulsado() {
		boolean expulsado = false;
		if (numeroTarjetasAmarillas == 2) {
			expulsado = true;
		}
		if (numeroTarjetasRojas == 1) {
			expulsado = true;
		}
		return expulsado;
	}
	

}

package entidad;

public class Muniemon {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private TipoMuniemon tipo;
	private int velocidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public TipoMuniemon getTipo() {
		return tipo;
	}
	public void setTipo(TipoMuniemon tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * Método en el cual este muniemon ataca a otro muniemon pasado por parámetro
	 * Solo atacará cuando este muniemon su vida sea superior a 0. Cuando un muniemon
	 * ataque a otro le restará una vida igual al ataque del muniemon pasado por parámetro,
	 * pero antes, se le restará el ataque del muniemon a la defensa del muniemon pasado
	 * por parametro. Solamente se restará la vida cuando el daño resultante (de restar
	 * el ataque a la defensa) sea mayor que 0.
	 * 
	 * Además el método imprimirá por pantalla cuando el muniemon a atacará a otro muniemon
	 * (con los nombres de los correspondientes muniemons) o cuando no atacará (su vida sera
	 * menor o igual que 0)
	 * @param m el muniemon que será atacado
	 * @return <b>true</b> en caso de que este muniemon mate al muniemon pasado por parámetro
	 * (un muniemon muere cuando su vida sea menor o igual que 0, patatero) o <b>false</b> en 
	 * caso de que no lo mate.
	 */
	public boolean atacar(Muniemon m) {
		if(this.vida > 0) {
			System.out.println("El muniemon " + this.nombre + " va a atacar a " + m.nombre);
			int danio = this.ataque - m.defensa;
			if(danio > 0) {
				m.vida -= danio;//m.vida = m.vida - danio;
				if(m.vida <= 0) {
					return true;
				}
			}
		}else {
			System.out.println("El muniemon " + this.nombre + " no puede atacar");
		}
		
		return false;
	}	
}

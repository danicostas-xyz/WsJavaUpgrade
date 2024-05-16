package entidades;

public class Mago extends Personaje {

	private int inteligencia;
	
	@Override
	public void atacar(Personaje p) {
		int danio = this.getArma().getDanio();
		if(this.getArma() instanceof Hechizo) {
			danio += this.inteligencia;
		}
		p.setVida(p.getVida() - danio);		
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	
}

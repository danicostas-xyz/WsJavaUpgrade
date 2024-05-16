package entidades;

public class Guerrero extends Personaje {

	private int fuerza;
	
	@Override
	public void atacar(Personaje p) {
		int danio = this.getArma().getDanio();
		if(this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			danio += this.fuerza;
		}
		p.setVida(p.getVida() - danio);		
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	
}

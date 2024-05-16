package entidades;

public class Curandero extends Personaje {

	private int sabiduria;
	
	@Override
	public void atacar(Personaje p) {
		int danio = this.getArma().getDanio();
		if(this.getArma() instanceof Rezo) {
			danio += this.sabiduria;
		}
		p.setVida(p.getVida() - danio);		
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	
}

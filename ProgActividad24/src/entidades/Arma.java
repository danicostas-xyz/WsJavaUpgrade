package entidades;

public abstract class Arma {
	private int danio;

	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}

	@Override
	public String toString() {
		return "Arma [danio=" + danio + "]";
	}
	
	
}

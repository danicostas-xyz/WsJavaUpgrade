package entidades;

public class Coche extends Vehiculo{
	private String modelo;
	private int numeroAsientos;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroAsientos() {
		return numeroAsientos;
	}
	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}
	
	@Override
	public boolean esCaro() {
		if(this.getPrecio() > 50000) {
			return true;
		}
		return false;
	}
}

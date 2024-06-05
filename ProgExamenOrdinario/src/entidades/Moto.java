package entidades;

public class Moto extends Vehiculo {
	private boolean tieneSidecar;

	public boolean isTieneSidecar() {
		return tieneSidecar;
	}

	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}
	
	@Override
	public boolean esCaro() {
		if(this.getPrecio() > 20000) {
			return true;
		}
		return false;
	}
}

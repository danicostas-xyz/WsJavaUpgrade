package entidades;

import java.util.List;

public class Camion extends Vehiculo{
	private List<Motor> listaMotores;

	public List<Motor> getListaMotores() {
		return listaMotores;
	}

	public void setListaMotores(List<Motor> listaMotores) {
		this.listaMotores = listaMotores;
	}

	@Override
	public boolean esCaro() {
		if(this.getPrecio() > 100000) {
			return true;
		}
		return false;
	}
	
	public int getNumeroMotores() {
		int contador = 0;
		for(Motor motor : listaMotores) {
			if(motor.getTipoMotor() == TipoMotor.ELECTRICO) {
				contador++;
			}
		}
		return contador;
	}
}

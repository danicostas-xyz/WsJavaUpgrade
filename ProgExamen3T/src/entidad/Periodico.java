package entidad;

import java.util.List;

public class Periodico extends MaterialBibliografico{
	private List<String> listaPeriodistas;

	public List<String> getListaPeriodistas() {
		return listaPeriodistas;
	}

	public void setListaPeriodistas(List<String> listaPeriodistas) {
		this.listaPeriodistas = listaPeriodistas;
	}
	
	@Override
	public boolean esCaro() {
		if(this.getPrecio() > 5) {
			return true;
		}else {
			return false;
		}
	}
}

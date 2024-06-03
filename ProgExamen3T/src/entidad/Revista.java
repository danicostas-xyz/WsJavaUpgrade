package entidad;

public class Revista extends MaterialBibliografico{
	private int mesPublicacion;
	
	@Override
	public boolean esCaro() {
		if(this.getPrecio() > 20) {
			return true;
		}else {
			return false;
		}
	}
}

package entidad;

public class Libro extends MaterialBibliografico{
	private Autor autor;
	private int anioPublicacion;
	
	@Override
	public boolean esCaro() {
		if(this.getPrecio() > 50) {
			return true;
		}else {
			return false;
		}
	}
	
	public int aniosDiferenciaConAutor() {
		return getAnioPublicacion() - autor.getAnioNacimiento();
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	
}

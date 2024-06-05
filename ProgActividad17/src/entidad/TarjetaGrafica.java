package entidad;

public class TarjetaGrafica {
	private String marca;
	private String modelo;
	private int nucleosCuda;
	private double precio;
	private RAM ram;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNucleosCuda() {
		return nucleosCuda;
	}
	public void setNucleosCuda(int nucleosCuda) {
		this.nucleosCuda = nucleosCuda;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "TarjetaGrafica [marca=" + marca + ", modelo=" + modelo + ", nucleosCuda=" + nucleosCuda + ", precio="
				+ precio + ", ram=" + ram + "]";
	}
	
	
}

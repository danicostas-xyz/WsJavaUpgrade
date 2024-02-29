package entidad;

import java.util.ArrayList;

public class Ordenador {
	private double precio;
	private Procesador procesador;
	private TarjetaGrafica tarjetaGrafica;
	private PlacaBase placaBase;
	private ArrayList<RAM> listaRAM;
	private ArrayList<Periferico> listaPerifericos;
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Procesador getProcesador() {
		return procesador;
	}
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	public TarjetaGrafica getTarjetaGrafica() {
		return tarjetaGrafica;
	}
	public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}
	public PlacaBase getPlacaBase() {
		return placaBase;
	}
	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}
	public ArrayList<RAM> getListaRAM() {
		return listaRAM;
	}
	public void setListaRAM(ArrayList<RAM> listaRAM) {
		this.listaRAM = listaRAM;
	}
	public ArrayList<Periferico> getListaPerifericos() {
		return listaPerifericos;
	}
	public void setListaPerifericos(ArrayList<Periferico> listaPerifericos) {
		this.listaPerifericos = listaPerifericos;
	}
	@Override
	public String toString() {
		return "Ordenador [precio=" + precio + ", procesador=" + procesador + ", tarjetaGrafica=" + tarjetaGrafica
				+ ", placaBase=" + placaBase + ", listaRAM=" + listaRAM + ", listaPerifericos=" + listaPerifericos
				+ "]";
	}
	
	/**
	 * Esto es JavaDoc y sirve para documentar métodos
	 * Calcula el precio del ordenador basandose en los precios
	 * de los componentes del mismo. Modifica el atributo
	 * precio del ordenador
	 * 
	 * @throws NullPointerException si algun atributo apunta
	 * a nulo
	 */
	public void calcularPrecio() {
		double precioFinal = 0;
		//calculamos el precio del procesador
		precioFinal = procesador.getPrecio();
		
		//calculamos el precio de la tarjetaGrafica
		precioFinal += tarjetaGrafica.getPrecio();
		
		//calculamos el precio de la placaBase
		precioFinal += placaBase.getPrecio();
		//precioFinal += getPlacaBase().getPrecio();
		
		//calculamos el precio de la RAM
		for(RAM ram : listaRAM) {
			precioFinal += ram.getPrecio();
		}
		
		//calcuamos el precio de los perifericos
		//Usamos un for-each
		for(Periferico periferico : listaPerifericos) {
			precioFinal += periferico.getPrecio();
		}
		
		//asignamos el precioTotal al precio del objeto
		this.precio = precioFinal;
	}
}

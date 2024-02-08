package entidad;

public class Videojuego {
	public long id;
	public String nombre;
	public double puntuacion;
	public double precio;
	public String fecha;
	public boolean esSegundaMano;
	
	public Videojuego() {
		super();//esto siempre va al principio, si no lo poneis, java lo pone
		//por vosotros. Esto es llamar al constructor padre
		this.fecha = "01/01/1970";
		//fecha = "01/01/1970";
	}

	public Videojuego(long id, String nombre, double puntuacion, double precio, String fecha, boolean esSegundaMano) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.fecha = fecha;
		this.esSegundaMano = esSegundaMano;
	}

	public Videojuego(String nombre, String fecha) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", puntuacion=" + puntuacion + ", precio=" + precio
				+ ", fecha=" + fecha + ", esSegundaMano=" + esSegundaMano + "]";
	}
	
	public void mostrarDatos() {
		System.out.println("Videojuego [id=" + id + ", nombre=" + nombre + ", puntuacion=" + puntuacion + ", precio=" + precio
				+ ", fecha=" + fecha + ", esSegundaMano=" + esSegundaMano + "]");
	}
	
	public void mostrarNombrePuntuacion() {
		System.out.println("Videojuego [nombre=" + nombre + 
							", puntuacion=" + puntuacion + "]");
	}
	
	public void mostrarPrecioEnLibras() {
		double precioEnLibras = this.precio * 0.86;
		System.out.println("El precio en libras es: " + precioEnLibras);
	}
	
	public void mostrarFechaInvertida() {
		String[] fechaPartida = this.fecha.split("/");
		//Esto me devuelve un array con 3 posiciones
		//posicion 0 = dia
		//posicion 1 = mes
		//posicion 2 = año
		String dia = fechaPartida[0];
		String mes = fechaPartida[1];
		String anio = fechaPartida[2];
		
		String fechaInvertida = anio + "-" + mes + "-" + dia;
		System.out.println(fechaInvertida);
	}
	
	public void mostrarFechaInvertidaSubstring() {
		String dia = this.fecha.substring(0,2);
		String mes = this.fecha.substring(3,5);
		String anio = this.fecha.substring(6,this.fecha.length());
		
		String fechaInvertida = anio + "-" + mes + "-" + dia;
		System.out.println(fechaInvertida);
	}
	
	public double calcularDescuento() {
		double precioConDecuento = this.precio;
		if(this.esSegundaMano) {
			precioConDecuento = this.precio * 0.7;
		}
		
		return precioConDecuento;
	}
	
	public void mostrarEsApto() {
		if(this.puntuacion >= 5) {
			System.out.println("El videojuego es apto");
		}else {
			System.out.println("El Videojuego NO es apto");
		}
	}
	
	public void mostrarPuntacionHastaElDiez() {
		int iPuntuacion = (int)this.puntuacion;
		for(int i = iPuntuacion; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	public boolean esMasCaro(Videojuego videojuego) {
		if(this.precio <= videojuego.precio) {
			return false;
		}else {
			return true;
		}
	}
	
	/**
	 * Este método compara el precio con el precio de otro objeto pasado por
	 * parámetro
	 * @param videojuego con el que vamos a comparar el precio
	 * @return Este método devuelve -1 si este objeto tiene el precio menor
	 * que el objeto que le pasemos, devuelve 0 en caso de que el
	 * precio sea igual y 1 en caso de que el precio sea mayor
	 */
	public int esMasCaroOIgual(Videojuego videojuego) {
		if(this.precio < videojuego.precio) {
			return -1;
		}else if( this.precio > videojuego.precio){
			return 1;
		}else {
			return 0;
		}
	}
}

package _12_ConstructoresYMetodos2;

public class Coche {
	
	long id;
	String marca;
	String modelo;
	double precioBase;
	String fechaDeMatriculacion;
	double kilometros;
	
	public Coche() {
		super();
		String marca = "";
		String modelo = "";
	}

	public Coche(int id, String marca, String modelo, double precioBase, String fechaDeMatriculacion, double kilometros) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.fechaDeMatriculacion = fechaDeMatriculacion;
		this.kilometros = kilometros;
	}

	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precioBase=" + precioBase + ", fechaDeMatriculacion=" + fechaDeMatriculacion + ", kilometros=" + kilometros + "]";
	}
	
	public void precioBase() {
		System.out.println("El precio base es " + this.precioBase);
	}
	
	public void anioDeMatriculacion() {
		System.out.println("Tu coche se matriculó en el año " + 
			this.fechaDeMatriculacion.substring(6, 10));
	}
	
	public void fechaBisiesto() {
		int añoDeMatriculacion = Integer.parseInt(this.fechaDeMatriculacion.substring(6,10));
		boolean esBisiesto = 
				añoDeMatriculacion % 4 == 0 
					&& (añoDeMatriculacion % 100 != 0 || añoDeMatriculacion % 400 == 0);
		if(esBisiesto) {
			System.out.println("El año es bisiesto");
		}else {
			System.out.println("El año NO es bisiesto");
		}
	}
	
	public double precio() {
		double precioBase = this.precioBase;
		if (this.kilometros > 10000 && this.kilometros < 50000) {
			precioBase = this.precioBase * 80 / 100;
		} else if (this.kilometros > 50000) {
			precioBase = this.precioBase / 2;
		}
		return precioBase;
	}
	
	public boolean esPrimo() {
		boolean esPrimo = true;
		int kilometros = (int)this.kilometros;
		
		if(kilometros <= 0) {
			return false;
		}
		
		for (int i = 2; i < kilometros; i++) {
			if (kilometros % i == 0) {
				esPrimo = false;
				break;
			}
		}
		
		return esPrimo;
	}
	
	public double faltaPara200000() {
		return 200000 - this.kilometros;
	}

	public int numeroDeCaracteres() {
		int numeroDeCaracteres = this.modelo.length() + this.marca.length();
		return numeroDeCaracteres;
	}
	
	public double diferenciaDeKM(Coche coche) {
		double diferenciaDeKM = this.kilometros - coche.kilometros;
		return diferenciaDeKM;
	}
	
	public boolean esMasCaro(Coche c) {
		if(this.precioBase <= c.precioBase) {
			return false;
		}else {
			return true;
		}
	}
	
	/**
	 * 
	 * @param c
	 * @return negativo si el precio del coche pasado es mayor, 0
	 * en caso de que sean iguales y positivo si el precio del 
	 * coche pasado es menor. El numero representa la diferencia
	 * del precio
	 */
	public double esMasCaroOIgual(Coche c) {
		return this.precioBase - c.precioBase;
	}
}

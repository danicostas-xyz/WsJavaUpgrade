package actividad25;

public class JefeProyecto extends Empleado {
	private double incentivos;
	
	
	public JefeProyecto(int id, String dni, String nombre, double sueldo, int aniosTrabajados) {
		super();
		setId(id);
		setDni(dni);
		setNombre(nombre);
		setSueldo(sueldo);
		setAniosTrabajados(aniosTrabajados);
	}
	
	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public String toString() {
		return "JefeProyecto [incentivos=" + incentivos + "id: " + this.getId() + "Nombre()=" + getNombre() + "]";
	}
	
	/**
	 * Metodo que devuelve el salario cuyo valor es
	 * el valor del atributo 'sueldo' + el valor del
	 * atributo 'incentivos' del objeto
	 * 
	 * @return devulve la variable salario, cuyo valor
	 * es la suma de los atributos 'sueldo' y 'incentivos'
	 */
	@Override
	public double calcularSalarioTotal() {
		double salario = this.getSueldo() + this.incentivos;
		return salario;
	}

	@Override
	public double calcularDespidoImporocedente(int aniosTrabajados) {
		double salario = this.calcularSalarioTotal();
		int porcentaje = 10 * aniosTrabajados;
		if(aniosTrabajados == 0) {
			return salario;
		}else {
			double total = salario * porcentaje;
			return total;
		}
	}
	
	
	
	
	
	
	

}

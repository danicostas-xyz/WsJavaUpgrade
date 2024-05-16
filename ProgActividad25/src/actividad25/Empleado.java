package actividad25;

public abstract class Empleado implements Despedible {
	private int id;
	private String dni;
	private String nombre;
	private double sueldo;
	private int aniosTrabajados;	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	/**
	 * Metodo que devuelve el salario cuyo valor es el
	 * valor del atributo 'sueldo' del objeto.
	 * @return devuelve el valor de la variable salario.
	 */
	public double calcularSalarioTotal() {
		double salario = this.sueldo;
		return salario;
	}

	public int getAniosTrabajados() {
		return aniosTrabajados;
	}
	public void setAniosTrabajados(int aniosTrabajados) {
		this.aniosTrabajados = aniosTrabajados;
	}
	
	@Override
	public double calcularDespidoProcedente() {
		double salario = this.calcularSalarioTotal();
		return salario;
	}
	
	
	

}

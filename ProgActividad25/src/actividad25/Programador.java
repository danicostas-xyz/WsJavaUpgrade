package actividad25;

public class Programador extends Empleado {

	
	public Programador(int id, String dni, String nombre, double sueldo, int aniosTrabajados) {
		super();
		setId(id);
		setDni(dni);
		setNombre(nombre);
		setSueldo(sueldo);
		setAniosTrabajados(aniosTrabajados);
	}
	
	@Override
	public String toString() {
		return "Programador [Id()=" + getId() + ", Dni()=" + getDni() + ", Nombre()=" + getNombre()
				+ ", Sueldo()=" + getSueldo() + ", toString()=" + super.toString() + ", SalarioTotal()="
				+ calcularSalarioTotal() + "]";
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

package actividad25;

import java.util.ArrayList;

public class Director extends Empleado {
	private ArrayList<Empleado> listaEmpleados;
	
	
	
	public Director(int id, String dni, String nombre, double sueldo, ArrayList<Empleado> listaEmpleados, int aniosTrabajados) {
		super();
		setId(id);
		setDni(dni);
		setNombre(nombre);
		setSueldo(sueldo);
		setListaEmpleados(listaEmpleados);
		setAniosTrabajados(aniosTrabajados);
	}

	
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "Director [listaEmpleados=" + listaEmpleados + "id=" + this.getId() + ", dni=" + this.getDni()+ ", nombre" 
				+ this.getNombre() + ", sueldo=" + this.getSueldo() + "]";
	}

	/**
	 * Metodo que devuelve el salario cuyo valor es
	 * el valor del atributo 'sueldo' del objeto + el
	 * valor de la variable contadorEmpleados cuyo
	 * valor aumenta en '100' por cada valor tenga
	 * en el atributo array 'listaEmpleados'. En caso
	 * de no tener ningun valor en el atributo
	 * 'listaEmpleados' el valor que devolvera sera
	 * el valor de el atributo 'sueldo' del objeto
	 * 
	 * @return devuelve el valor del atributo 'sueldo' del objeto 
	 * + la variable 'contadorEmpleados', en caso de que el atributo
	 * 'listaEmpleados' sea null, devolvera unicamente el valor del
	 * atributo 'sueldo'
	 */
	@Override
	public double calcularSalarioTotal() {
		int contadorEmpleados = 0;
		if(listaEmpleados != null) {
		for(Empleado s : listaEmpleados) {
			contadorEmpleados += 100;
		}
		double salario = this.getSueldo()+ contadorEmpleados;
		return salario;
		}else {
			return this.getSueldo();
		}
		
	}


	@Override
	public double calcularDespidoProcedente() {
		double salario = this.calcularSalarioTotal();
		return salario;
	}


	@Override
	public double calcularDespidoImporocedente(int aniosTrabajados) {
		double salario = this.calcularSalarioTotal();
		int porcentaje = 20 * aniosTrabajados;
		if(aniosTrabajados == 0) {
			return salario;
		}else {
		double total = salario * porcentaje;
		return total;
		}
	}
	
	
	
	
	
	
	

}
